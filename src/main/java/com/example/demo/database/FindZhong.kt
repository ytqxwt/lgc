package com.example.demo.database

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileInputStream
import java.io.FileOutputStream
import java.sql.*

class FindZhong {
  companion object {

    @JvmStatic
    fun main(args: Array<String>) {
      Class.forName("com.mysql.jdbc.Driver")
      val conn: Connection = DriverManager.getConnection("jdbc:mysql://120.79.68.208:3306/Retirement_management_system", "root", "dyz13125219151YT")
      val rs1 = conn.createStatement().executeQuery("select * from Retirement_management_system.info_new ")
      val fileName = "C:\\Users\\dyz\\Desktop\\lgc\\src\\main\\java\\com\\example\\demo\\database\\花名单.xls"
      val workbook = XSSFWorkbook()
      val sheet = workbook.createSheet()
      var i = 0;
      while (rs1!!.next()) {
        val row = sheet.createRow(i)
        row.createCell(0).setCellValue(rs1.getString("base_name"))
        row.createCell(1).setCellValue(rs1.getString("base_sex"))
        row.createCell(2).setCellValue("退休")
        row.createCell(3).setCellValue(rs1.getString("base_sheng_ri"))
        row.createCell(4).setCellValue(rs1.getString("work_kai_shi_gong_zuo"))
        row.createCell(5).setCellValue(rs1.getString("work_ti_qian_tui_xiu"))
        row.createCell(5).setCellValue(rs1.getString("work_zheng_shi_tui_xiu"))
        row.createCell(5).setCellValue(rs1.getString("work_zhi_cheng"))
        i++
      }
      workbook.write(FileOutputStream(fileName))
      workbook.close()
    }
  }
}