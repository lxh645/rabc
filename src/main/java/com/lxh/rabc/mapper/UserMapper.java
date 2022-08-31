package com.lxh.rabc.mapper;

import com.lxh.rabc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper  {
    List<User> search();

    Integer add(User user);

    Integer del(Long userId);

    Integer update(User user);
}
