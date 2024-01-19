package com.padopphyllis.route.handler;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

@Service("handler2-1.0")
public class ApiHandler2 extends ApiAbstractHandler {

    public JSONObject handle(JSONObject req){
        JSONObject resp = new JSONObject();
        resp.put("code","0");
        resp.put("msg","调用Handler2成功!");

        return resp;
    }
}
