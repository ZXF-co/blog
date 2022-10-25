package com.work.blogconsumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * 配置登录拦截器
 *
 * @author zhouxiaofa
 * @date 2022/10/22 15:04
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Resource
    private Interceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/**")
                // 放行登录接口地址
                .excludePathPatterns("/v1/consumer/login");
    }
}
