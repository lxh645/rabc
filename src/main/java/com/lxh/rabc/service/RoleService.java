package com.lxh.rabc.service;

import com.lxh.rabc.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> search();

    Integer add(Role role);

    Integer del(Long roleId);

    Integer update(Role role);
}
