package com.example.mapper;

import com.example.entity.Classroom;
import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClassroomMapper {
    /**
     * 多对一
     * 分步查询第二步：根据cid获取班级信息
     * @param sid
     * @return
     */
    Classroom selectByIdStep2(@Param("sid") String sid);

    Classroom selectByCollection(@Param("cid") String cid);

    /**
     * 一对多
     * 分步查询第一步：根据班级编号获取班级信息
     * @param cid
     * @return
     */
    Classroom selectByStep1(@Param("cid") String cid);
}
