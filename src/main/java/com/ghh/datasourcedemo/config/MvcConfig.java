package com.ghh.datasourcedemo.config;

import com.ghh.datasourcedemo.inteceptor.MyInteceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //拦截器配置
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        //添加拦截器，相当于springmvc中的bean，创建一个拦截器
//        registry.addInterceptor(new MyInteceptor())
//                //拦截所有请求
//        .addPathPatterns("/**");
    }
}
