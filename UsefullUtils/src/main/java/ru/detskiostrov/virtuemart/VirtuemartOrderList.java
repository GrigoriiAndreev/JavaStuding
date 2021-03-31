package ru.detskiostrov.virtuemart;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import ru.detskiostrov.addresses.ClientsAddressBook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class contain the orders for Virtuemart
 * Author: Grigorii Andreev
 * Data: 12 March 2021
 */

public class VirtuemartOrderList {

    //Data to extract users list from Virtuemart shops
    private static final String shopDBAdminLogin = JoonlaAccesCredentionals.shopDBAdminLogin;
    private static final String shopDBAdminPassword = JoonlaAccesCredentionals.shopDBAdminPassword;
    private static final String shopDBIP = JoonlaAccesCredentionals.shopDBIP;
    private static final String shopDBName = JoonlaAccesCredentionals.shopDBName;
    private static final String dbTableName = JoonlaAccesCredentionals.dbTableName;
    private static final String extractedDataFolder = JoonlaAccesCredentionals.extractedDataFolder;
    private static final String extractedDataExcelFileName = "db_" + shopDBName + "_orders_list.xls";
    static final String shopDBUrl = "jdbc:mysql://" + shopDBIP + ":3306/" + shopDBName;;

    private static final String dbSQLQueryToGetOrdersList = "SELECT " +
            "orszw_virtuemart_order_items.virtuemart_order_id, " +
            "orszw_virtuemart_order_items.virtuemart_product_id, " +
            "orszw_virtuemart_order_items.order_item_name," +
            "orszw_virtuemart_order_items.product_quantity, " +
            "orszw_virtuemart_order_items.product_item_price," +
            "orszw_virtuemart_order_items.order_status," +
//            "orszw_virtuemart_order_items.created_on, " +
//            "orszw_virtuemart_order_items.order_item_sku " +
//            "orszw_virtuemart_orders.order_number" +
            " FROM orszw_virtuemart_order_items" +
//            " WHERE orszw_virtuemart_order_items.virtuemart_order_id = orszw_virtuemart_orders.virtuemart_order_id AND" +
            "WHERE" +
            " DATE(`orszw_virtuemart_order_items`.`created_on`) BETWEEN '2021-01-01 00:00:00' AND '2021-03-31 23:00:00'" +
            " #AND  orszw_virtuemart_product_manufacturers.virtuemart_product_id = orszw_virtuemart_order_items.virtuemart_product_id;";

    //Fields names suites the Joomla/Virtuemart db names
    int virtuemartOrderId;
    int virtuemartProductId;
    String orderItemName;
    int productQuantity;
    float productItemPrice;
    String orderStatus;
    Date createdOn;
    String orderItemSku;
    String orderNumber;     //Internal order number, may be customized

    static List<VirtuemartOrderList> virtuemartOrderList = new ArrayList();
    static VirtuemartOrderList virtuemartSingleOrder = new VirtuemartOrderList();

    public static void connectToDBOrdersList(String shopDBUrl, String shopDBAdminLogin, String shopDBAdminPassword) throws SQLException {

        //Establish the connection
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        try (Connection connection = DriverManager.getConnection(shopDBUrl, shopDBAdminLogin, shopDBAdminPassword);
             Statement statement = connection.createStatement()) {
            System.out.println("The connection to DB is established!");
            ResultSet resultSet = statement.executeQuery(dbSQLQueryToGetOrdersList);

            while (resultSet.next()) {
                virtuemartSingleOrder.virtuemartOrderId = resultSet.getInt(1);
                virtuemartSingleOrder.virtuemartProductId = resultSet.getInt(2);
                virtuemartSingleOrder.orderItemName = resultSet.getString(3);
                virtuemartSingleOrder.productQuantity = resultSet.getInt(4);
                virtuemartSingleOrder.productItemPrice = resultSet.getFloat(5);
                virtuemartSingleOrder.orderStatus = resultSet.getString(6);
                virtuemartSingleOrder.createdOn = resultSet.getDate(7);
                virtuemartSingleOrder.orderItemSku = resultSet.getString(8);
                virtuemartSingleOrder.orderNumber = resultSet.getString(9);
                virtuemartOrderList.add(virtuemartSingleOrder);

//                System.out.println(resultSet.getString(5) + " " + resultSet.getString(24) + " "
//                        + resultSet.getString(34) + " " +resultSet.getString(42));

//                users.add(user1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//        System.out.println("Show all users");

    }
    public static void safeVirtuemartOrderListToExcelFile() {

        // Create Excel variable
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Orders list");

        // Counter for lines
        int rowNum = 0;

        // Create 0-th row (the columns names)
        Row row = sheet.createRow(rowNum);

        row.createCell(0).setCellValue("virtuemartOrderId");
        row.createCell(1).setCellValue("virtuemartProductId");
        row.createCell(2).setCellValue("orderItemName");
        row.createCell(3).setCellValue("productQuantity");
        row.createCell(4).setCellValue("productItemPrice");
        row.createCell(5).setCellValue("orderStatus");
        row.createCell(6).setCellValue("createdOn");
        row.createCell(7).setCellValue("orderItemSku");
        row.createCell(8).setCellValue("orderNumber");

        //Fill all lines for exel result table
        rowNum = 1;
        for (VirtuemartOrderList clients : virtuemartOrderList) {
            Row row1 = sheet.createRow(rowNum);

            row1.createCell(0).setCellValue(clients.virtuemartOrderId);
            row1.createCell(1).setCellValue(clients.virtuemartProductId);
            row1.createCell(2).setCellValue(clients.orderItemName);
            row1.createCell(3).setCellValue(clients.productQuantity);
            row1.createCell(4).setCellValue(clients.productItemPrice);
            row1.createCell(5).setCellValue(clients.orderStatus);
            row1.createCell(6).setCellValue(clients.createdOn);
            row1.createCell(7).setCellValue(clients.orderItemSku);
            row1.createCell(8).setCellValue(clients.orderNumber);

            rowNum++;
        }

        // Safe extracted data to xls file
        try (FileOutputStream out = new FileOutputStream(new File(extractedDataFolder + extractedDataExcelFileName))) {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel file is created!");

    }

    public static void main(String[] args) throws SQLException {

        System.out.println("Connecting to DB");

        //Extract users from Joomla/Virtuemart shop
        connectToDBOrdersList(shopDBUrl, shopDBAdminLogin, shopDBAdminPassword);
        safeVirtuemartOrderListToExcelFile();

    }


}
