package com.lxh.rabc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 权限
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jurisdiction {
    private Long id;
    private String jurisdiction;
    private LocalDateTime createTime;
}
