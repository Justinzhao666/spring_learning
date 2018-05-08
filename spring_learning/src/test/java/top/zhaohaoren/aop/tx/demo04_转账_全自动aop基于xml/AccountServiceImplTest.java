package top.zhaohaoren.aop.tx.demo04_转账_全自动aop基于xml;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zhaohaoren.aop.tx.demo04_转账_全自动aop基于xml.service.AccountService;

public class AccountServiceImplTest {

    @Test
    public void test(){
        String xmlPath = "applicationContextTx04.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        AccountService accountService =  (AccountService) applicationContext.getBean("accountService");
        accountService.transfer("jack", "rose", 1000);
    }

}
