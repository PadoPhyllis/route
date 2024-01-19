package com.padopphyllis.route.handler;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public abstract class ApiAbstractHandler {
     public JSONObject handle(JSONObject req) {
        return null;
    }
}
