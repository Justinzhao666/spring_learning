package top.zhaohaoren.aop.手动.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * BeanFactory Create on 2018/4/19
 * Description:
 * 工厂造对象
 * author justin
 * version 1.0
 * Copyright (c) 2018/4/19 by justin
 */

public class BeanFactory {
    public static Target createTarget() {
        //使用jdk进行织入
        final TargetImpl target = new TargetImpl();
        final Aspect aspect = new Aspect();

        //jdk的动态代理
        return (Target) Proxy.newProxyInstance(BeanFactory.class.getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                aspect.before();
                //实现目标类的方法
                Object o =  method.invoke(target,args);
                aspect.after();
                return o;
            }
        });
    }
}
