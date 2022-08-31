package com.lxh.rabc.service;

import com.lxh.rabc.entity.Jurisdiction;
import com.lxh.rabc.entity.User;

import java.util.List;

public interface JurisdictionService {
    List<Jurisdiction> search();

    Integer add(Jurisdiction jurisdiction);

    String del(Long jurisdictionId);

    Integer update(Jurisdiction jurisdiction);
}
