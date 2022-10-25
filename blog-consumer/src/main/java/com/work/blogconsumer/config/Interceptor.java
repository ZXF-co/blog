package com.work.blogconsumer.config;

import com.work.blogconsumer.entity.Consumer;
import com.work.blogconsumer.entity.UserManager;
import com.work.blogconsumer.service.RedisService;
import com.work.blogconsumer.tools.TokenUtil;
import org.omg.CORBA.TIMEOUT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * 配置全局token
 *
 * @author zhouxiaofa
 * @date 2022/10/22 11:32
 */
@Component
public class Interceptor implements HandlerInterceptor {

    Logger logger = LoggerFactory.getLogger(Interceptor.class);
    @Resource
    private RedisService redisService;

    /**
     * Controller逻辑执行之前
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        logger.info("preHandle...");
        String uri = request.getRequestURI();
        logger.info("当前路径:" + uri);

        if(!(handler instanceof HandlerMethod)) {
            return true;
        }
        String token = request.getHeader("token");
        if(!TokenUtil.verify(token)) {
            throw new RuntimeException("Please login first!");
        } else {
            Consumer consumer = (Consumer) TokenUtil.getObject(token);
            UserManager.set(consumer);
            // response.setCharacterEncoding("UTF-8");
            // response.setContentType("text/html;charset=utf-8");
            // Object loginStatus = redisService.get(token);
            // if(Objects.isNull(loginStatus)) {
            //    throw new RuntimeException("The token has been a state-owned enterprise");
            // }
            // redisService.update(token);
            return true;
        }
    }

    /**
     * Controller逻辑执行完毕,视图解析器未解析之前
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) {
        logger.info("postHandle...");
    }

    /**
     * Controller和视图解析器都执行完毕
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        logger.info("afterCompletion...");
    }
}

