package top.zhaohaoren.aop.tx.demo03_转账_半自动事物模板.service.impl;

import top.zhaohaoren.aop.tx.demo03_转账_半自动事物模板.dao.AccountDao;
import top.zhaohaoren.aop.tx.demo03_转账_半自动事物模板.service.AccountService;

/**
 * AccountServiceImpl Create on 2018/5/8
 * Description:
 * 02中测试获取的直接是service的对象，并且我们需要自己去配置事物模板，其实应该交给Spring来帮我们生成对应的代理类对象
 * author justin
 * version 1.0
 * Copyright (c) 2018/5/8 by justin
 */

public class AccountServiceImpl implements AccountService {


    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(final String payer, final String payee, final Integer money) {
        accountDao.in(payer, money);
//        int i = 1 / 0;
        accountDao.out(payee, money);
    }
}
