package com.dao;

import com.mapper.UserMapper;
import com.pojo.User;
import com.pojo.UserExample;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: szp
 * @Date: 2019/12/28 21:25
 * @Description: 沈泽鹏写点注释吧
 */
@Repository
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    public Integer addUser(User user){
        return userMapper.insert(user);
    }

    public List<User> findUserByNickName(String name){
        String sql="SELECT * FROM t_user WHERE nick_name LIKE '%"+name+"%'";

        UserExample userExample=new UserExample();
        userExample.createCriteria()
                .andNickNameLike("%"+name+"%");
        return userMapper.selectByExample(userExample);
    }

}
