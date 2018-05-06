package top.zhaohaoren.aop.全自动.AspectJ_Anno;

import org.springframework.stereotype.Service;

/**
 * TargetImpl Create on 2018/4/19
 * Description:
 * 目标类
 * author justin
 * version 1.0
 * Copyright (c) 2018/4/19 by justin
 */

@Service("targetId")
public class Target {
    public void function1() {
        System.out.println("function1");
    }

    public void function2() {
        System.out.println("function2");
    }
    
    public void function3() {
        System.out.println("function3");
    }

}
