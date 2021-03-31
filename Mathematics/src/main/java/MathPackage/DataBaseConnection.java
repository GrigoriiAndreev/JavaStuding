package MathPackage;
//import com.mysql.fabric.jdbc.FabricMySQLDriver;

//import com.mysql.jdbc.Driver;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConnection {

    public static void main(String[] args) throws SQLException {
        // Data to access
        String userName = "u1029682_integral";
        String password = "123qweQWE";
        String url = "jdbc:mysql://144.76.132.238:3306/db1029682_integral";
        String query = "select * from dqope_users";

        List<MagazinIntegralUsers> users = new ArrayList<>();

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
//        System.out.println(user1.getId() + " " + user1.getName() + " " + user1.getUsername() + " " + user1.getEmail());

        for (MagazinIntegralUsers mag : users) {
            System.out.println(mag.getId() + " " + mag.getName() + " " + mag.getUsername() + " " + mag.getEmail());
        }

    }
}
