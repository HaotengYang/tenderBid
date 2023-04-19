package com.example.test2.service.impl;

import com.example.test2.mapper.EnterpriseInfoMapper;
import com.example.test2.model.EnterpriseInfoResult;
import com.example.test2.service.EnterpriseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EnterpriseInfoServiceImpl implements EnterpriseInfoService {
    @Resource // 注入mapper用@Resource，注入service用@Autowired。
    private EnterpriseInfoMapper enterpriseInfoMapper;

    @Override
    public List<EnterpriseInfoResult> selectEnterpriseInfoList(int pageSize, int start) {
        return enterpriseInfoMapper.selectEnterpriseInfoList(pageSize, start);
    }
}
