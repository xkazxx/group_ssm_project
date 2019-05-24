package com.xkazxx.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class PicAndFileController {

    @Autowired
    ServletContext context;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public Map picUpload(MultipartFile[] uploadFile) {
        Map map = new HashMap();
        int countError = 0;
        for (MultipartFile uploadFile1 : uploadFile) {
            try {
                String originalFilename = uploadFile1.getOriginalFilename();
                String picName = "pic/" + UUID.randomUUID().toString() +
                        originalFilename.substring(originalFilename.lastIndexOf("."));
                String path = context.getRealPath("/WEB-INF/" + picName);
                uploadFile1.transferTo(new File(path));
                map.put("url", picName);
            }catch (IOException e){
                Logger.getLogger(this.getClass()).info(e.getMessage());
                countError++;
            }
        }
        map.put("error", countError);
        return map;
    }

    @RequestMapping("/pic/delete")
    @ResponseBody
    public Map picDelete(String picName){
        Map map = new HashMap();
        String data;
        picName = picName.contains("?") ? picName.substring(picName.indexOf("=") + 1) : picName;
        String path = context.getRealPath("/WEB-INF/" + picName);
        File file = new File(path);
        if(file.exists() && file.isFile()){
            data = "success";
            file.delete();
        }else {
            data = "failed";
        }
        map.put("data",data);
        return map;
    }

    @RequestMapping("/file/upload")
    @ResponseBody
    public Map fileUpload(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        String fileName = "/file/" + UUID.randomUUID().toString() +
                originalFilename.substring(originalFilename.lastIndexOf("."));
        String path = context.getRealPath("/WEB-INF/" + fileName);
        file.transferTo(new File(path));
        Map map = new HashMap();
        map.put("url", fileName);
        map.put("error", 0);
        return map;
    }

    @RequestMapping("/file/delete")
    @ResponseBody
    public Map fileDelete(String fileName){
        Map map = new HashMap();
        String data;
        fileName = fileName.contains("?") ? fileName.substring(fileName.indexOf("=") + 1) : fileName;

        String path = context.getRealPath("/WEB-INF/" + fileName);
        File file = new File(path);
        if(file.exists() && file.isFile()){
            file.delete();
            data = "success";
        }else {
            data = "failed";
        }
        map.put("data",data);
        return map;
    }


    @RequestMapping("/file/download")
    @ResponseBody
    public byte[] fileDownload(String fileName, HttpServletResponse response){

        String path = context.getRealPath("/WEB-INF/" + fileName);
        File file = new File(path);
        byte[] allBytes = null;
       try {
            response.setContentType("application/octet-stream");
            response.setHeader("Content-disposition", "attachment;filename="+fileName);
            allBytes = Files.readAllBytes(file.toPath());
       } catch (IOException e) {
           Logger.getLogger(this.getClass()).info(e.getMessage());
       }
        return allBytes;
    }

}
