package com.work.blogblog.controller.impl;

import com.work.blogblog.controller.PictureController;
import com.work.blogblog.entity.Picture;
import com.work.blogblog.service.PictureService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Picture接口定义实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:55
 */
@RestController
public class PictureControllerImpl implements PictureController {

    @Resource
    private PictureService pictureService;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String format = simpleDateFormat.format(new Date());

    @Override
    public Map<String, Object> insert(MultipartFile[] pictures) {
        // 目前图片暂时存储在pictures文件夹
        String picturePath = "D:\\Programing\\IDEA-workspace\\blog\\pictures\\";
        // 按日期对图片进行存储
        File folder = new File(picturePath + format);
        if(!folder.isDirectory()) {
            folder.mkdir();
        }
        Map<String, Object> map = new HashMap<>();
        List<String> pictureList = new ArrayList<>();
        for (int i = 0; i < pictures.length; i++) {
            MultipartFile multipartFile = pictures[i];
            // 获取图片原始名称
            String oldName = multipartFile.getOriginalFilename();
            // 通过UUID生成唯一名称
            String newName = UUID.randomUUID() + oldName.substring(oldName.lastIndexOf("."));
            try {
                // 存储图片
                multipartFile.transferTo(new File(folder, newName));
                // 返回图片新名称信息
                String pictureLocation = format + "/" +  newName;
                // 存入数据库
                Picture picture = new Picture();
                picture.setUrl(pictureLocation);
                pictureService.insert(picture);

                pictureList.add(pictureLocation);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        map.put("pictureList", pictureList);
        return map;
    }
}
