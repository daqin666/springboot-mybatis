package com.example.mapper;

import com.example.entity.Classroom;
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
public class ClassroomMapperTest extends TestCase {

    @Autowired
    private ClassroomMapper classroomMapper;

    @Test
    public void testSelectByCollection() {
        Classroom classroom = classroomMapper.selectByCollection("1001");
        log.info("班级信息：{}", classroom);
    }

    @Test
    public void testSelectByStep1() {
        Classroom classroom = classroomMapper.selectByStep1("1001");
        log.info("班级信息：{}", classroom);
    }
}