package com.example.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SqlSessionService {

    @Autowired
    private SqlSessionFactory factory;

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<Map> test1(int i) {
        String sqlid="com.a.test.dao.TestDao.queryStudentsLimite";//xml文件中的namespace+语句对应的ID
        SqlSession session=factory.openSession();
        List<Map> list=session.selectList(sqlid, i);
        return list;
    }

    public List<Map> test2(int i) {
        String sqlid="com.a.test.dao.TestDao.queryStudentsLimite";//xml文件中的namespace+语句对应的ID
        List<Map> list=sqlSessionTemplate.selectList(sqlid, i);
        return list;
    }

}
