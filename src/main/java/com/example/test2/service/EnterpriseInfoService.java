package com.example.test2.service;

import com.example.test2.entity.EnterpriseInfo;
import com.example.test2.model.EnterpriseInfoResult;

import java.util.List;

public interface EnterpriseInfoService {
    List<EnterpriseInfoResult> selectEnterpriseInfoList(int pageSize, int start);
}
