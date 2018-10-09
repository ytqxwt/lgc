package com.example.demo.util;

import com.example.demo.domain.vo.JsonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class FileUtil {
  public static String fileSize(long size) {
    return String.format("%.2f", (double) size / (1024 * 1024)) + "mb";
  }

  public String uploadPhoto(MultipartFile file,String id) {
    JsonResult result = new JsonResult();
    DateFormat simpleFormatter = new SimpleDateFormat("yyyyMMdd");
    String fileName = file.getOriginalFilename();

    if (!file.isEmpty()) {
      File path = new File("/usr/springbootPro/lgc/uploadfile/");
      if (!path.exists()) path.mkdirs();
      try (BufferedOutputStream out = new BufferedOutputStream(
          new FileOutputStream(new File(path, fileName)))) {
        out.write(file.getBytes());
        out.flush();
        result.setCode(0);
        String pathname=path.getPath().replaceAll("\\\\","/");//java的 正则匹配\是四个，其他语言通常是两个
        System.out.println(pathname);
        result.setData(pathname+ "/" + fileName);
      } catch (IOException e) {
        e.printStackTrace();
        result.setCode(1);
        result.setMsg(e.getMessage());
      }
    } else {
      result.setCode(1);
      result.setMsg("file is null");
    }
    System.out.println(result.toString());
    return result.toString();
  }
}
//  public Map fileUpload(MultipartFile file) {
//    Map<String, Object> result = new HashMap<>();
//    DateFormat simpleFormatter = new SimpleDateFormat("yyyyMMdd");
//    if (!file.isEmpty()) {
//      String fileName = file.getOriginalFilename();
//      String suffix = "null";//后缀
//      if (fileName != null) {
//        suffix = fileName.substring(fileName.lastIndexOf('.') + 1);
//      }
//      File path = new File("/FaceIn/" + suffix + "/" + simpleFormatter.format(new Date()) + "/");
//      if (!path.exists()) path.mkdirs();
//      try (BufferedOutputStream out = new BufferedOutputStream(
//          new FileOutputStream(new File(path, file.getOriginalFilename())))) {
//        out.write(file.getBytes());
//        out.flush();
//        result.put("result", true);
//        result.put("uri", path + "/" + fileName);
//      } catch (IOException e) {
//        e.printStackTrace();
//        result.put("result", false);
//        result.put("massage", e.getMessage());
//      }
//    } else {
//      result.put("result", false);
//      result.put("massage", "file is null");
//    }
//    return result;
//  }
