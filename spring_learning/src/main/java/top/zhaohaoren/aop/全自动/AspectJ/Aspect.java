package top.zhaohaoren.aop.全自动.AspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Aspect Create on 2018/4/19
 * Description:
 * AspectJ的切面类，通知方法名任意的：将来自定义功能的时候使用这个
 * author justin
 * version 1.0
 * Copyright (c) 2018/4/19 by justin
 */

public class Aspect { //导入的是aop联盟的接口

    /**
     * 前置通知，可有参数：可以获取切入点的方法名字（参数可选）
     * @param joinPoint
     */
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知"+joinPoint.getSignature());
    }

    /**
     * 后置通知 （参数可选）
     * @param joinPoint  切入点
     * @param ret 目标类方法的返回值，类型必须是object
     */
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
            System.out.println("后置通知"+joinPoint.getSignature() +","+ret);
    }


    /**
     * 环绕通知（参数必须）
     * @param joinPoint ProceedingJoinPoint 必须是JoinPoint子类
     * @throws Throwable 环绕通知必须抛异常
     * @return 返回值必须是Object类型的
     */
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕通知 前"+joinPoint.getSignature());
        //执行目标方法
        Object obj = joinPoint.proceed();
        System.out.println("环绕通知 后"+joinPoint.getSignature());
        return obj;
    }

    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("抛出异常通知 ： " + e.getMessage());
    }

    public void myAfter(JoinPoint joinPoint){
        System.out.println("最终通知");
    }
}
