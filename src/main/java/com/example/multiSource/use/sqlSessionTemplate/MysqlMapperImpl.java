//package com.example.multiSource.use.sqlSessionTemplate;
//
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.Resource;
//
//@Repository
//public class MysqlMapperImpl implements MysqlMapper {
//
//    @Autowired
//    @Resource(name = "mysqlTemplate")
//    private SqlSessionTemplate sqlSessionTemplate;
//
//
//    @Override
//    public Object getUser(Long id) {
//        return sqlSessionTemplate.selectOne("com.*.xxMapper.getUser",id);
//    }
//}
