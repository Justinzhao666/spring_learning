package top.zhaohaoren.aop.tx.demo04_转账_全自动aop基于xml.dao;

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
