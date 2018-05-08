package top.zhaohaoren.aop.tx.demo04_转账_全自动aop基于xml.service;

/**
 * AccountService Create on 2018/5/8
 * Description:
 * <p>
 * author justin
 * version 1.0
 * Copyright (c) 2018/5/8 by justin
 */
public interface AccountService {

    public void transfer(String payer, String payee, Integer money);
}
