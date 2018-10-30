package com.example.demo.database

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.hssf.util.HSSFColor
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.awt.Color
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement

class FirstSecond {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val fileName = "C:\\Users\\dyz\\Desktop\\lgc\\src\\main\\java" +
          "\\com\\example\\demo\\database\\离退休教职工周转房第二期缴款名单（正式上交表）.xlsx"
      val workbook = XSSFWorkbook(FileInputStream(fileName))
      val filename2 = "C:\\Users\\dyz\\Desktop\\lgc\\src\\main\\java\\com" +
          "\\example\\demo\\database\\第一期交款人数及金额.xlsx"
      val workbook2 = XSSFWorkbook(FileInputStream(filename2))
      val rowIterator2 = workbook2.getSheetAt(0)
      val rowIterator = workbook.getSheetAt(0)
      //第一期有,第二期没有的
      rowIterator2.forEach { row2 ->
        var flag = 0
        rowIterator.forEach {
          //          println("${it.getCell(2)},${row2.getCell(2)}")
          if (getCell(it, 2).trim() == getCell(row2, 2).trim() ) {
            flag = 1
          }
        }
        if (flag == 0&& (getCell(row2, 0) == "离退休管理处"
            || getCell(row2, 0) == "离退休人员" || getCell(row2, 0) == "离退休管理处")) {
          println("====================\n第一期有,第二期没有的\n================")
          row2.createCell(6).setCellValue("第一期有,第二期没有的")
        } else {
          row2.createCell(6).setCellValue("")
          flag = 0;
        }
      }
      workbook2.write(FileOutputStream(filename2))
      workbook2.close()
    }
  }
}