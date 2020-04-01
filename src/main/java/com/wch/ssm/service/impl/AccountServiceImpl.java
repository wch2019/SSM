package com.wch.ssm.service.impl;

import com.wch.ssm.dao.AccountDao;
import com.wch.ssm.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author：WCH
 * @Version: v
 * @Date ：2020/3/18 16:51
 */
    @Service("accountService")
    public class AccountServiceImpl implements AccountService {

    @Override
        public List<AccountDao> findAll() {
            System.out.println("Service业务层：查询所有账户...");
            return null;
        }

    @Override
    public void saveAccount(AccountDao accountBean) {
            System.out.println("Service业务层：保存帐户...");
        }
    }


