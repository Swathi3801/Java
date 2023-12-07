package com.KGiSL.MavenProject1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class callablestmt {
    public static void main(String[] args) throws SQLException {

        //insertValues();
         //updateValues();
        deleteValues();
        // displayValues();
        // displayin();
        // joinquery();
    }

    public static void displayValues() throws SQLException {

        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        String select = "{call getuser()}";
        CallableStatement stmt = Con.prepareCall(select);

        ResultSet result = stmt.executeQuery();

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

    public static void displayin() throws SQLException {

        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        String select = "{CALL getinn(13)}";
        CallableStatement stmt = Con.prepareCall(select);

        ResultSet result = stmt.executeQuery();

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
        String select = "{CALL insertuser2()}";
        CallableStatement stmt = Con.prepareCall(select);
        int result = stmt.executeUpdate(select);
        System.out.println(result);
        stmt.close();
        Con.close();

    }

    public static void updateValues() throws SQLException {
        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        String Update = "{call updateusers(22)}";
        PreparedStatement stmt = Con.prepareStatement(Update);
        int result = stmt.executeUpdate();
        System.out.println(result);
        stmt.close();
        Con.close();
    }

    public static void deleteValues() throws SQLException {
        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        String delete = "{call deleteuser(22)} ";
        PreparedStatement stmt = Con.prepareStatement(delete);
        int res = stmt.executeUpdate();
        System.out.println(res);
        stmt.close();
        Con.close();
    }

}
