package com.lxh.rabc.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleJurisdictionMapper {
    Integer findByJurisdictionId(Long jurisdictionId);
}
