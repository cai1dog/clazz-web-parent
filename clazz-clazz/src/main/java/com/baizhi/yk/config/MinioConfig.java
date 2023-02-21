package com.baizhi.yk.config;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinioConfig {

    @Value("${minio.endpoint}")
    private String endpoint;  //ip+端口
    @Value("${minio.accessKey}")
    private String accessKey;
    @Value("${minio.secretKet}")
    private String secretKet;

    @Bean
    public MinioClient minioClient() {
        MinioClient minioClient = MinioClient.builder()
                .endpoint(endpoint)
                .credentials(accessKey, secretKet)
                .build();
        return minioClient;
    }//指定ip加端口，俩key
}