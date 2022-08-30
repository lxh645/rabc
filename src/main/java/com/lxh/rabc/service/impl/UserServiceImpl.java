package com.lxh.rabc.service.impl;

import com.lxh.rabc.entity.User;
import com.lxh.rabc.service.UserService;
import com.lxh.rabc.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;


    @Override
    public List<User> search() {
        return userMapper.search();
    }

    @Override
    public Integer add(User user) {
        try {
            user.setCreateTime(LocalDateTime.now());
            return userMapper.add(user);
        }catch (Exception e){
            return -1;
        }
    }

    @Override
    public Integer del(Long userId) {
        return userMapper.del(userId);
    }

    @Override
    public Integer update(User user) {
        return userMapper.update(user);
    }
}
