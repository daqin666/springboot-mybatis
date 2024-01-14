//package com.example.multiSource.use;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Map;
//
//@Component
//public class JdbcTemplateTest {
//
//    @Autowired
//    @Qualifier("mysqlJdbcTemplate")
//    protected JdbcTemplate jdbcTemplate1;
//
//    @Autowired
//    @Qualifier("sqlserverJdbcTemplate")
//    protected JdbcTemplate jdbcTemplate2;
//
//    public void test() {
//        List<Map<String, Object>> queryForList = jdbcTemplate1.queryForList("select * from user");
//
//        List<Map<String, Object>> queryForList2 = jdbcTemplate2.queryForList("select * from test");
//    }
//}
