package com.lxh.rabc.mapper;

import com.lxh.rabc.entity.Jurisdiction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JurisdictionMapper {
    List<Jurisdiction> search();

    Integer add(Jurisdiction jurisdiction);

    Integer del(Long jurisdictionId);

    Integer update(Jurisdiction jurisdiction);
}
