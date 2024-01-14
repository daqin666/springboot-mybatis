package com.example.mapper;

import com.example.entity.Car;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CarMapperTest extends TestCase {

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private DataSource dataSource;

    @Test
    public void testDataSource() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void testGetAll() {
        List<Car> all = carMapper.getAll();
        System.out.println(all);
    }

    @Test
    public void testInsert(){
        Car car = new Car(null,"111","奔驰",30.00,"2022-10-2","新能源");
        int count = carMapper.insert(car);
        System.out.println((count == 1 ? "插入成功" : "插入失败"));
    }
    @Test
    public void testDelete(){
        int count = carMapper.delete(4L);
        System.out.println((count == 1 ? "删除成功" : "删除失败"));
    }

    @Test
    public void testUpdate(){
        Car car = new Car(3L,"1111","奔驰",30.00,"2022-10-2","新能源");
        int count = carMapper.update(car);
        System.out.println((count == 1 ? "更新成功" : "更新失败"));
    }

    @Test
    public void testGetById(){
        List<Car> cars = carMapper.getById(1L);
        System.out.println(cars);
    }

    @Test
    public void testSelectByMultiCondition(){
        List<Car> cars = carMapper.selectByMultiCondition("奔驰", 30d, "新能源");
        System.out.println(cars);
    }

    @Test
    public void testSelectByPage(){
        int pageNum = 1;
        int pageSize = 2;
        int startIndex = (pageNum - 1) * pageSize;
        List<Car> cars = carMapper.selectByPage(startIndex, pageSize);
        cars.forEach(System.out::println);

        // 封装分页信息对象
        // PageInfo对象是PageHelper插件提供的，用来封装分页相关信息的对象
        PageInfo<Car> carPageInfo = new PageInfo<>(cars, 2);
        System.out.println(carPageInfo);
    }

    @Test
    public void testSelectByPageHelper(){
        int pageNum = 1;
        int pageSize = 2;

        PageHelper.startPage(pageNum,pageSize);
        List<Car> cars = carMapper.getAll();
        PageInfo<Car> carPageInfo = new PageInfo<>(cars);
        System.out.println(carPageInfo);
    }

}