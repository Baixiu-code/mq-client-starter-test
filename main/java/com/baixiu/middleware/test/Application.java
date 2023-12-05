package com.baixiu.middleware.test;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author baixiu
 * @date 创建时间 2023/11/29 9:03 PM
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.baixiu.middleware.test","com.baixiu.middleware.mq"})
public class Application  extends SpringBootServletInitializer implements ApplicationContextAware{

    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        System.out.println ("middleware.test started");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    protected ApplicationContext getApplicationContext() {
        return this.applicationContext;
    }
}
