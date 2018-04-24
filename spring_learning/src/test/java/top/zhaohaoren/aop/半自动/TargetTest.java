package top.zhaohaoren.aop.半自动;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TargetTest {

    @Test
    public void test(){
        String xmlPath = "bean.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 应该获取代理类
        Target target = (Target) applicationContext.getBean("proxyTargetID");
        target.function1();
        target.function2();
        target.function3();
    }
}
