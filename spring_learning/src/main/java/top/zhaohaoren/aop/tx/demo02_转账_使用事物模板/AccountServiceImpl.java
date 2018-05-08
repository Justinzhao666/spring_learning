package top.zhaohaoren.aop.tx.demo02_转账_使用事物模板;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import top.zhaohaoren.aop.tx.demo02_转账_使用事物模板.dao.AccountDao;
import top.zhaohaoren.aop.tx.demo02_转账_使用事物模板.service.AccountService;

/**
 * AccountServiceImpl Create on 2018/5/8
 * Description:
 * 使用TransactionTemplate 来进行手动管理事物, 这里就已经开启事物了
 * author justin
 * version 1.0
 * Copyright (c) 2018/5/8 by justin
 */

public class AccountServiceImpl implements AccountService {


    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;

    //    xml方式进行依赖注入的时候必须要提供set方法
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(final String payer, final String payee, final Integer money) {

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.in(payer, money);
                int i = 1/0;
                accountDao.out(payee, money);
            }
        });

    }
}
