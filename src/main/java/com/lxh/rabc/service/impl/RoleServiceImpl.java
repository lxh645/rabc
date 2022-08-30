package com.lxh.rabc.service.impl;

import com.lxh.rabc.entity.Role;
import com.lxh.rabc.mapper.RoleMapper;
import com.lxh.rabc.mapper.UserMapper;
import com.lxh.rabc.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    RoleMapper roleMapper;
    @Override
    public List<Role> search() {
        return roleMapper.search();
    }

    @Override
    public Integer add(Role role) {
        role.setCreateTime(LocalDateTime.now());
        return roleMapper.add(role);
    }

    @Override
    public Integer del(Long roleId) {
        return roleMapper.del(roleId);
    }

    @Override
    public Integer update(Role role) {
        return roleMapper.update(role);
    }
}
