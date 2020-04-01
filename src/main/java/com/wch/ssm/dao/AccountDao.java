package com.wch.ssm.dao;

import com.wch.ssm.bean.AccountBean;

import java.util.List;

public interface AccountDao {

    public List<AccountBean> findAll();

    public void saveAccount(AccountBean accountBean);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountBean record);

    int insertSelective(AccountBean record);

    AccountBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccountBean record);

    int updateByPrimaryKey(AccountBean record);
}