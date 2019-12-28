package com.service;

import com.pojo.User;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/28 21:23
 * @Description: 沈泽鹏写点注释吧
 */
public interface UserService {
    Integer addUser(User user);
    List<User> findUserByNickName(String name);
}
