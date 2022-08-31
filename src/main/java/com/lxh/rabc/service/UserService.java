package com.lxh.rabc.service;

import com.lxh.rabc.entity.User;

import java.util.List;

public interface UserService {
    List<User> search();

    String add(User user);

    String del(Long userId);

    String update(User user);
}
