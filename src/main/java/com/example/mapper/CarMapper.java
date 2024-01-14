package com.example.mapper;

import com.example.entity.Car;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CarMapper {
    List<Car> getAll();

    List<Car> selectAllByResultMap();

    int insert(Car car);

    /**
     * 注解 @Param 可以用来给参数赋值别名
     */
//    int delete(@Param("id2") Long id);
    int delete(Long id);

    int update(Car car);

//    Car getById(Long id);
    List<Car> getById(Long id);

    int insertStudentByMap(Map<String,Object> map);

    Map<String,Object> selectByIdRetMap(Long id);

    List<Map<String,Object>> selectAllRetListMap();

    /**
     * 查询所有的Car返回一个大Map结合
     * Map集合的key是每条记录的主键值
     * Map集合的value的每条记录
     * @return
     */
    @MapKey("id")
    Map<Long,Map<String,Object>> selectAllRetMap();

//    List<Car> selectByMultiCondition(String brand, Double guidePrice, String carType);
    List<Car> selectByMultiCondition(@Param("brand") String brand,
                                     @Param("guidePrice") Double guidePrice,
                                     @Param("carType") String carType);

    int deleteByIds(@Param("ids") Long[] ids);
    int insertBatch(@Param("cars") List<Car> cars);

    /**
     * 分页查询
     * startIndex = (pageNum - 1) * pageSize
     * @param startIndex 起始下标 (下标从0开始)
     * @param pageSize 每页显示的记录条数
     * @return
     */
    List<Car> selectByPage(@Param("startIndex") int startIndex,
                           @Param("pageSize") int pageSize);
}
