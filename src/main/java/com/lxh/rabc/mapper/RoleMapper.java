package com.lxh.rabc.mapper;

import com.lxh.rabc.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    List<Role> search();

    Integer add(Role role);

    Integer del(Long roleId);

    Integer update(Role role);
}
