package com.example.mapper;

import com.example.entity.TGenerator;
import java.util.List;

public interface TGeneratorMapper {
    int deleteByPrimaryKey(String id);

    int insert(TGenerator row);

    TGenerator selectByPrimaryKey(String id);

    List<TGenerator> selectAll();

    int updateByPrimaryKey(TGenerator row);
}