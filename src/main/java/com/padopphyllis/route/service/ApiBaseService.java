package com.padopphyllis.route.service;

import com.alibaba.fastjson.JSONObject;
import com.padopphyllis.route.handler.ApiAbstractHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class ApiBaseService {

    @Autowired
    private Map<String, ApiAbstractHandler> apiServiceMap = new HashMap<>();

    public JSONObject invoke(JSONObject req){
        JSONObject resp = new JSONObject();

        try{
            ApiAbstractHandler service = apiServiceMap.get(req.getString("method") + "-" + req.getString("version"));
            resp = service.handle(req);

        }catch (Exception e){
            resp.put("code","1");
            resp.put("msg","执行失败");
        }

        return resp;
    }
}
