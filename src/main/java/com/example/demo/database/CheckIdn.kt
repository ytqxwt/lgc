package com.example.demo.database

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.sql.*

class CheckIdn {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      var conn: Connection? = null
      val stmt: Statement? = null
      var rs1: ResultSet? = null
      val rs2: ResultSet? = null
      val rs3: ResultSet? = null
      val fileName = "C:\\Users\\dyz\\Desktop\\lgc\\src\\main\\java\\com\\example\\demo\\database\\离退休人员统计表截至2018年10月9日.xls"
      val workbook = HSSFWorkbook(FileInputStream(fileName))
      val rowIterator = workbook.getSheetAt(0)
      val fileName2 = "C:\\Users\\dyz\\Desktop\\lgc\\src\\main\\java\\com\\example\\demo\\database\\2013年以来退休人员.xlsx"
      val workbook2 = XSSFWorkbook(FileInputStream(fileName2))

      try {
        Class.forName("com.mysql.jdbc.Driver")
        conn = DriverManager.getConnection("jdbc:mysql://120.79.68.208:3306/Retirement_management_system", "root", "dyz13125219151YT")
        rs1 = conn!!.createStatement().executeQuery("select * from Retirement_management_system.info_new ")
        while (rs1!!.next()) {
          val sfz = rs1.getString("base_shen_fen_zheng")
          rowIterator.forEach {
            val rowIterator2 = workbook.getSheetAt(0)
            var name = getCell(it, 1)
            name = name.replace("女", "").trim()
            if (it.getCell(59) != null && it.getCell(1) != null && it != null) {
              it.getCell(1).setCellValue(name)
              if (name == rs1.getString("base_name")) {
                it.getCell(59).setCellValue(sfz)
                println("$name,$sfz")
              }
            }
          }
        }
        workbook.write(FileOutputStream(File(fileName)))
        workbook.close()
      } catch (e: ClassNotFoundException) {
        e.printStackTrace()
      } catch (e: SQLException) {
        e.printStackTrace()
      } finally {
        try {
          conn?.close()
        } catch (se: SQLException) {
          se.printStackTrace()
        }
      }

    }

  }


}