//package com.example.multiSource.config.dataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourceConfig {
//
//    @Primary
//    @Bean(name = "mysql")
//    @Qualifier("mysql")
//    @ConfigurationProperties(prefix = "spring.datasource.mysql")
//    public DataSource mysqlDataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//    //    @Primary（主数据源配置）
//    @Bean(name = "sqlserver")
//    @Qualifier("sqlserver")
//    @ConfigurationProperties(prefix = "spring.datasource.sqlserver")
//    public DataSource sqlServerDataSource(){
//        return DataSourceBuilder.create().build();
//    }
//}
