package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.pojo.UserExample;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/28 21:23
 * @Description: 沈泽鹏写点注释吧
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> findUserByNickName(String name) {
        return userDao.findUserByNickName(name);
    }
}
