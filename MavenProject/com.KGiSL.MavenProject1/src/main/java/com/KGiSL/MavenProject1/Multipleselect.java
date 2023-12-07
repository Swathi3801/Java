package com.KGiSL.MavenProject1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Multipleselect {
    public static void main(String args[]) throws SQLException {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");

        CallableStatement Stmt = con.prepareCall("{CALL getalluserr()}");

        ResultSet result1 = Stmt.executeQuery();

        System.out.println("Contents of the first result1-set");

        while (result1.next()) {
            String userid = result1.getString("user_id");

            String username = result1.getString("username");

            String password = result1.getString("password");

            String email = result1.getString("email");

            String fname = result1.getString("first_name");

            String lname = result1.getString("last_name");

            String usertype = result1.getString("user_type");

            System.out.println(userid + "," + username + "," + password + "," + email + ","

                    + fname + "," + lname + "," + usertype);
        }

        Stmt.getMoreResults();

        System.out.println();
        System.out.println("Contents of the second result2-set");

        ResultSet result2 = Stmt.getResultSet();

        while (result2.next()) {

            String EVENT_ID = result2.getString("EVENT_ID");

            String EVENT_NAME = result2.getString("EVENT_NAME");

            String EVENT_DATE = result2.getString("EVENT_DATE");

            String LOCATION = result2.getString("LOCATION");

            String DESCRIPTION = result2.getString("DESCRIPTION");

            System.out.println(EVENT_ID + "  " + EVENT_NAME + "  " + EVENT_DATE + "  " + LOCATION + "  " + DESCRIPTION);
        }

        Stmt.getMoreResults();

        System.out.println();
        System.out.println("Contents of the third result3-set");

        ResultSet result3 = Stmt.getResultSet();

        while (result3.next()) {

            String athlete_id = result3.getString("athlete_id");

            String user_id = result3.getString("user_id");

            String date_of_birth = result3.getString("date_of_birth");

            String gender = result3.getString("gender");

            String contact_number = result3.getString("contact_number");

            String address = result3.getString("address");

            String emergency_contact = result3.getString("emergency_contact");

            System.out.println(athlete_id + "  " + user_id + "  " + date_of_birth + "  " + gender + "  "
                    + contact_number + " " + address + " " +
                    emergency_contact);

        }

    }
}
