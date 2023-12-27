package com.icbc.csm.config.dataSourceConfig;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class MultiDataSourceConfig {

    @Primary
    @Bean("newmedia")
    @ConfigurationProperties("spring.datasource.mysql.newmedia")
    public DataSource dataSourceMysql(){
        return DruidDataSourceBuilder.create().build();
    }


}
