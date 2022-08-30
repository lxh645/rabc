package com.lxh.rabc.controller;

import com.lxh.rabc.common.Result;
import com.lxh.rabc.entity.Role;
import com.lxh.rabc.entity.User;
import com.lxh.rabc.service.RoleService;
import com.lxh.rabc.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色
 */
@RestController
@RequestMapping("role")
public class RoleController {
    @Resource
    RoleService roleService;

    @RequestMapping("search")
    public Result search(){
        return Result.success(roleService.search());
    }

    /**
     * 添加角色
     * @param role
     */
    @RequestMapping("add")
    public Result search(@RequestBody Role role){
        return Result.success(roleService.add(role));
    }
    /**
     * 删除角色
     * @param roleId
     */
    @RequestMapping("del")
    public Result del(Long roleId){
        return Result.success(roleService.del(roleId));
    }
    /**
     * 修改角色
     * @param role
     */
    @RequestMapping("update")
    public Result update(@RequestBody Role role){
        return Result.success(roleService.update(role));
    }
}
