package com.xkazxx.controller;

import com.xkazxx.bean.SysUser;
import com.xkazxx.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zachary Zhao
 * @create 2019-05-17 17:09
 */
@Controller
@EnableAspectJAutoProxy
public class HomeController {
    @Autowired
    HomeService homeService;


    @RequestMapping("/ajaxLogin")
    @ResponseBody
    public Map login(HttpSession session, String username, String password) {
        SysUser sysUser = homeService.login(username, password);
        Map map = new HashMap();
        String msg;
        if (sysUser != null) {
            if ("1".equals(sysUser.getLocked())) {
                session.setAttribute("sysUser", sysUser);
                msg = "欢迎";
            } else {
                msg = "authentication_error";
            }
        } else {
            msg = "account_error";
        }
        map.put("msg", msg);
        return map;
    }

    @RequestMapping("/")
    public String getLoginJsp() {
        return "login";
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("sysUser");
        return "login";
    }

    @RequestMapping("/home")
    public String home(HttpSession session) {
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

        //人员模块
        list.add("department:add");
        list.add("department:edit");
        list.add("department:delete");
        list.add("employee:add");
        list.add("employee:edit");
        list.add("employee:delete");


        //请写上自己模块名字,在jsp中找到对应的xxx_list.jsp页面
        session.setAttribute("sysPermissionList", list);
        return "home";
    }


   /* @RequestMapping("/")
    public String home(HttpSession session) {
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

        //人员模块
        list.add("department:add");
        list.add("department:edit");
        list.add("department:delete");
        list.add("employee:add");
        list.add("employee:edit");
        list.add("employee:delete");


        //请写上自己模块名字,在jsp中找到对应的xxx_list.jsp页面
        session.setAttribute("sysPermissionList", list);
        return "home";
    }*/
}
