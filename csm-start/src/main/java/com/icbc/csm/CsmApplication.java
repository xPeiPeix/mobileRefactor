package com.icbc.csm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;


@SpringBootApplication
@EnableScheduling
public class CsmApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        //java项目启动方式
        SpringApplication.run(CsmApplication.class, args);
    }


    /**
     * 创建一个可部署到外部容器的WAR文件，容器外部启动方式
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CsmApplication.class);
    }

    @PostConstruct
    public void init(){

    }
}
