package com.wch.ssm.test;


import com.wch.ssm.service.AccountService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author：WCH
 * @Version: v
 * @Date ：2020/3/18 16:57
 */
public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:conf/spring/spring.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();
    }
}
