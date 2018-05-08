package top.zhaohaoren.aop.tx.demo01_转账_基本jdbcTemplate.service.impl;

import top.zhaohaoren.aop.tx.demo01_转账_基本jdbcTemplate.dao.AccountDao;
import top.zhaohaoren.aop.tx.demo01_转账_基本jdbcTemplate.service.AccountService;

/**
 * AccountServiceImpl Create on 2018/5/8
 * Description:   
 *     
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
//        int i = 1/0;
        accountDao.out(payee,money);
    }
}
