package com.wch.ssm.service;


import com.wch.ssm.dao.AccountDao;

import java.util.List;

public interface AccountService {
    // 查询所有账户
    public List<AccountDao> findAll();

    // 保存帐户信息
    public void saveAccount(AccountDao accountBean);
}
