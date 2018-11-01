package com.example.demo.database

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileInputStream
import java.io.FileOutputStream

class CheckZhong {
  companion object {
    fun checkTime(time: String): String {
      var sub: String
      if (time.endsWith(".")) sub = time.substring(0, time.length - 1)
      with(time) {
        return when {
          count { it == '.' } >= 2 -> {
            sub = substringBeforeLast(".")
            val subs = sub.split(".")
            threeDot(subs)
          }
          count { it == '.' } == 1 -> threeDot(split("."))
          length == 8 || length == 6 -> substring(0, 4) + "." + substring(4, 6)
          else -> {
            this
          }
        }
      }
    }

    private fun threeDot(s: List<String>): String {
      val nian: String = if ((s[0].startsWith("0") || s[0].startsWith("1"))
          && s[0].length == 2) {
        "20" + s[0]
      } else if (!s[0].startsWith("19") && s[0].length == 2) {
        "19" + s[0]
      } else {
        s[0]
      }
      val yue: String = if (s[1].length == 1) {
        "0" + s[1]
      } else {
        s[1]
      }
      return "$nian.$yue"
    }

    @JvmStatic
    fun main(args: Array<String>) {
      val fileName = "C:\\Users\\dyz\\Desktop\\lgc\\src" +
          "\\main\\java\\com\\example\\demo\\database\\离退休人员花名册.xlsx"
      val workbook = XSSFWorkbook(FileInputStream(fileName))
      val sheet = workbook.getSheetAt(0)
      sheet.forEach {
        if (it.getCell(5) != null && it.getCell(6) != null && it.getCell(7) != null) {
          val time1 = getCell(it, 5).trim().replace("-", ".")
          val time2 = getCell(it, 6).trim().replace("-", ".")
          val time3 = getCell(it, 7).trim().replace("-", ".")
          println("$time1,$time2,$time3" + "change to====>" + "${checkTime(time1)},${checkTime(time2)},${checkTime(time3)}")
          it.getCell(5).setCellValue(checkTime(time1))
          it.getCell(6).setCellValue(checkTime(time2))
          it.getCell(7).setCellValue(checkTime(time3))
        }
      }
      workbook.write(FileOutputStream(fileName))
      workbook.close()
    }
  }
}