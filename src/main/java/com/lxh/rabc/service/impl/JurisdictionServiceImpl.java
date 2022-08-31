package com.lxh.rabc.service.impl;

import com.lxh.rabc.entity.Jurisdiction;
import com.lxh.rabc.mapper.JurisdictionMapper;
import com.lxh.rabc.mapper.RoleJurisdictionMapper;
import com.lxh.rabc.service.JurisdictionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class JurisdictionServiceImpl implements JurisdictionService {

    @Resource
    JurisdictionMapper jurisdictionMapper;

    @Resource
    RoleJurisdictionMapper roleJurisdictionMapper;

    @Override
    public List<Jurisdiction> search() {
        return jurisdictionMapper.search();
    }

    /**
     * 添加权限
     * @param jurisdiction
     * @return
     */
    @Override
    public Integer add(Jurisdiction jurisdiction) {
        jurisdiction.setCreateTime(LocalDateTime.now());
        return jurisdictionMapper.add(jurisdiction);
    }

    /**
     * 删除权限
     * @param jurisdictionId
     * @return
     */
    @Override
    public String del(Long jurisdictionId) {
        Integer byJurisdictionId = roleJurisdictionMapper.findByJurisdictionId(jurisdictionId);
        if (byJurisdictionId.intValue()>0){
            return "删除失败，有角色在使用权限！";
        }
        Integer del = jurisdictionMapper.del(jurisdictionId);
        if (del.intValue() == 1){
            return "删除成功";
        }
        return "删除失败，请检查参数";
    }

    /**
     * 修改权限
     * @param jurisdiction
     * @return
     */
    @Override
    public Integer update(Jurisdiction jurisdiction) {
        return jurisdictionMapper.update(jurisdiction);
    }
}
