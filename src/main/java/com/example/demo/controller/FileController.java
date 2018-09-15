package com.example.demo.controller;

import com.example.demo.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponents;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URI;
import java.net.URLEncoder;

@Controller
@RequestMapping("/file")
@ResponseBody
public class FileController {
  private final FileUtil fileUtil;

  @Autowired
  public FileController(FileUtil fileUtil) {
    this.fileUtil = fileUtil;
  }

  @RequestMapping(value = "/upload", produces = {"application/json"}, method = RequestMethod.POST)
  @ResponseBody
  public String fileUpload(@RequestParam("file") MultipartFile file) {
    return fileUtil.uploadPhoto(file);
  }

  @RequestMapping("/downloadFile")
  public void downLoad(HttpServletResponse response, @RequestParam(name = "uri") String uri) throws UnsupportedEncodingException {
    System.out.println(uri);
    File file = new File(uri);
    if (file.exists()) {
      response.setContentType("application/force-download");
      response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(uri.substring(uri.lastIndexOf("/") + 1), "gbk"));
//      response.setHeader("content-disposition", "attachment;filename=" + uri.substring(uri.lastIndexOf("/") + 1));
      //根据后缀设置返回类型
      String suffix = uri.substring(uri.lastIndexOf('.') + 1);
      switch (suffix) {
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
      byte[] buffer = new byte[1024];
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
    } else {
      response.setStatus(500);
    }
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




