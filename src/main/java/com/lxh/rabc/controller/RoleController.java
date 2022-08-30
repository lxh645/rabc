package com.lxh.rabc.controller;

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
    public List<Role> search(){
        return roleService.search();
    }

    /**
     * 添加角色
     * @param role
     */
    @RequestMapping("add")
    public Integer search(@RequestBody Role role){
        return roleService.add(role);
    }
    /**
     * 删除角色
     * @param roleId
     */
    @RequestMapping("del")
    public Integer del(Long roleId){
        System.out.println(roleId);
        return roleService.del(roleId);
    }
    /**
     * 修改角色
     * @param role
     */
    @RequestMapping("update")
    public Integer update(@RequestBody Role role){
        return roleService.update(role);
    }
}
