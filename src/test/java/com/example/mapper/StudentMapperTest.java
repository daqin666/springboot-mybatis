package com.example.mapper;

import com.example.entity.Student;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class StudentMapperTest extends TestCase {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testSelectById() {
        Student student = studentMapper.selectById("101");
        log.info("学生id：{}，学生姓名：{}，班级id：{}，班级名称：{}", student.getSid(), student.getSname(),
                student.getClassroom().getCid(), student.getClassroom().getCname());
    }

    @Test
    public void testSelectByIdAssociation() {
        Student student = studentMapper.selectByIdAssociation("101");
        log.info("学生id：{}，学生姓名：{}，班级id：{}，班级名称：{}", student.getSid(), student.getSname(),
                student.getClassroom().getCid(), student.getClassroom().getCname());
    }

    @Test
    public void testSelectByIdStep1() {
        Student student = studentMapper.selectByIdStep1("101");
        log.info("学生id：{}，学生姓名：{}，班级id：{}，班级名称：{}", student.getSid(), student.getSname(),
                student.getClassroom().getCid(), student.getClassroom().getCname());
    }
}