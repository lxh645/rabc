package com.lxh.rabc.controller;

import com.lxh.rabc.common.Result;
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
    public Result search(){
        return Result.success(userService.search());
    }

    /**
     * 添加用户
     * @param user
     */
    @RequestMapping("add")
    public Result search(@RequestBody User user){
        return Result.success(userService.add(user));
    }
    /**
     * 删除用户
     * @param userId
     */
    @RequestMapping("del")
    public Result del(Long userId){
        return Result.success(userService.del(userId));
    }
    /**
     * 修改用户
     * @param user
     */
    @RequestMapping("update")
    public Result update(@RequestBody User user){
        return Result.success(userService.update(user));
    }
}
