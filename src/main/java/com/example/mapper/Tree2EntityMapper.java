package com.example.mapper;

import com.example.entity.Tree2Dto;
import com.example.entity.Tree2Entity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Tree2EntityMapper {

    List<Tree2Entity> selectAll();

    List<Tree2Dto> selectTree();
}