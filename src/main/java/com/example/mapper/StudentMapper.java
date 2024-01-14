package com.example.mapper;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface StudentMapper {
    /**
     * 根据id获取学生信息，同时获取学生关联的班级信息
     * @param id 学生的id
     * @return 学生对象，但是学生对象当中含有班级对象
     */
    Student selectById(@Param("sid") String id);

    /**
     * 一条SQL语句，association
     * @param id
     * @return
     */
    Student selectByIdAssociation(@Param("sid") String id);

    /**
     * 多对一
     * 分步查询第一步：先根据学生的sid查询学生的信息
     * @param id
     * @return
     */
    Student selectByIdStep1(@Param("sid") String id);

    /**
     * 一对多
     * 分步查询第二步：根据班级编号查询学生信息
     * @param sid
     * @return
     */
    List<Student> selectByStep2(@Param("sid") String sid);
}
