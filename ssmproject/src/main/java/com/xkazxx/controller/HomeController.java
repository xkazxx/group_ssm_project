package com.xkazxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Zachary Zhao
 * @create 2019-05-17 17:09
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(HttpSession httpSession){
        List list = new ArrayList();
        //计划模块
        list.add("order:add");
        list.add("order:edit");
        list.add("order:delete");
        list.add("custom:add");
        list.add("custom:edit");
        list.add("custom:delete");
        list.add("product:add");
        list.add("product:edit");
        list.add("product:delete");
        list.add("task:add");
        list.add("task:edit");
        list.add("task:delete");
        list.add("manufacture:add");
        list.add("manufacture:edit");
        list.add("manufacture:delete");
        list.add("work:add");
        list.add("work:edit");
        list.add("work:delete");

        //设备模块
        list.add("device:add");
        list.add("device:edit");
        list.add("device:delete");
        list.add("deviceType:add");
        list.add("deviceType:edit");
        list.add("deviceType:delete");
        list.add("deviceCheck:add");
        list.add("deviceCheck:edit");
        list.add("deviceCheck:delete");
        list.add("deviceFault:add");
        list.add("deviceFault:edit");
        list.add("deviceFault:delete");
        list.add("deviceMaintain:add");
        list.add("deviceMaintain:edit");
        list.add("deviceMaintain:delete");

        //请写上自己模块名字,在jsp中找到对应的xxx_list.jsp页面
        httpSession.setAttribute("sysPermissionList",list);
        return "home";
    }


}
