package top.zhaohaoren.aop.手动.cglib代理;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * BeanFactory Create on 2018/4/19
 * Description:
 * 工厂造对象，使用cglib进行代理，就不需要编写接口了
 * author justin
 * version 1.0
 * Copyright (c) 2018/4/19 by justin
 */

public class BeanFactory {
    public static TargetImpl createTarget() {
        //使用jdk进行织入
        final TargetImpl target = new TargetImpl();
        final Aspect aspect = new Aspect();

        //cglib字节码增强： 在运行中生成target的子类来对target类进行增强
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                aspect.before();
                Object ojb = method.invoke(target,args);
                aspect.after();
                return ojb;
            }
        });

        return (TargetImpl) enhancer.create();
    }
}
