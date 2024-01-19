package com.padopphyllis.route.controller;

import com.alibaba.fastjson.JSONObject;
import com.padopphyllis.route.service.ApiBaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class TestController {
    @Autowired
    private ApiBaseService apiBaseService;

    @PostMapping(value = "/test/{method:.+}/{version:.+}")
    public JSONObject test(@RequestBody JSONObject req, @PathVariable String method,@PathVariable String version){
        log.info("接受到请求报文={}，method={}，version={}",req.toJSONString(),method,version);

        req.put("method",method);
        req.put("version",version);

        JSONObject resp = apiBaseService.invoke(req);

        log.info("获取到响应报文={}",resp.toJSONString());

        return resp;
    }
}
