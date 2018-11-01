package com.example.demo.database

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileInputStream
import java.io.FileOutputStream

class YinHang {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val fileName = "D:\\1024整理\\代码\\lgc\\src\\main\\java\\com\\example\\demo\\database\\工商银行.xlsx"
      val workbook = XSSFWorkbook(FileInputStream(fileName))
      val filename2 = "D:\\1024整理\\代码\\lgc\\src\\main\\java\\com\\example\\demo" +
          "\\database\\离退休教职工周转房第二期缴款名单.xlsx"
      val workbook2 = XSSFWorkbook(FileInputStream(filename2))
      val rowIterator2 = workbook2.getSheetAt(0)
      val rowIterator = workbook.getSheetAt(0)
      rowIterator.forEach {
        rowIterator2.forEach { row2 ->
//          println("${getCell(it, 2)},${getCell(row2, 2)}")
          if (getCell(it,2 ).trim() == getCell(row2, 2).trim()) {
            it.createCell(7).setCellValue(getCell(row2, 5))
            it.createCell(6).setCellValue(getCell(row2, 6))
            println("${getCell(it, 2)},${getCell(row2, 2)}")
          }
        }
      }
      workbook.write(FileOutputStream(fileName))
      workbook2.write(FileOutputStream(filename2))
      workbook.close()
      workbook2.close()
    }
  }
}