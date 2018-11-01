package com.example.demo.database

import org.apache.poi.hssf.model.InternalWorkbook
import org.apache.poi.hssf.usermodel.HSSFRow
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.hssf.util.HSSFColor
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement

class XwExcute {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      var conn: Connection? = null
      val stmt: Statement? = null
      var rs1: ResultSet? = null
      val rs2: ResultSet? = null
      val rs3: ResultSet? = null
//      Class.forName("com.mysql.jdbc.Driver")
//      conn = DriverManager.getConnection("jdbc:mysql://120.79.68.208:3306/Retirement_management_system", "root", "dyz13125219151YT")
      val fileName = "C:\\Users\\dyz\\Desktop\\lgc\\src\\main\\java\\com\\example\\demo\\database" +
          "\\离退休人员统计表截至2018年10月9日.xls"
      val workbook = HSSFWorkbook(FileInputStream(fileName))
      val workbook2 = HSSFWorkbook()
      val rowIterator2 = workbook2.createSheet()
      val rowIterator = workbook.getSheetAt(0)
      var i = 0
      rowIterator.forEach {
        if (it != null) {
          val xw = getCell(it, 44)
          val dz = getCell(it, 45)
          if (xw == "校外组" || xw == "外地" || xw == "西校区校外") {
            println("${getCell(it, 1)},$xw,$dz,${getCell(it, 47)}," +
                "${getCell(it, 48)},${getCell(it, 49)},${getCell(it, 52)}," +
                "${getCell(it, 59)}")
            val row = rowIterator2.createRow(i)
            var name = getCell(it, 1)
            name = name.replace("女", "").trim()
            row.createCell(0).setCellValue(name)
            row.createCell(1).setCellValue(xw)
            row.createCell(2).setCellValue(dz)
            row.createCell(3).setCellValue(getCell(it, 47))
            row.createCell(4).setCellValue(getCell(it, 48))
            row.createCell(5).setCellValue(getCell(it, 49))
            row.createCell(6).setCellValue(getCell(it, 52))
            row.createCell(7).setCellValue(getCell(it, 59))
            i++
          } else {

          }
        }
      }
      workbook2.write(FileOutputStream(File("C:\\Users\\dyz\\Desktop\\lgc\\src\\main\\java\\com\\example\\demo\\database" +
          "\\校外.xls")))
      workbook2.close()
    }
  }


}