package top.zhaohaoren.aop.全自动.AspectJ_Anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Aspect Create on 2018/4/19
 * Description:
 * AspectJ的切面类，通知方法名任意的：将来自定义功能的时候使用这个
 * author justin
 * version 1.0
 * Copyright (c) 2018/4/19 by justin
 */
@Component
@org.aspectj.lang.annotation.Aspect
public class Aspect { //导入的是aop联盟的接口

    /**
     * 替换aop中的公共切入点，这样别的通知注解就可以直接使用了
     */
    @Pointcut("execution(* top.zhaohaoren.aop.全自动.AspectJ_Anno.*.*(..))")
    private void myPointCut(){
    }


    /**
     * 前置通知，可有参数
     * 【注解中的参数】
     *  默认参数值为value，当参数只有一个的时候默认为value，并且value可以不写
     *  当参数有多个的时候必须要写上value
     */
    @Before("execution(* top.zhaohaoren.aop.全自动.AspectJ_Anno.*.*(..))")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知"+joinPoint.getSignature());
    }

    /**
     * 后置通知 （参数可选）
     *
     * 使用配置的公共切入点直接value填入方法即可
     */
    @AfterReturning(value="myPointCut()" ,returning="ret")
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
            System.out.println("后置通知"+joinPoint.getSignature() +","+ret);
    }


    /**
     * 环绕通知（参数必须）
     */
    @Around(value = "myPointCut()")
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕通知 前"+joinPoint.getSignature());
        //执行目标方法
        Object obj = joinPoint.proceed();
        System.out.println("环绕通知 后"+joinPoint.getSignature());
        return obj;
    }

    @AfterThrowing(value="myPointCut()" ,throwing="e")
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("抛出异常通知 ： " + e.getMessage());
    }

    @After(value = "myPointCut()")
    public void myAfter(JoinPoint joinPoint){
        System.out.println("最终通知");
    }
}
