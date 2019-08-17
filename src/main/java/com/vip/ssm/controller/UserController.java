package com.vip.ssm.controller;

import com.vip.ssm.entity.User;
import com.vip.ssm.service.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 86178
 */
@RestController
public class UserController {
    @Resource
    UserService service;

    @RequestMapping("/user")
    public List<User> findId(){
        List<User> users = service.findId();

        return users;
    }
}
