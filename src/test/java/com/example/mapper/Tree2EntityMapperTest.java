package com.example.mapper;

import com.example.entity.Tree2Dto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Tree2EntityMapperTest extends TestCase {

    @Autowired
    Tree2EntityMapper mapper;

    public void testSelectAll() {
    }

    @Test
    public void testSelectTree() throws JsonProcessingException {
        List<Tree2Dto> tree2Dtos = mapper.selectTree();
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(tree2Dtos);
        System.out.println(s);
    }
}