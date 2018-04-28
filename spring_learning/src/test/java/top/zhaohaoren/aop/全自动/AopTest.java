package top.zhaohaoren.aop.全自动;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void test(){
        String xmlPath = "bean.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 应该获取代理类
        Target target = (Target) applicationContext.getBean("aop_target");
        target.function1();
        target.function2();
        target.function3();
    }
}
