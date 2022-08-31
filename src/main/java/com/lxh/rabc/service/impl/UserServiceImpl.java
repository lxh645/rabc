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

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Override
    public String add(User user) {
        try {
            user.setCreateTime(LocalDateTime.now());
            userMapper.add(user);
            return "添加成功";
        }catch (Exception e){
            return "用户已存在，请换个名字";
        }
    }

    /**
     * 删除用户
     * @param userId
     * @return
     */
    @Override
    public String del(Long userId) {
//        Integer del = userMapper.del(userId);
//        if (del.intValue() ==1 ){
//            return "删除成功";
//        }
//        return "删除失败";
        return userMapper.del(userId).intValue() == 1 ? "删除成功" : "删除失败";
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @Override
    public String update(User user) {
        return userMapper.update(user) == 1 ? "删除成功" : "删除失败";
    }
}
