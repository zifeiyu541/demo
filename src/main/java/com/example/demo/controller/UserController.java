package com.example.demo.controller;

import com.example.demo.data.User;
import com.example.demo.form.LoginForm;
import com.example.demo.form.UserForm;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 子非鱼
 * @create 2021/5/24
 */

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public boolean register(@RequestBody UserForm userForm) {
        System.out.println(userForm.toString());
        User user = new User();
        BeanUtils.copyProperties(userForm, user);
        return userService.save(user);
    }

    @PostMapping("/login")
    public UserVO login(@RequestBody LoginForm loginForm) {
        System.out.println(loginForm.toString());
        return userService.login(loginForm.getUsername(), loginForm.getPassword());
    }
}
