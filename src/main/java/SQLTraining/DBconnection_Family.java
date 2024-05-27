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




            while (results.next()) {
//                Integer id = results.getInt(1);
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
                System.out.println(results.getRow() + ". "
                        + "\t" + one
                        + "\t" + two
                        + "\t" + three
                        + "\t" + four
                        + "\t" + five
                        + "\t" + six
                        + "\t" + seven
                        + "\t" + eight
                        + "\t" + "\t" + nine
                        + "\t" + "\t" + ten
                        + "\t" + eleven
                        + "\t" + twelve
                        + "\t" + thirteen
                        + "\t" + fourteen
                        + "\t" + fifteen
                        + "\t" + sixteen
                );
            }


        }
    }


