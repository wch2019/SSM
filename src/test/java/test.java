import com.wch.ssm.bean.AccountBean;
import com.wch.ssm.dao.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Author：WCH
 * @Version: v
 * @Date ：2020/3/19 12:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:conf/spring/spring.xml"})
public class test {
    @Autowired
    private AccountDao accountDao;
    @Test
    public void findBySfz() {
        AccountBean account =new AccountBean();
        account.setId(3);
        account.setName("1");
        account.setMoney(200d);

      /*      accountDao.selectByPrimaryKey(1);*/
        System.out.println(accountDao.insert(account));
    }
}
