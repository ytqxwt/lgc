package com.example.demo.database

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.DateUtil
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement

fun getCell(r: Row, i: Int): String {
  val cell = r.getCell(i)

  var cellValue = ""

  if (cell != null) {
    cell.setCellType(CellType.STRING)
    cellValue = cell.richStringCellValue.string
//    when (cell.cellType) {
//      cellValue = cell.richStringCellValue.string
//      Cell.CELL_TYPE_STRING -> cellValue = cell.richStringCellValue.string
//      Cell.CELL_TYPE_NUMERIC -> if (DateUtil.isCellDateFormatted(cell)) {
//        cellValue = cell.dateCellValue.toString()
//      } else {
//        cellValue = cell.numericCellValue.toString()
//      }
//      Cell.CELL_TYPE_BOOLEAN -> cellValue = cell.booleanCellValue.toString()
//      Cell.CELL_TYPE_FORMULA -> cellValue = cell.cellFormula.toString()
//      Cell.CELL_TYPE_BLANK -> {
//      }
//    }
  }
  return cellValue
}


class SfzExcute {

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
      val fileName = "C:\\Users\\dyz\\Desktop\\lgc\\src\\main\\java\\com" +
          "\\example\\demo\\database\\第一期交款人数及金额.xlsx"
      val workbook = XSSFWorkbook(FileInputStream(fileName))
      val fileName2 = "C:\\Users\\dyz\\Desktop\\lgc\\src\\main\\java\\com" +
          "\\example\\demo\\database\\2013年以来退休人员.xlsx"
      val workbook2 = XSSFWorkbook(FileInputStream(fileName2))
      val rowIterator = workbook.getSheetAt(0)
      rowIterator.forEach { r ->
        val rowIterator2 = workbook2.getSheetAt(0)
        rowIterator2.forEach { r2 ->
          val name = getCell(r, 2)
          val name2 = getCell(r2, 1)
          val bumen = getCell(r, 0)
          if (name == name2) {
            if (bumen != "离退休人员" && bumen != "班级名称") {
              r.createCell(5).setCellValue("${getCell(r2, 2)}退休")
              println("$name,$name2,$bumen")
            }
          }
        }
      }
      workbook.write(FileOutputStream(File(fileName)))
      workbook2.write(FileOutputStream(File(fileName2)))
      workbook.close()
      workbook2.close()
    }
  }
}