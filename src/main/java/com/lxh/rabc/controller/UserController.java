package com.lxh.rabc.controller;

import com.lxh.rabc.entity.User;
import com.lxh.rabc.service.UserService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("search")
    public List<User> search(){
        return userService.search();
    }

    /**
     * 添加用户
     * @param user
     */
    @RequestMapping("add")
    public Integer search(@RequestBody User user){
        return userService.add(user);
    }
    /**
     * 删除用户
     * @param userId
     */
    @RequestMapping("del")
    public Integer del(Long userId){
        return userService.del(userId);
    }
    /**
     * 修改用户
     * @param user
     */
    @RequestMapping("update")
    public Integer update(@RequestBody User user){
        return userService.update(user);
    }
}
