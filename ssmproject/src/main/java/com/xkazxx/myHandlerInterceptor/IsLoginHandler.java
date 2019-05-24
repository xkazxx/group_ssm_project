package com.xkazxx.myHandlerInterceptor;

import com.xkazxx.bean.SysUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IsLoginHandler implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        SysUser sysUser = (SysUser) request.getSession().getAttribute("sysUser");
        if (sysUser == null){
            StringBuffer requestURL = request.getRequestURL();
            if(requestURL.toString().endsWith("/ajaxLogin")){
                return true;
            }
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            return true;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
