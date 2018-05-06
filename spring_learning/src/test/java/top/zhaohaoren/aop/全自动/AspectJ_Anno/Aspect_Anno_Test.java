package top.zhaohaoren.aop.全自动.AspectJ_Anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aspect_Anno_Test {

    @Test
    public void test_Anno(){
        String xmlPath = "bean_aspectJ_Anno.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Target target = (Target) applicationContext.getBean("targetId");
        target.function1();
        target.function2();
        target.function3();
    }
}