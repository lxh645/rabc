package com.lxh.rabc.service;

import com.lxh.rabc.entity.User;

import java.util.List;

public interface UserService {
    List<User> search();

    Integer add(User user);

    Integer del(Long userId);

    Integer update(User user);
}
