package com.example.demo.dao;

import com.example.demo.data.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 子非鱼
 * @create 2021/5/24
 */

@Mapper
public interface UserDao {
    boolean save(User user);

    User getUserByUsername(String username);
}
