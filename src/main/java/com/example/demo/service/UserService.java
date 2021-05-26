package com.example.demo.service;

import com.example.demo.data.User;
import com.example.demo.vo.UserVO;

/**
 * @Author 子非鱼
 * @create 2021/5/24
 */
public interface UserService {
    boolean save(User user);

    UserVO login(String username, String  password);
}
