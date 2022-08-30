package com.lxh.rabc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 角色
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    private Long id;
    private String roleTitle;
    private LocalDateTime createTime;
}
