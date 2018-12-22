package com.example.demo;

import com.example.demo.mapper.TestMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    TestMapper testMapper;

    @Test
    public void findById() {
        List<com.example.demo.entity.Test> userList = testMapper.select(null);
        userList.forEach(System.out::println);

    }

    @Test
    public void test() {
        PageHelper.startPage(1,3);//只需要这一句即可
        List<com.example.demo.entity.Test> userList = testMapper.select(null);
        userList.forEach(System.out::println);

        System.out.println("=============");
        PageInfo<com.example.demo.entity.Test> pageInfo = new PageInfo<>(userList);
        pageInfo.getList().forEach(System.out::println);
    }

}

