package com.work.blogcommon.config;

import com.work.blogcommon.tools.TokenUtil;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 *
 * @author zhouxiaofa
 * @date 2022/10/22 11:32
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("preHandle...");
        String uri = request.getRequestURI();
        System.out.println("当前路径:" + uri);

        if(!(handler instanceof HandlerMethod)) {
            return true;
        }
        String token = request.getHeader("token");
        if(!TokenUtil.verify(token)) {
            throw new RuntimeException("Please login first!");
        } else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) {
        System.out.println("postHandle...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        System.out.println("afterCompletion...");
    }
}
