package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.data.User;

/**
 * @Author 子非鱼
 * @create 2021/5/24
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public boolean save(User user) {
        boolean result = false;
        try {
            if (userDao.getUserByUsername(user.getUsername()) == null) {
                result = userDao.save(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public UserVO login(String username, String password) {
        User user = userDao.getUserByUsername(username);
        if (user == null || !password.equals(user.getPassword())) {
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);
        return userVO;
    }
}
