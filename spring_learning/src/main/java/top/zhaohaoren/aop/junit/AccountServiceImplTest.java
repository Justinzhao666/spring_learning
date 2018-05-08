package top.zhaohaoren.aop.junit;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.zhaohaoren.aop.tx.demo05_转账_全自动aop基于注解.service.AccountService;


/**
 *  三个注解完成junit整合
 *  1. RunWith：与spring整合，SpringJUnit4ClassRunner是属于spring的实现类，将该类交给junit让可以获取到spring的容器
 *  2. ContextConfiguration  1中还需要配置spring配置文件位置
 *  3. AutoWired    自动注入依赖对象
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTx05.xml")
public class AccountServiceImplTest {

    //在与junit进行整合的时候，我们不需要在xml里面配置扫描对应类的包，junit会自动去扫描
    @Autowired
    private AccountService accountService;

    @Test
    public void test(){
//        String xmlPath = "applicationContextTx05.xml";
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//        AccountService accountService =  (AccountService) applicationContext.getBean("accountService");
        /*上面这三个步骤都是可以不要的，我们只是想执行下面这句话就行了*/
        accountService.transfer("jack", "rose", 1000);
    }

}
