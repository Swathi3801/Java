package com.KGiSL.MavenProject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbccon {
    public static void main(String[] args) throws SQLException {

        // insertValues();
        // updateValues();
        // deleteValues();
        // displayValues();
        joinquery();
    }

    public static void displayValues() throws SQLException {

        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        Statement stmt = Con.createStatement();
        String select = "select user_id,username,password,email,first_name,last_name,user_type from users";
        ResultSet result = stmt.executeQuery(select);

        while (result.next()) {
            String userid = result.getString("user_id");
            String username = result.getString("username");
            String password = result.getString("password");
            String email = result.getString("email");
            String fname = result.getString("first_name");
            String lname = result.getString("last_name");
            String usertype = result.getString("user_type");
            System.out.println(userid + "," + username + "," + password + "," + email + ","
                    + fname + "," + lname + "," + usertype);
        }
        stmt.close();
        Con.close();
    }

    public static void insertValues() throws SQLException {
        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        Statement stmt = Con.createStatement();
        String Insert = "insert into users values"
                + "('15','Gobinath','123','gobinath@123','Gobi','Nath','Athlete'),"
                + "('16','Santhosh','123','Sathosh@123','Santhosh','Kumar','coach')";
        int res = stmt.executeUpdate(Insert);
        System.out.println(res);
        stmt.close();
        Con.close();

    }

    public static void updateValues() throws SQLException {
        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        Statement stmt = Con.createStatement();
        String Update = "Update users set user_type='Adminstrator' where  user_id=16";
        int res = stmt.executeUpdate(Update);
        System.out.println(res);
        stmt.close();
        Con.close();
    }

    public static void deleteValues() throws SQLException {
        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        Statement stmt = Con.createStatement();
        String delete = "Delete from users where user_id=1";
        int res = stmt.executeUpdate(delete);
        System.out.println(res);
        stmt.close();
        Con.close();
    }

    public static void joinquery() throws SQLException {
        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        Statement stmt = Con.createStatement();
        String str = "SELECT er.registration_id,es.event_name,us.username AS athlete_name,er.registration_date FROM event_registrations er\r\n"
                +
                "JOIN event_details es ON er.event_id=es.event_id\r\n" + //
                "JOIN athletes_table ath ON er.athlete_id=ath.athlete_id\r\n" + //
                "JOIN users us ON ath.user_id=us.user_id ";

        ResultSet Result = stmt.executeQuery(str);
        while (Result.next()) {
            String registration_id = Result.getString("registration_id");
            String event_name = Result.getString("event_name");
            String athlete_name = Result.getString("athlete_name");
            String registration_date = Result.getString("registration_date");
            System.out.println(registration_id + "   " + event_name + "   " + athlete_name + "  " + registration_date);
        }
    }
}
