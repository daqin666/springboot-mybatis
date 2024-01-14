//package com.example.config;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class JdbcTemplateConfig {
//    @Bean(name = "mysqlJdbcTemplate")
//    public JdbcTemplate primaryJdbcTemplate(@Qualifier("mysql") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//
//    @Bean(name = "sqlserverJdbcTemplate")
//    public JdbcTemplate secondaryJdbcTemplate(@Qualifier("sqlserver") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//}
