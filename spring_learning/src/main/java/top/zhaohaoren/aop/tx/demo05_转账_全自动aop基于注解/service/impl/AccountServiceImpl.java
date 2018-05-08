package top.zhaohaoren.aop.tx.demo05_转账_全自动aop基于注解.service.impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.zhaohaoren.aop.tx.demo05_转账_全自动aop基于注解.dao.AccountDao;
import top.zhaohaoren.aop.tx.demo05_转账_全自动aop基于注解.service.AccountService;

/**
 * AccountServiceImpl Create on 2018/5/8
 * Description:   
 *    @Transactional(propagation=Propagation.REQUIRED , isolation = Isolation.DEFAULT)
 *    对类上加上这个注解，表示对所有的方法都采用事物
 *    对方法加注解，表示只针对这个方法
 *
 *    propagation 传播属性
 *    isolation 隔离界别
 * author justin
 * version 1.0 
 * Copyright (c) 2018/5/8 by justin   
 */
@Transactional(propagation= Propagation.REQUIRED , isolation = Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {


    AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String payer, String payee, Integer money) {
        accountDao.in(payer,money);
//        int i = 1/0;
        accountDao.out(payee,money);
    }
}
