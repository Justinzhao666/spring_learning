package top.zhaohaoren.aop.tx.demo01_转账_基本jdbcTemplate.dao;

/**
 * Account Create on 2018/5/8
 * Description:
 * <p>
 * author justin
 * version 1.0
 * Copyright (c) 2018/5/8 by justin
 */
public interface AccountDao {

    public void in(String payer,Integer money);

    public void out(String payee,Integer money);
}
