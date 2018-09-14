package com.example.demo.controller.baseController;

import com.example.demo.domain.entity.User;
import com.example.demo.domain.vo.JsonResult;
import com.example.demo.domain.vo.MultipleRegex;
import com.example.demo.repos.UserRepos;
import com.example.demo.util.MD5Utils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
  private final UserRepos userRepos;

  @Autowired
  public UserController(UserRepos userRepos) {
    this.userRepos = userRepos;
  }

  @RequestMapping(value = "/set", produces = {"application/json"})
  public String set(@RequestParam("name") String name,
                    @RequestParam("password") String password) throws Exception {
    MD5Utils.encrypt(password, "12345678");
    System.out.println(MD5Utils.encrypt(password, "12345678"));
    return new JsonResult(1, "").toString();
  }

  @RequestMapping(value = "/login", produces = {"application/json"})
  public String login(@RequestParam("name") String name,
                      @RequestParam("password") String password) throws Exception {
    User u = userRepos.findByNameEquals(name);
    if (u == null) {
      return new JsonResult(2, "用户不存在").toString();
    }
    if (u.getAble().equals("否")) {
      return new JsonResult(3, "用户被禁止").toString();
    }
    if (!password.equals(MD5Utils.decrypt(u.getPassword(), "12345678"))) {
      return new JsonResult(1, "密码错误").toString();
    }
    return new JsonResult(0, "").toString();
  }
}

//
//  @RequestMapping(value = "/export2excel", produces = {"application/json"})
//  public String export2excel(MultipleRegex mr) {
////    // 第一步，创建一个webbook，对应一个Excel文件
////    HSSFWorkbook wb = new HSSFWorkbook();
////    // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
////    HSSFSheet sheet = wb.createSheet("充值表");
////    sheet.setColumnWidth(0, 20 * 256);
////    sheet.setColumnWidth(1, 20 * 256);
////    sheet.setColumnWidth(2, 20 * 256);
////    sheet.setColumnWidth(3, 20 * 256);
////    sheet.setColumnWidth(4, 20 * 256);
////    sheet.setColumnWidth(5, 20 * 256);
////    sheet.setColumnWidth(6, 20 * 256);
////    sheet.setColumnWidth(7, 20 * 256);
////    sheet.setColumnWidth(8, 20 * 256);
////    sheet.setColumnWidth(9, 20 * 256);
////    sheet.setColumnWidth(10, 20 * 256);
////    sheet.setColumnWidth(11, 20 * 256);
////
////    // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
////    HSSFRow row = sheet.createRow((int) 0);
////    // 第四步，创建单元格，并设置值表头 设置表头居中
////    HSSFCellStyle style = wb.createCellStyle();
////
////    HSSFCell cell = row.createCell((short) 0);
////    cell.setCellValue("充值订单号");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 1);
////    cell.setCellValue("订单状态");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 2);
////    cell.setCellValue("充值账户");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 3);
////    cell.setCellValue("企业编号");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 4);
////    cell.setCellValue("企业名称");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 5);
////    cell.setCellValue("总金额");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 6);
////    cell.setCellValue("充值金额");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 7);
////    cell.setCellValue("手续费");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 8);
////    cell.setCellValue("激活时间");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 9);
////    cell.setCellValue("备注");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 10);
////    cell.setCellValue("创建时间");
////    cell.setCellStyle(style);
////    cell = row.createCell((short) 11);
////    //写入数据
////    List excellist = tCompanyChargeOrderDao.getByList();
////    //循环放值
////    for(int i=0;i<excellist.size();i++){
////      row = sheet.createRow((int) i + 1);
////      TCompanyChargeOrder tcharge = (TCompanyChargeOrder)excellist.get(i);
////      //放入相应的数据
////      row.createCell((short) 0).setCellValue((double) tcharge.getId());
////      row.createCell((short) 1).setCellValue(tcharge.getOrderState());
////      row.createCell((short) 2).setCellValue(tcharge.getUsername());
////      row.createCell((short) 3).setCellValue(tcharge.getCompanyNo());
////      row.createCell((short) 4).setCellValue(tcharge.getCompanyName());
////      row.createCell((short) 5).setCellValue(tcharge.getTotalAmount().toString());
////      row.createCell((short) 6).setCellValue(tcharge.getChargeAmount().toString());
////      row.createCell((short) 7).setCellValue(tcharge.getChargeFee().toString());
////      row.createCell((short) 8).setCellValue(DateToStr(tcharge.getActiveTime()));
////      row.createCell((short) 9).setCellValue(tcharge.getRemark());
////      row.createCell((short) 10).setCellValue(DateToStr(tcharge.getCreatedTime()));
////      //存放位置
//    HSSFWorkbook workbook = new HSSFWorkbook();// 创建一个Excel文件
//    HSSFSheet sheet = workbook.createSheet();// 创建一个Excel的Sheet
//    sheet.createFreezePane(1, 3);// 冻结
//    // 设置列宽
//    sheet.setColumnWidth(0, 1000);
//    sheet.setColumnWidth(1, 3500);
//    // Sheet样式
//    HSSFCellStyle sheetStyle = workbook.createCellStyle();
//    // 背景色的设定
//    sheetStyle.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);
//    // 前景色的设定
//    sheetStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
//    // 填充模式
//    sheetStyle.setFillPattern(HSSFCellStyle.FINE_DOTS);
//    // 设置列的样式
//    for (int i = 0; i <= 14; i++) {
//      sheet.setDefaultColumnStyle((short) i, sheetStyle);
//    }
//    // 设置字体
//    HSSFFont headfont = workbook.createFont();
//    headfont.setFontName("黑体");
//    headfont.setFontHeightInPoints((short) 22);// 字体大小
//    headfont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 加粗
//    // 另一个样式
//    HSSFCellStyle headstyle = workbook.createCellStyle();
//    headstyle.setFont(headfont);
//    headstyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中
//    headstyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中
//    headstyle.setLocked(true);
//    headstyle.setWrapText(true);// 自动换行
//    // 另一个字体样式
//    HSSFFont columnHeadFont = workbook.createFont();
//    columnHeadFont.setFontName("宋体");
//    columnHeadFont.setFontHeightInPoints((short) 10);
//    columnHeadFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
//    // 列头的样式
//    HSSFCellStyle columnHeadStyle = workbook.createCellStyle();
//    columnHeadStyle.setFont(columnHeadFont);
//    columnHeadStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中
//    columnHeadStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中
//    columnHeadStyle.setLocked(true);
//    columnHeadStyle.setWrapText(true);
//    columnHeadStyle.setLeftBorderColor(HSSFColor.BLACK.index);// 左边框的颜色
//    columnHeadStyle.setBorderLeft((short) 1);// 边框的大小
//    columnHeadStyle.setRightBorderColor(HSSFColor.BLACK.index);// 右边框的颜色
//    columnHeadStyle.setBorderRight((short) 1);// 边框的大小
//    columnHeadStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 设置单元格的边框为粗体
//    columnHeadStyle.setBottomBorderColor(HSSFColor.BLACK.index); // 设置单元格的边框颜色
//    // 设置单元格的背景颜色（单元格的样式会覆盖列或行的样式）
//    columnHeadStyle.setFillForegroundColor(HSSFColor.WHITE.index);
//
//    HSSFFont font = workbook.createFont();
//    font.setFontName("宋体");
//    font.setFontHeightInPoints((short) 10);
//    // 普通单元格样式
//    HSSFCellStyle style = workbook.createCellStyle();
//    style.setFont(font);
//    style.setAlignment(HSSFCellStyle.ALIGN_LEFT);// 左右居中
//    style.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);// 上下居中
//    style.setWrapText(true);
//    style.setLeftBorderColor(HSSFColor.BLACK.index);
//    style.setBorderLeft((short) 1);
//    style.setRightBorderColor(HSSFColor.BLACK.index);
//    style.setBorderRight((short) 1);
//    style.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 设置单元格的边框为粗体
//    style.setBottomBorderColor(HSSFColor.BLACK.index); // 设置单元格的边框颜色．
//    style.setFillForegroundColor(HSSFColor.WHITE.index);// 设置单元格的背景颜色．
//    // 另一个样式
//    HSSFCellStyle centerstyle = workbook.createCellStyle();
//    centerstyle.setFont(font);
//    centerstyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中
//    centerstyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中
//    centerstyle.setWrapText(true);
//    centerstyle.setLeftBorderColor(HSSFColor.BLACK.index);
//    centerstyle.setBorderLeft((short) 1);
//    centerstyle.setRightBorderColor(HSSFColor.BLACK.index);
//    centerstyle.setBorderRight((short) 1);
//    centerstyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 设置单元格的边框为粗体
//    centerstyle.setBottomBorderColor(HSSFColor.BLACK.index); // 设置单元格的边框颜色．
//    centerstyle.setFillForegroundColor(HSSFColor.WHITE.index);// 设置单元格的背景颜色．
//
//    try {
//      // 创建第一行
//      HSSFRow row0 = sheet.createRow(0);
//      // 设置行高
//      row0.setHeight((short) 900);
//      // 创建第一列
//      HSSFCell cell0 = row0.createCell(0);
//      cell0.setCellValue(new HSSFRichTextString("中非发展基金投资项目调度会工作落实情况对照表"));
//      cell0.setCellStyle(headstyle);
//      /**
//       * 合并单元格
//       *    第一个参数：第一个单元格的行数（从0开始）
//       *    第二个参数：第二个单元格的行数（从0开始）
//       *    第三个参数：第一个单元格的列数（从0开始）
//       *    第四个参数：第二个单元格的列数（从0开始）
//       */
//      CellRangeAddress range = new CellRangeAddress(0, 0, 0, 7);
//      sheet.addMergedRegion(range);
//      // 创建第二行
//      HSSFRow row1 = sheet.createRow(1);
//      HSSFCell cell1 = row1.createCell(0);
//      cell1.setCellValue(new HSSFRichTextString("本次会议时间：2009年8月31日       前次会议时间：2009年8月24日"));
//      cell1.setCellStyle(centerstyle);
//      // 合并单元格
//      range = new CellRangeAddress(1, 2, 0, 7);
//      sheet.addMergedRegion(range);
//      // 第三行
//      HSSFRow row2 = sheet.createRow(3);
//      row2.setHeight((short) 750);
//      HSSFCell cell = row2.createCell(0);
//      cell.setCellValue(new HSSFRichTextString("id"));
//      cell.setCellStyle(columnHeadStyle);
//      cell = row2.createCell(1);
//      cell.setCellValue(new HSSFRichTextString("name"));
//      cell.setCellStyle(columnHeadStyle);
//
//      // 访问数据库，得到数据集
//      List<User> deitelVOList = userRepos.findAll();
//      int m = 4;
//      int k = 4;
//      for (int i = 0; i < deitelVOList.size(); i++) {
//        User user = deitelVOList.get(i);
//        String dname = user.getName();
//        List<Workinfo> workList = vo.getWorkInfoList();
//        HSSFRow row = sheet.createRow(m);
//        cell = row.createCell(0);
//        cell.setCellValue(new HSSFRichTextString(dname));
//        cell.setCellStyle(centerstyle);
//        // 合并单元格
//        range = new CellRangeAddress(m, m + workList.size() - 1, 0, 0);
//        sheet.addMergedRegion(range);
//        m = m + workList.size();
//
//        for (int j = 0; j < workList.size(); j++) {
//          Workinfo w = workList.get(j);
//          // 遍历数据集创建Excel的行
//          row = sheet.getRow(k + j);
//          if (null == row) {
//            row = sheet.createRow(k + j);
//          }
//          cell = row.createCell(1);
//          cell.setCellValue(w.getWnumber());
//          cell.setCellStyle(centerstyle);
//          cell = row.createCell(2);
//          cell.setCellValue(new HSSFRichTextString(w.getWitem()));
//          cell.setCellStyle(style);
//          cell = row.createCell(3);
//          cell.setCellValue(new HSSFRichTextString(w.getWmeting()));
//          cell.setCellStyle(style);
//          cell = row.createCell(4);
//          cell.setCellValue(new HSSFRichTextString(w.getWbweek()));
//          cell.setCellStyle(style);
//          cell = row.createCell(5);
//          cell.setCellValue(new HSSFRichTextString(w.getWtweek()));
//          cell.setCellStyle(style);
//          cell = row.createCell(6);
//          cell.setCellValue(new HSSFRichTextString(w.getWproblem()));
//          cell.setCellStyle(style);
//          cell = row.createCell(7);
//          cell.setCellValue(new HSSFRichTextString(w.getWremark()));
//          cell.setCellStyle(style);
//        }
//        k = k + workList.size();
//      }
//      // 列尾
//      int footRownumber = sheet.getLastRowNum();
//      HSSFRow footRow = sheet.createRow(footRownumber + 1);
//      HSSFCell footRowcell = footRow.createCell(0);
//      footRowcell.setCellValue(new HSSFRichTextString("                    审  定：XXX      审  核：XXX     汇  总：XX"));
//      footRowcell.setCellStyle(centerstyle);
//      range = new CellRangeAddress(footRownumber + 1, footRownumber + 1, 0, 7);
//      sheet.addMergedRegion(range);
//
//
//
//      try
//      {
//        //获取当前用户桌面路径
//        File desktopDir = FileSystemView.getFileSystemView().getHomeDirectory();
//        String desktopPath = desktopDir.getAbsolutePath();
//        System.out.println(desktopPath);
//        //保存到桌面上，固定名字
//        FileOutputStream fout = new FileOutputStream(desktopPath+"/tcharge.xls");
//        workbook.write(fout);
//        fout.close();
//      }
//      catch (Exception e)
//      {
//        e.printStackTrace();
//        return "error";
//      }
//    }
//    return "ok";
//  }
//}
