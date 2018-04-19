package top.zhaohaoren.aop.手动.jdk动态代理;

/**
 * TargetImpl Create on 2018/4/19
 * Description:
 * 目标类
 * author justin
 * version 1.0
 * Copyright (c) 2018/4/19 by justin
 */

public class TargetImpl implements Target {
    @Override
    public void function1() {
        System.out.println("function1");
    }

    @Override
    public void function2() {
        System.out.println("function2");
    }

    @Override
    public void function3() {
        System.out.println("function3");
    }

}
