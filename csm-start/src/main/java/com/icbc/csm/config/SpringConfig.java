package com.icbc.csm.config;

import com.google.common.base.Utf8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class SpringConfig {
    /**
     * 处理文件上传、将上传的文件提取出来并封装
     * @return
     */
    @Bean
    public CommonsMultipartResolver multipartResolver(){
        CommonsMultipartResolver multipartResolver= new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(4194304);
        multipartResolver.setDefaultEncoding("utf-8");
        return multipartResolver;
    }


}
