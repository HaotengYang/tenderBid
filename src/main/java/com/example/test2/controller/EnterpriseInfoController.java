package com.example.test2.controller;

import com.example.test2.model.EnterpriseInfoResult;
import com.example.test2.service.EnterpriseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterpriseInfo")
public class EnterpriseInfoController {
    @Autowired
    private EnterpriseInfoService enterpriseInfoService;

    @GetMapping("/selectEnterpriseInfoList")
    @ResponseBody // 序列化：java对象 --> json数据
    public ResponseEntity<List<EnterpriseInfoResult>> selectEnterpriseInfoList( // 封装HTTP请求状态等等
    @RequestParam("pageSize") int pageSize,
    @RequestParam("start") int start) { // 获取请求参数
        System.out.println("查询成功！");
        List<EnterpriseInfoResult> enterpriseInfoResultList = enterpriseInfoService.selectEnterpriseInfoList(pageSize, start);
        return new ResponseEntity<>(enterpriseInfoResultList, HttpStatus.OK);
    }
}


