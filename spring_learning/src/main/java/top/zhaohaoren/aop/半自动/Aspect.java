package top.zhaohaoren.aop.半自动;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Aspect Create on 2018/4/19
 * Description:
 * 切面类，增强的代码， AOP联盟为我们定义了几个接口用于不同层次的切面
 * 该例 以环绕模式为例子
 * author justin
 * version 1.0
 * Copyright (c) 2018/4/19 by justin
 */

public class Aspect implements MethodInterceptor { //导入的是aop联盟的接口
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("before");

        //手动的去执行方法
        Object o  = methodInvocation.proceed();

        System.out.println("after");

        return o;
    }
}
