package com.wch.ssm.controller;

import com.wch.ssm.bean.AccountBean;
import com.wch.ssm.dao.AccountDao;
import com.wch.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author：WCH
 * @Version: v
 * @Date ：2020/3/19 9:37
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/account/findAll")
    public String findAll(){
        System.out.println("Controller表现层：查询所有账户...");
        List<AccountDao> list=accountService.findAll();
        return "index";  //在视图解析器中配置了前缀后缀
    }
}
