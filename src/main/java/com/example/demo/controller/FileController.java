package com.example.demo.controller;

import com.example.demo.domain.vo.JsonResult;
import com.example.demo.util.FileUtil;
import com.example.demo.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponents;

import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;
import java.io.*;
import java.net.URI;
import java.net.URLEncoder;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/file")
@ResponseBody
public class FileController {
  private final FileUtil fileUtil;
  private final UserUtil userUtil;
  @Autowired
  public FileController(FileUtil fileUtil, UserUtil userUtil) {
    this.fileUtil = fileUtil;
    this.userUtil = userUtil;
  }

  @RequestMapping(value = "/upload", produces = {"application/json"}, method = RequestMethod.POST)
  @ResponseBody
  public String fileUpload(@RequestParam("file") MultipartFile file,
                           @RequestParam("token") String token) throws UnsupportedEncodingException {
    if (userUtil.checkAdmin(token)) {
      return fileUtil.uploadPhoto(file);
    } else {
      return new JsonResult(1, "权限不足").toString();
    }
  }

  @RequestMapping("/downloadFile")
  public void downLoad(HttpServletResponse response, @RequestParam(name = "uri") String uri) throws UnsupportedEncodingException {
    System.out.println(uri);
    File file = new File(uri);
    if (file.exists()) {
      String s = uri.substring(uri.lastIndexOf('.') + 1);
      s = s.toUpperCase();
      System.out.println(s);
      response.setContentType("application/force-download");
      response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(uri.substring(uri.lastIndexOf("/") + 1), "gbk"));
      downfile(response, s);
      byte[] buffer = new byte[1024];
      outputFile(response, file, buffer);
    } else if (file.exists()) {
      response.setContentType("application/force-download");
      response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(uri.substring(uri.lastIndexOf("/") + 1), "gbk"));
      String suffix = uri.substring(uri.lastIndexOf('.') + 1);
      downfile(response, suffix);
      byte[] buffer = new byte[1024];
      outputFile(response, file, buffer);
    } else {
      response.setStatus(500);
    }
  }

  private void outputFile(HttpServletResponse response, File file, byte[] buffer) {
    try (
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        OutputStream os = response.getOutputStream()
    ) {
      int i = bis.read(buffer);
      while (i != -1) {
        os.write(buffer);
        i = bis.read(buffer);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void downfile(HttpServletResponse response, String s) {
    switch (s) {
      case "jpg":
      case "JPG":
      case "jpeg":
        response.setContentType("image/jpeg");
        break;
      case "txt":
        response.setContentType("text/plain");
        break;
      case "map3":
        response.setContentType("audio/mpeg");
        break;
      case "gif":
        response.setContentType("image/gif");
        break;
      case "ppt":
        response.setContentType("application/vnd.ms-powerpoint");
        break;
      case "pptx":
        response.setContentType("\t\n" +
            "application/vnd.openxmlformats-officedocument.presentationml.template");
        break;
      case "doc":
        response.setContentType("application/msword");
        break;
      case "apk":
        response.setContentType("application/vnd.android.package-archive");
        break;
      default:
        response.setContentType("application/octet-stream");
    }
  }

  @RequestMapping(value = "/savePhotoURL", produces = {"application/json"})
  public String set(@RequestParam("id") String id, @RequestParam("photoURL") String url) {
    System.out.println("::" + id + "::" + url);
    System.out.println(url);
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs1 = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://120.79.68.208:3306/Retirement_management_system", "root", "dyz13125219151YT");
      if (!id.equals("")) {
        conn.createStatement().execute("UPDATE Retirement_management_system.info_new SET base_photo_url='" + url + "' WHERE  id ='" + id + "';");
        System.out.println("插入成功");
      } else {
        System.out.println("插入失败");
        return new JsonResult(1, "").toString();
      }
      return new JsonResult(0, "").toString();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (stmt != null)
          stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      try {
        if (conn != null)
          conn.close();
      } catch (SQLException se) {
        se.printStackTrace();
      }
    }
    return new JsonResult(1, "").toString();
  }
}
    /*
        //多文件上传
        @ApiOperation(value = "上传图片", notes = "到image文件夹下",httpMethod = "POST")
        @RequestMapping(value = "/upload", method = RequestMethod.POST)
        @ResponseBody
        public String fileUpload(HttpServletRequest request) {
            List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
            String iid = request.getParameter("iid");
            MultipartFile file = null;
            BufferedOutputStream stream = null;
            for (int i = 0; i < files.size(); ++i) {
                file = files.get(i);
                if (!file.isEmpty()) {
                    try {
                        byte[] bytes = file.getBytes();
                        File path = new File("image");
                        if (!path.exists()) {
                            path.mkdir();
                        }
                        stream = new BufferedOutputStream(new FileOutputStream(new File(path, file.getOriginalFilename())));
                        stream.write(bytes);
                        stream.close();

                        //插入facenew表中
                        Facenew facenew = new Facenew();
                        facenew.setImg("/image/" + file.getOriginalFilename());
                        facenew.setIid(iid);
                        facenewRepos.save(facenew);

                    } catch (Exception e) {
                        stream = null;
                        return "You failed to upload " + i + " => " + e.getMessage();
                    }
                } else {
                    return "You failed to upload " + i + " because the file was empty.";
                }
            }
            return "upload successful";
        }
    */




