package top.zhaohaoren.aop.tx.demo01_转账_基本jdbcTemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zhaohaoren.aop.tx.demo01_转账_基本jdbcTemplate.service.AccountService;

public class AccountServiceImplTest {

    @Test
    public void test(){
        String xmlPath = "applicationContextTx01.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService =  (AccountService) applicationContext.getBean("accountService");
        accountService.transfer("jack", "rose", 1000);
    }

}
