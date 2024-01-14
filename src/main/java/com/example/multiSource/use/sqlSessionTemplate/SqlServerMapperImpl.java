//package com.example.multiSource.use.sqlSessionTemplate;
//
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.Resource;
//
//@Repository
//public class SqlServerMapperImpl implements SqlServerMapper {
//
//    @Autowired
//    @Resource(name = "sqlserverTemplate")
//    SqlSessionTemplate sqlSessionTemplate;
//
//
//    @Override
//    public Object getTest(Integer id) {
//        return sqlSessionTemplate.selectOne("com.*.xx2Mapper.getCert", id);
//    }
//}
