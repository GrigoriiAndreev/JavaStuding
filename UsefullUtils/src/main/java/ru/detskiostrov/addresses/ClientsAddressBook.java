package ru.detskiostrov.addresses;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used for storing clients list from magazin-integral.ru
 * Author: Grigorii Andreev
 * Data: 11 March 2011
 */
public class ClientsAddressBook {

    private static final String userName = "u1029682_integral";
    private static final String password = "123qweQWE";
    private static final String url = "jdbc:mysql://144.76.132.238:3306/db1029682_integral";
    private static final String query = "select * from dqope_users";

    List<ClientsAddressBook> users = new ArrayList<>();

    int id;
    String email;
    String telephone;
    String purchasesNumber;
    Date lastPurchase;

    public ClientsAddressBook(int id, String email, String telephone, String purchasesNumber, Date lastPurchase) {
        this.id = id;
        this.email = email;
        this.telephone = telephone;
        this.purchasesNumber = purchasesNumber;
        this.lastPurchase = lastPurchase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPurchasesNumber() {
        return purchasesNumber;
    }

    public void setPurchasesNumber(String purchasesNumber) {
        this.purchasesNumber = purchasesNumber;
    }

    public Date getLastPurchase() {
        return lastPurchase;
    }

    public void setLastPurchase(Date lastPurchase) {
        this.lastPurchase = lastPurchase;
    }

    public void connectToDB(String url, String userName, String password) {

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement();) {
            System.out.println("We are connected");
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                MagazinIntegralUsers user1 = new MagazinIntegralUsers();
                user1.setId(resultSet.getInt(1));
                user1.setName(resultSet.getString(2));
                user1.setUsername(resultSet.getString(3));
                user1.setEmail(resultSet.getString(4));
                users.add(user1);
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " "
                        + resultSet.getString(3) + " " +resultSet.getString(4));

//                users.add(user1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Show all users");

    }

    public static void main(String[] args) {

    }
}
