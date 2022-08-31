package com.lxh.rabc.service.impl;

import com.lxh.rabc.entity.Role;
import com.lxh.rabc.mapper.RoleMapper;
import com.lxh.rabc.mapper.UserRoleMapper;
import com.lxh.rabc.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    RoleMapper roleMapper;

    @Resource
    UserRoleMapper userRoleMapper;
    @Override
    public List<Role> search() {
        return roleMapper.search();
    }

    /**
     * 添加角色
     * @param role
     * @return
     */
    @Override
    public Integer add(Role role) {
        role.setCreateTime(LocalDateTime.now());
        return roleMapper.add(role);
    }

    /**
     * 删除角色
     * @param roleId
     * @return
     */
    @Override
    public Object del(Long roleId) {
        Integer byRoleId = userRoleMapper.findByRoleId(roleId);
        if (byRoleId.intValue() > 0){
            return "删除失败，有用户使用该角色";
        }else{
//            Integer del = roleMapper.del(roleId);
//            if (del.intValue() == 1){
//                return "删除成功";
//            }else {
//                return "删除失败，请检查有该角色么";
//            }
            return roleMapper.del(roleId).intValue() == 1 ? "删除成功": "删除失败，请检查有该角色么";
        }
    }

    /**
     * 修改角色
     * @param role
     * @return
     */
    @Override
    public Integer update(Role role) {
        return roleMapper.update(role);
    }
}
