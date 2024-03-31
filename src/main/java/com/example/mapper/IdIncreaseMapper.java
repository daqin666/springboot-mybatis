package com.example.mapper;

import com.example.entity.IdIncrease;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
//@Repository
public interface IdIncreaseMapper {

    // 新增数据-单条-value
    int insert(IdIncrease idIncrease);

    // 新增数据-单条-values
    int insert2(IdIncrease idIncrease);

    // 新增数据-批量-values
    int insert3(@Param("list") List<IdIncrease> infos);

    // 新增数据-单条-value-返回id，其他的返回不了
    int insert4(IdIncrease idIncrease);

    // 新增数据-单条-value-返回id --- 不能这么写
    IdIncrease insert5(IdIncrease idIncrease);
}
