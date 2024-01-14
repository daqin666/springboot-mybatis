//package com.example.multiSource.use.sqlSessionTemplate;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.core.io.support.ResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan(basePackages = "com.xxx.dao.impl", sqlSessionFactoryRef = "mysqlSessionFactory")
//public class MybatisMysqlConfig {
//
//    @Primary
//    @Bean(name = "mysql")
//    @ConfigurationProperties(prefix = "spring.mysql.datasource")
//    public DataSource mysqlDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Primary
//    @Bean(name = "mysqlTransactionManager")
//    public DataSourceTransactionManager transactionManager(@Qualifier("mysql") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Primary
//    @Bean(name = "mysqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory(@Qualifier("mysql") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
//        configuration.setMapUnderscoreToCamelCase(true);
//        bean.setConfiguration(configuration);
//        bean.setDataSource(dataSource);
//        ResourcePatternResolver rsourcePatternResolver = new PathMatchingResourcePatternResolver();
//        bean.setMapperLocations(rsourcePatternResolver.getResources("classpath*:com/xxx/fw/dao/*.xml"));
//        return bean.getObject();
//    }
//
//    @Primary
//    @Bean(name = "mysqlTemplate")
//    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("mysqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
//        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
//        return sqlSessionTemplate;
//    }
//}
