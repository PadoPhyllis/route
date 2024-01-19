package com.padopphyllis.route.handler;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

@Service("handler1-1.0")
public class ApiHandler1 extends ApiAbstractHandler {

    public JSONObject handle(JSONObject req){
        JSONObject resp = new JSONObject();
        resp.put("code","0");
        resp.put("msg","调用Handler1成功!");

        return resp;
    }
}
