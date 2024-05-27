package SQLTraining;

import java.sql.*;

public class DBconnection {


        public static void main(String[] Args) throws SQLException {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world", "root", "Universum1");

            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(
                        "SELECT Name, Region, Population " +
                            "FROM country " +
                            "WHERE Region = 'Western Europe' " +
                            "ORDER BY Population ASC");

            while (results.next()) {
//                Integer id = results.getInt(1);
                String one = results.getString(1);
                String two = results.getString(2);
                Integer three = results.getInt(3);
//                String two = results.getString(3);
//                Double three = results.getDouble(4);
//                Integer four = results.getInt(5);

                System.out.println(results.getRow() + ". "
                        + "\t" + one
                         + "\t" + two
                        + "\t" + three);
//                        + "\t" + four);+ id
            }


        }
    }


