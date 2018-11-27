package com.hwua.springboot;

import com.hwua.springboot.dao.UserDao;
import com.hwua.springboot.entity.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJdbc01ApplicationTests {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserDao userDao;
    @Test
    public void contextLoads() {
        System.out.println(dataSource.getClass().getName());
    }
    @Test
    public void test1() {
        User user= new User(null,"wangwu","123","王五","133","123@321.com","1");
        int a=userDao.addUser(user);
        System.out.println(a);
    }
}
