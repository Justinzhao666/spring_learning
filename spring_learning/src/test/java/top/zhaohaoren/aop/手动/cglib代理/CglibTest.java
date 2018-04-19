package top.zhaohaoren.aop.手动.cglib代理;


import org.junit.Test;

public class CglibTest {

    @Test
    public void test1() {
        TargetImpl target = BeanFactory.createTarget();
        target.function1();
        target.function2();
        target.function3();
    }
}
