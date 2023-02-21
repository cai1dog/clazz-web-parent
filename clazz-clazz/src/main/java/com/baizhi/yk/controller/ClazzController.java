package com.baizhi.yk.controller;

import com.baizhi.yk.common.Result;
import com.baizhi.yk.dto.ClazzResponseDTO;
import com.baizhi.yk.entity.Clazz;
import com.baizhi.yk.entity.Tag;
import com.baizhi.yk.feign.TagClient;
import com.baizhi.yk.mapper.ClazzMapper;
import com.baizhi.yk.service.ClazzService;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.RemoveObjectArgs;
import io.minio.errors.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.MulticastChannel;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("clazz")
public class ClazzController {
    @Autowired
    private MinioClient client;
    @Autowired
    private ClazzService service;
    @Autowired
    private TagClient tagClient;

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {

       Clazz a =service.getById(id);
        System.out.println(a);
          String path = a.getPath();

        //删除
        client.removeObject(RemoveObjectArgs.builder().bucket("caaa").object(path).build());
        service.delete(id);
        return;
    }

    @PostMapping
    public Result insert(String name, MultipartFile logo, Integer tagid) throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        String Filename = logo.getOriginalFilename();
        //文件上传
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = sdf.format(date);
        InputStream in = logo.getInputStream();
        client.putObject(PutObjectArgs.builder()
                //桶名
                .bucket("caaa")
                //文件名
                .object("/"+strDate+"/"+Filename)
                .stream(in,logo.getSize(),-1)
                .contentType(logo.getContentType())
                .build()
        );
         File file = new File("/" + strDate + "/" + Filename);
         String a = String.valueOf(file);

        in.close();
        return service.insert(name,a,tagid);
    }

    @GetMapping
    public List<ClazzResponseDTO> lists() {
        List<ClazzResponseDTO> listDTO = new ArrayList<>();
        List<Clazz> list = service.list();
        for (Clazz clazz : list) {
            System.out.println(clazz);
            Tag tag = tagClient.getItem(clazz.getTagid());
            ClazzResponseDTO dto = new ClazzResponseDTO();
//            同属并名的赋值
            BeanUtils.copyProperties(clazz, dto);
            dto.setTag(tag);
            listDTO.add(dto);
        }
        return listDTO;
    }
    @GetMapping("/{id}")
    public Clazz getItem(@PathVariable int id){
        return service.getById(id);
    }

}
