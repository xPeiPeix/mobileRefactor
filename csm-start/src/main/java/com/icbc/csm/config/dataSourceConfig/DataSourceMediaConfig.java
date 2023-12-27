package com.icbc.csm.config.dataSourceConfig;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
@Configuration
@MapperScan(basePackages = "com.icbc.videocustomer.dao.mapper.newmedia", sqlSessionTemplateRef = "newmediaSqlSessionTemplate")
public class DataSourceMediaConfig {

    @Bean("newmediaTransactionManager")
    @Primary
    public DataSourceTransactionManager cciskbTransactionManager(@Qualifier("newmedia") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "newmediaSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate cciskbSqlSessionTemplate(@Qualifier("newmediaSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
