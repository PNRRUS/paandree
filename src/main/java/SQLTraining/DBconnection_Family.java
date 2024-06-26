package SQLTraining;

import java.sql.*;

public class DBconnection_Family {

        public static void main(String[] Args) throws SQLException {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/internetbookstore", "root", "Universum1");

            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(
                    "SELECT * FROM " +
                            "body LEFT OUTER JOIN family_member  ON family_member_id = body_id " +
                            "LEFT OUTER JOIN characteristics ON family_member_id = family_members ");

            System.out.println();

            ResultSetMetaData metaData = results.getMetaData();
            int columnCount = metaData.getColumnCount();
            //System.out.println(columnCount);


            for (int column = 1; column <= columnCount; column++)
            {
                String name = metaData.getColumnName(column);
               // String typeName = metaData.getColumnTypeName(column);
                System.out.printf("%-21s",name);// + typeName //+ '\n'
            }
            System.out.println();

            for (int column = 1; column < 16 * 21; column++){
                System.out.print("-");
            }
            System.out.println();
            while (results.next()) {

                String one = results.getString(1);
                String two = results.getString(2);
                int three = results.getInt(3);
                int four = results.getInt(4);
                int five = results.getInt(5);
                int six = results.getInt(6);
                String seven = results.getString(7);
                String eight = results.getString(8);
                String nine = results.getString(9);
                String ten = results.getString(10);
                int eleven = results.getInt(11);
                int twelve = results.getInt(12);
                int thirteen = results.getInt(13);
                String fourteen = results.getString(14);
                String fifteen = results.getString(15);
                String sixteen = results.getString(16);
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s",
                 one,two,three,four,five,six,seven,eight,nine,ten,eleven,
                 twelve,thirteen,fourteen,fifteen,sixteen);
                System.out.println();
            }

            for (int i = 1; i < 16 * 21; i++){
                System.out.print("-");
            }
        }
    }


