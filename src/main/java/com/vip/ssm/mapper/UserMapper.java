package com.vip.ssm.mapper;

import com.vip.ssm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> findId();
}
