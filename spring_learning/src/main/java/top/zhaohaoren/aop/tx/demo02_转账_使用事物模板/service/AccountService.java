package top.zhaohaoren.aop.tx.demo02_转账_使用事物模板.service;

/**
 * AccountService Create on 2018/5/8
 * Description:   
 *     
 * author justin     
 * version 1.0 
 * Copyright (c) 2018/5/8 by justin   
 */ 
public interface AccountService {

    public void transfer(String payer, String payee, Integer money);
}
