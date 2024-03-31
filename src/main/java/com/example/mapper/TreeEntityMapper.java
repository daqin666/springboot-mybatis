package com.example.mapper;

import com.example.entity.TreeDto;
import com.example.entity.TreeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TreeEntityMapper {

    List<TreeEntity> selectAll();

    List<TreeDto> selectTree();
}