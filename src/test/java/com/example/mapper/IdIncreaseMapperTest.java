package com.example.mapper;

import com.example.entity.IdIncrease;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IdIncreaseMapperTest extends TestCase {

    @Autowired
    private IdIncreaseMapper mapper;

    @Test
    public void testInsert() {
        IdIncrease info = new IdIncrease();
        info.setName("zhangsan"+ System.currentTimeMillis());
        info.setAge(21);
        int insert = mapper.insert(info);
        System.out.println(insert);
        System.out.println("info.getIdd()==="+ info.getIdd());
    }

    @Test
    public void testInsert2() {
        IdIncrease info = new IdIncrease();
        info.setName("zhangsan"+ System.currentTimeMillis());
        info.setAge(21);
        int insert = mapper.insert2(info);
        System.out.println(insert);
    }

    @Test
    public void testInsert3() {

        List<IdIncrease> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            IdIncrease info = new IdIncrease();
            info.setName("zhangsan"+ System.currentTimeMillis());
            info.setAge(21);
            list.add(info);
        }
        int insert = mapper.insert3(list);
        System.out.println(insert);
    }

    @Test
    public void testInsert4() {
        IdIncrease info = new IdIncrease();
        info.setName("zhangsan"+ System.currentTimeMillis());
        info.setAge(21);
        int insert = mapper.insert4(info);
        System.out.println(insert);
        System.out.println("info.getIdd()==="+ info.getIdd());
        System.out.println("info==="+ info);
    }

    @Test
    public void testInsert5() {
        IdIncrease info = new IdIncrease();
        info.setName("zhangsan"+ System.currentTimeMillis());
        info.setAge(21);
        IdIncrease idIncrease = mapper.insert5(info);
        System.out.println(idIncrease.toString());
    }
}