package SQLTraining;

import java.sql.*;

public class dbconnnectionBatia {
    public static void main(String[] Args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/internetbookstore", "root", "Universum1");

        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(
                "SELECT name,weight from body LEFT OUTER JOIN family_member  ON family_member_id = body_id " +
                        "LEFT OUTER JOIN characteristics ON family_member_id = family_members " +
                        "WHERE weight = (SELECT max(weight) from body)");




        while (results.next()) {
            String one = results.getString(1);
            String two = results.getString(2);
            System.out.println(
                     "\t" + one + " самый тяжелый из всех - "
                     + two + "кг, не я такой, жизнь такая"
            );
        }
    }


}

