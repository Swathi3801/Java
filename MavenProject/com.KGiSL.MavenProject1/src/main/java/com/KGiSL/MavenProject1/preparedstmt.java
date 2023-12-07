package com.KGiSL.MavenProject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class preparedstmt {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        insertValues();
        updateValues();
        deleteValues();
        displayValues();
        // joinquery();
    }

    public static void displayValues() throws SQLException {

        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        String select = "select user_id,username,password,email,first_name,last_name,user_type from users where username like ? and user_type=?";
        PreparedStatement stmt = Con.prepareStatement(select);
        stmt.setString(1, "s%");
        stmt.setString(2, "adminstrator");

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
        String Insert = "insert into users (user_id,username,password,email,first_name,last_name,user_type) values (?,?,?,?,?,?,?)";
        PreparedStatement stmt = Con.prepareStatement(Insert);

        stmt.setInt(1, 15);
        stmt.setString(2, "Santhosh");
        stmt.setString(3, "123");
        stmt.setString(4, "santhosh@123");
        stmt.setString(5, "santhosh");
        stmt.setString(6, "kumar");
        stmt.setString(7, "coach");
        stmt.addBatch();

        stmt.setInt(1, 16);
        stmt.setString(2, "Sathish");
        stmt.setString(3, "123");
        stmt.setString(4, "Sathish@123");
        stmt.setString(5, "Sathish");
        stmt.setString(6, "kumar");
        stmt.setString(7, "Athlete");
        stmt.addBatch();

        int[] res = stmt.executeBatch();
        System.out.println(res);
        stmt.close();
        Con.close();

    }

    public static void updateValues() throws SQLException {
        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        String Update = "Update users set user_type=? where  user_id=?";
        PreparedStatement stmt = Con.prepareStatement(Update);
        stmt.setString(1, "adminstrator");
        stmt.setString(2, "15");
        int res = stmt.executeUpdate();
        System.out.println(res);
        stmt.close();
        Con.close();
    }

    public static void deleteValues() throws SQLException {
        Connection Con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Swathi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        String delete = "Delete from users where user_id=? ";
        PreparedStatement stmt = Con.prepareStatement(delete);
        stmt.setInt(1, 15);
        int res = stmt.executeUpdate();
        System.out.println(res);
        stmt.close();
        Con.close();
    }

}
