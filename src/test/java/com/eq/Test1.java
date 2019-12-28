package com.eq;

import com.pojo.User;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/28 21:37
 * @Description: 沈泽鹏写点注释吧
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-mapper.xml"})
public class Test1 {

    @Autowired
    private UserService userService;
    @Test
    public void addUser(){
        User user=new User();
        user.setAddress("sadfasd");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setHobby("dagsiaois");
        user.setImgUrl("http://file02.16sucai.com/d/file/2015/0128/8b0f093a8edea9f7e7458406f19098af.jpg");
        user.setPassword("12312312");
        user.setSex((short)1);
        user.setUsername("asdfg");
        user.setNickName("adsgosdujhgos");
        Integer result = userService.addUser(user);
        System.out.println(result);
    }

    @Test
    public void findUserByName(){
        List<User> a = userService.findUserByNickName("a");
        System.out.println(a);
    }
}
