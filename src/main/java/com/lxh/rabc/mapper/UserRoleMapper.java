package com.lxh.rabc.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapper {
    Integer findByRoleId(Long roleId);
}
