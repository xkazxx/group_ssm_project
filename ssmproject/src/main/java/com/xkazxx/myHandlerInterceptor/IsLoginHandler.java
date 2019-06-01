package com.xkazxx.myHandlerInterceptor;

import com.xkazxx.bean.SysUser;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IsLoginHandler implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        SysUser sysUser = (SysUser) request.getSession().getAttribute("sysUser");
        if (sysUser == null){
            String requestURI = request.getRequestURI();
            if(requestURI.endsWith("/ajaxLogin")){
                return true;
            }
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            return false;
        }
        else {
            return true;
        }
    }

}
