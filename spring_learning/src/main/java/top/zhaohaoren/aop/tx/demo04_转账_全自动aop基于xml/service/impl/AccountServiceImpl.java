package top.zhaohaoren.aop.tx.demo04_转账_全自动aop基于xml.service.impl;

import top.zhaohaoren.aop.tx.demo04_转账_全自动aop基于xml.dao.AccountDao;
import top.zhaohaoren.aop.tx.demo04_转账_全自动aop基于xml.service.AccountService;

/**
 * AccountServiceImpl Create on 2018/5/8
 * Description:   
 *     可以和1比较，代码部分我们完全没有变，只是改了spring的配置文件就完成了事物引入，这就是aop的强大之处
 * author justin     
 * version 1.0 
 * Copyright (c) 2018/5/8 by justin   
 */ 
 
public class AccountServiceImpl implements AccountService {


    AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String payer, String payee, Integer money) {
        accountDao.in(payer,money);
        int i = 1/0;
        accountDao.out(payee,money);
    }
}
