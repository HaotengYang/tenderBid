package com.example.test2.mapper;

import com.example.test2.model.EnterpriseInfoResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EnterpriseInfoMapper {
    List<EnterpriseInfoResult> selectEnterpriseInfoList(
            @Param("pageSize") int pageSize,
            @Param("start") int start
    );
}
