package com.example.demo.controller.baseController;

import com.example.demo.domain.entity.InfoDead;
import com.example.demo.domain.vo.JsonResult;
import com.example.demo.domain.vo.MultipleRegex;
import com.example.demo.repos.InfoDeadRegexSpecification;
import com.example.demo.repos.InfoDeadRepos;
import com.example.demo.util.UserUtil;
import org.apache.poi.hssf.usermodel.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/deadInfo")
@ResponseBody
public class InfoDeadController {
  private final InfoDeadRepos infoDeadRepos;
  private final UserUtil userUtil;

  @Autowired
  public InfoDeadController(InfoDeadRepos infoDeadRepos, UserUtil userUtil) {
    this.infoDeadRepos = infoDeadRepos;
    this.userUtil = userUtil;
  }

  @Transactional
  @RequestMapping(value = "/set", produces = {"application/json"})
  public String set(InfoDead infoDead, @RequestParam("token") String token) {
    System.out.println(token);
    if (userUtil.checkAdmin(token)) {

      infoDeadRepos.save(infoDead);
      return new JsonResult(0, "true").toString();
    } else {
      return new JsonResult(1, "权限不足").toString();
    }
  }

  @RequestMapping(value = "/del", produces = {"application/json"})
  public String del(@RequestParam("id") int id, @RequestParam("token") String token) {
    if (userUtil.checkAdmin(token)) {
      System.out.println(id);
      infoDeadRepos.deleteById(id);
      return new JsonResult(0, "true").toString();
    } else {
      return new JsonResult(1, "权限不足").toString();
    }
  }

  @RequestMapping(value = "/findByPage", produces = {"application/json"})
  public String findByPage(@RequestParam("page") int page,
                           @RequestParam("limit") int limit) {
    System.out.println(page + "," + limit);
    Page<InfoDead> p = infoDeadRepos.findAll(new PageRequest(page - 1, limit));
    List<InfoDead> infoDeadList = p.getContent();
    System.out.println("size:" + infoDeadList.size());
    JSONArray jsonArray = new JSONArray();
    for (InfoDead infoDead : infoDeadList) {
      jsonArray.put(new JSONObject(infoDead));
    }
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("code", 0);
    jsonObject.put("msg", "");
    jsonObject.put("count", p.getTotalElements());
    jsonObject.put("data", jsonArray);
    return jsonObject.toString();
  }

  @RequestMapping(value = "searchByMultipleRegex", produces = {"application/json"})
  public String searchByMultipleRegex(MultipleRegex mr,
                                      @RequestParam("page") int page,
                                      @RequestParam("limit") int limit) {
    System.out.println(mr);
    String[] params = mr.getSelect().split(",");
    Page<InfoDead> p = infoDeadRepos.findAll(new InfoDeadRegexSpecification(params, mr),
        new PageRequest(page - 1, limit));
    List<InfoDead> infoDeadList = p.getContent();
    System.out.println("size:" + infoDeadList.size());
    JSONArray jsonArray = new JSONArray();
    for (InfoDead infoDead : infoDeadList) {
      jsonArray.put(new JSONObject(infoDead));
    }
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("code", 0);
    jsonObject.put("msg", "");
    jsonObject.put("count", p.getTotalElements());
    jsonObject.put("data", jsonArray);
    return jsonObject.toString();
  }

  @RequestMapping(value = "/export2excel", produces = {"application/json"})
  public String export2excel(MultipleRegex mr, @RequestParam("titles") String titles) throws IOException {
    //传入标签当表头
    System.out.println(mr);
    System.out.println(mr.getSelect());
    String[] params = mr.getSelect().split(",");
    //表格样式初始化
    File desktopDir = FileSystemView.getFileSystemView().getHomeDirectory();
    String desktopPath = desktopDir.getAbsolutePath();
    FileOutputStream out = new FileOutputStream(desktopPath + "/离退休管理系统导出数据.xls");//要输出的文件名字
    HSSFWorkbook workBook = new HSSFWorkbook();
    HSSFSheet mySheet = workBook.createSheet();//创建一个工作薄
    workBook.setSheetName(0, "我的工作簿1");//设置名字（以及编码）
    HSSFRow myRow = mySheet.createRow(0);//创建 并设置第一行
    HSSFCellStyle style = workBook.createCellStyle();
    style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//对齐方式
    style.setBorderBottom(HSSFCellStyle.BORDER_THIN);//上下左右边框
    style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
    style.setBorderRight(HSSFCellStyle.BORDER_THIN);
    style.setBorderTop(HSSFCellStyle.BORDER_THIN);

    HSSFFont font = workBook.createFont();//设置字体样式
    font.setFontName("宋体");
    font.setFontHeightInPoints((short) 10);
    font.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);
    style.setFont(font);

    HSSFCell cell;
    String title[] = titles.split(",");
    for (int i = 0; i < title.length; i++) {
      cell = myRow.createCell((short) i);
      cell.setCellStyle(style);
      System.out.println("表头" + title[i]);
      switch (title[i]) {
        case "baseName":
          title[i] = "姓名";
          break;
        case "baseSex":
          title[i] = "性别";
          break;
        case "workKaiShiGongZuo":
          title[i] = "开始工作时间";
          break;
        case "baseJiGuan":
          title[i] = "籍贯";
          break;
        case "baseShengRi":

          title[i] = "出生日期";
          break;
        case "workDaoXiaoShiJian":
          title[i] = "到校时间";
          break;
        case "baseShenFenZheng":
          title[i] = "身份证";
          break;
        case "baseMinZu":
          title[i] = "民族";
          break;
        case "baseXueLi":
          title[i] = "学历";
          break;
        case "baseXueWei":
          title[i] = "学位";
          break;
        case "workBianZhiLeiXing":
          title[i] = "编制类型";
          break;
        case "workZhiWu":
          title[i] = "退休时职务";
          break;
        case "workZhiWuJiBie":
          title[i] = "职务级别";
          break;
        case "workZhiCheng":
          title[i] = "职称";
          break;
        case "workZhiChengJiBie":
          title[i] = "职称级别";
          break;
        case "workTiQianTuiXiu":
          title[i] = "提前退休时间";
          break;
        case "workZhengShiTuiXiu":
          title[i] = "正式退休时间";
          break;
        case "workTuiXiuBuMen":
          title[i] = "退休时部门";
          break;
        case "baseZhengZhiMianMao":
          title[i] = "政治面貌";
          break;
        case "workZhuanYeHeGongZhong":
          title[i] = "专业或工种";
          break;
        case "nowSuoShuZhiBu":
          title[i] = "现所属支部";
          break;
        case "hisJiaRuZuZhi":
          title[i] = "加入组织的年月日";
          break;
        case "hisZhengFuJinTie":
          title[i] = "政府特殊津贴";
          break;
        case "hisZhengFuJinTieDengJi":
          title[i] = "享受哪级政府特殊津贴";
          break;
        case "hisFuZhuanTuiJunRen":
          title[i] = "复转退军人";
          break;
        case "hisShangCan":
          title[i] = "伤残";
          break;
        case "hisShangCanDengJi":
          title[i] = "伤残等级";
          break;
        case "hisLiZhanGong":
          title[i] = "立战功";
          break;
        case "hisLaZhanGongDengJi":
          title[i] = "立功等级";
          break;
        case "baseDuShengZiNv":
          title[i] = "是否独生子女";
          break;
        case "hisLaoMo":
          title[i] = "劳模";
          break;
        case "hisLaoMoDengJi":
          title[i] = "劳模等级";
          break;
        case "nowGongZiHao":
          title[i] = "工资号";
          break;
        case "nowYiKaTong":
          title[i] = "一卡通号";
          break;
        case "nowManXingJiBing":
          title[i] = "慢性疾病";
          break;
        case "nowJianKangZhuangKuang":
          title[i] = "目前身体健康状况";
          break;
        case "connXianHuKouDiZhi":
          title[i] = "现户口地址";
          break;
        case "connYuZiNvShengHuo":
          title[i] = "是否与子女生活";
          break;
        case "connYuShuiShengHuo":

          title[i] = "和谁共同生活";
          break;
        case "connXianJuZhuDiZhi":

          title[i] = "现居住地址";
          break;
        case "connZhuZhaiDianHua":
          title[i] = "住宅电话";
          break;
        case "connShouJiHaoMa":
          title[i] = "手机号码";
          break;
        case "connLiShiHaoMa":
          title[i] = "历史号码";
          break;
        case "connEmailOrQq":
          title[i] = "电子邮箱";
          break;
        case "connPeiOuHuoZiNvEmail":
          title[i] = "配偶或子女电子邮箱";
          break;
        case "mateHunYinZhuangKuang":
          title[i] = "婚姻装况";
          break;
        case "matePeiOuName":
          title[i] = "配偶姓名";
          break;
        case "matePeiOuPhone":
          title[i] = "配偶电话";
          break;
        case "matePeiOuJianKang":
          title[i] = "配偶健康";
          break;
        case "lianXiRenName":
          title[i] = "联系人姓名";
          break;
        case "lianXiRenGuanXi":
          title[i] = "联系人关系";
          break;
        case "lianXiRenPhone":
          title[i] = "联系人电话";
          break;
        case "hisShuangZhiGong":
          title[i] = "是否本校双职工";
          break;
        case "childrenZiNvName":
          title[i] = "子女姓名";
          break;
        case "childrenZiNvAddress":
          title[i] = "子女地址";
          break;
        case "childrenZiNvDanWei":
          title[i] = "子女单位";
          break;
        case "childrenZiNvPhone":
          title[i] = "子女电话";
          break;
        case "nowAiHaoXiangMu":
          title[i] = "文、体爱好项目";
          break;
        case "nowJianChiJianShen":
          title[i] = "现在坚持的体育健身项目";
          break;
        case "xiaoNeiName":
          title[i] = "校内联系人姓名";
          break;
        case "xiaoNeiGuanXi":
          title[i] = "联系人关系";
          break;
        case "xiaoNeiPhone":
          title[i] = "联系人电话";
          break;
        case "xiaoNeiBuMen":
          title[i] = "校内联系人部门";
          break;
        case "xiaoNeiAddress":
          title[i] = "联系人地址";
          break;
        case "nowLaoNianTiXieZu":
          title[i] = "参加老年体协活动小组";
          break;
        case "nowLiuLanWebsite":
          title[i] = "是否浏览本处网站";
          break;
        case "nowXiaoWaiTuanTiZhiWu":
          title[i] = "校外团体中担任的职务";
          break;
        case "hisJunShuJunLie":
          title[i] = "是否军属/烈属";
          break;
        case "remark":
          title[i] = "备注";
          break;
        case "hisUnionGroup":
          title[i] = "组别";
          break;
        case "tianBiaoShiJian":
          title[i] = "填表事件";
          break;
        case "deadTime":
          title[i] = "去世时间";
          break;
        case "":
          break;
        default:
          break;
      }

      cell.setCellValue(title[i]);//创建表头
    }
    //封装数据
    List<InfoDead> infors = infoDeadRepos.findAll(new InfoDeadRegexSpecification(params, mr));
    String labels[] = titles.split(",");
    for (int i = 1; i <= infors.size(); i++) {
      myRow = mySheet.createRow(i);
      InfoDead infoDead = infors.get(i - 1);
      JSONObject jsonObject = new JSONObject(infoDead);
      System.out.println(jsonObject.toString());
      for (int j = 0; j < labels.length; j++) {
        for (String string : jsonObject.keySet()) {
          System.out.println("step1" + string);
          if (string.equals(labels[j])) {
            System.out.println("step2" + labels[j]);
            String str = jsonObject.getString(labels[j]);//取参数
            System.out.println(str);
            cell = myRow.createCell((short) j);//创建单元格  先设置样式、编码，然后再置值。
            cell.setCellValue(str);
          }
        }
      }
    }
    workBook.write(out);//写出文件
    out.close();
    return new JsonResult(0, "").toString();
  }


}
