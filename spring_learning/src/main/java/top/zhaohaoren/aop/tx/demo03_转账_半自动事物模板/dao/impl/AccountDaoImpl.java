package top.zhaohaoren.aop.tx.demo03_转账_半自动事物模板.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import top.zhaohaoren.aop.tx.demo03_转账_半自动事物模板.dao.AccountDao;

/**
 * AccountDaoImpl Create on 2018/5/8
 * Description:
 * 使用JdbcDaoSupport 来封装了JDBCTemplate
 * author justin
 * version 1.0
 * Copyright (c) 2018/5/8 by justin
 */

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void in(String payer, Integer money) {
        this.getJdbcTemplate().update("UPDATE account SET money = money - ? WHERE username = ?", money, payer);
    }

    @Override
    public void out(String payee, Integer money) {
        this.getJdbcTemplate().update("UPDATE account SET money = money + ? WHERE username = ?", money, payee);
    }
}
