package com.lxh.rabc.controller;

import com.lxh.rabc.common.Result;
import com.lxh.rabc.entity.Jurisdiction;
import com.lxh.rabc.entity.User;
import com.lxh.rabc.service.JurisdictionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限
 */
@RestController
@RequestMapping("jurisdiction")
public class JurisdictionController {
    @Resource
    JurisdictionService jurisdictionService;

    @RequestMapping("search")
    public Result search(){
        return Result.success(jurisdictionService.search());
    }

    /**
     * 添加权限
     * @param jurisdiction
     */
    @RequestMapping("add")
    public Result search(@RequestBody Jurisdiction jurisdiction){
        return Result.success(jurisdictionService.add(jurisdiction));
    }
    /**
     * 删除权限
     * @param jurisdictionId
     */
    @RequestMapping("del")
    public Result del(Long jurisdictionId){
        return Result.success(jurisdictionService.del(jurisdictionId));
    }
    /**
     * 修改权限
     * @param jurisdiction
     */
    @RequestMapping("update")
    public Result update(@RequestBody Jurisdiction jurisdiction){
        return Result.success(jurisdictionService.update(jurisdiction));
    }
}
