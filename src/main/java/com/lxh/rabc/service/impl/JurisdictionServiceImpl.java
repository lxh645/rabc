package com.lxh.rabc.service.impl;

import com.lxh.rabc.entity.Jurisdiction;
import com.lxh.rabc.mapper.JurisdictionMapper;
import com.lxh.rabc.service.JurisdictionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class JurisdictionServiceImpl implements JurisdictionService {

    @Resource
    JurisdictionMapper jurisdictionMapper;

    @Override
    public List<Jurisdiction> search() {
        return jurisdictionMapper.search();
    }

    @Override
    public Integer add(Jurisdiction jurisdiction) {
        jurisdiction.setCreateTime(LocalDateTime.now());
        return jurisdictionMapper.add(jurisdiction);
    }

    @Override
    public Integer del(Long jurisdictionId) {
        return jurisdictionMapper.del(jurisdictionId);
    }

    @Override
    public Integer update(Jurisdiction jurisdiction) {
        return jurisdictionMapper.update(jurisdiction);
    }
}
