package com.vip.ssm.service.impl;

import com.vip.ssm.entity.User;
import com.vip.ssm.mapper.UserMapper;
import com.vip.ssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper  mapper;
    @Override
    public List<User> findId() {
        List<User> users = mapper.findId();
        return users;
    }
}
