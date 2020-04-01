package mapper.weidu.dao;

import mapper.weidu.bean.AccountBean;

public interface AccountDao {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountBean record);

    int insertSelective(AccountBean record);

    AccountBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccountBean record);

    int updateByPrimaryKey(AccountBean record);
}