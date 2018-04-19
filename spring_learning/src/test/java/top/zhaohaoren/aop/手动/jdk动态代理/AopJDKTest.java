package top.zhaohaoren.aop.手动.jdk动态代理;

import org.junit.Test;
import top.zhaohaoren.aop.手动.jdk动态代理.BeanFactory;
import top.zhaohaoren.aop.手动.jdk动态代理.Target;

public class AopJDKTest {

    @Test
    public void test1() {
        Target target = BeanFactory.createTarget();
        target.function1();
        target.function2();
        target.function3();
    }
}
