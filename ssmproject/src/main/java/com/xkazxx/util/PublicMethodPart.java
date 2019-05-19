package com.xkazxx.util;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PublicMethodPart {

    public static Map optionSuccess(boolean success){
        java.util.Map map = new HashMap();
        if(success) {
            map.put("msg", "ok");
            map.put("status", 200);
            map.put("data", null);
        }
        return map;
    }

    public static Map judgeResult(String msg){
        Map map = new HashMap();
        map.put("msg", msg);
        return map;
    }
}
