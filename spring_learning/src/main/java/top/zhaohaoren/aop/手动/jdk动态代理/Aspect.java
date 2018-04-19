package top.zhaohaoren.aop.手动.jdk动态代理;

/**
 * Aspect Create on 2018/4/19
 * Description:
 * 切面类，增强的代码
 * author justin
 * version 1.0
 * Copyright (c) 2018/4/19 by justin
 */

public class Aspect {


    public void before() {
        System.out.println("before");
    }

    public void after() {
        System.out.println("after");
    }

}
