package com.example.demo.database;

import java.sql.*;

public class Deletesfz {
  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://120.79.68.208:3306/Retirement_management_system", "root", "dyz13125219151YT");
      rs1 = conn.createStatement().executeQuery("select * from Retirement_management_system.info_new ");
      while (rs1.next()) {
        String xm = rs1.getString("base_shen_fen_zheng");
        xm = xm.replaceAll("身份证", "");
        conn.createStatement().execute("update Retirement_management_system.info_new set base_shen_fen_zheng='" + xm + "' where id=" + rs1.getInt("id"));
      }
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (conn != null)
          conn.close();
      } catch (SQLException se) {
        se.printStackTrace();
      }
    }

  }
}
