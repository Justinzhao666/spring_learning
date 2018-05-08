package top.zhaohaoren.aop.tx.demo03_转账_半自动事物模板;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zhaohaoren.aop.tx.demo03_转账_半自动事物模板.service.AccountService;

public class AccountServiceImplTest {

    @Test
    public void test(){
        String xmlPath = "applicationContextTx03.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService =  (AccountService) applicationContext.getBean("proxyAccountService");
        accountService.transfer("jack", "rose", 1000);
    }

}
