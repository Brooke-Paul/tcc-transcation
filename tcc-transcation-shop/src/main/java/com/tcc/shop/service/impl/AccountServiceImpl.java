package com.tcc.shop.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tcc.api.entity.Account;
import com.tcc.api.exception.ServiceException;
import com.tcc.service.AccountService;

import java.math.BigDecimal;

/**
 * Program Name: PayServiceImpl
 * Description:
 * Created by xuetao on 2020/3/25
 *
 * @author xuetao
 * @version 1.0
 */

@Service(group = "tcc")
public class AccountServiceImpl implements AccountService {
    @Override
    public int insert(Account account) throws ServiceException {
        return 0;
    }

    @Override
    public int update(Account account) throws ServiceException {
        return 0;
    }

    @Override
    public int delete(String accountId) throws ServiceException {
        return 0;
    }

    @Override
    public Account findById(String accountId) throws ServiceException {
        return null;
    }

    @Override
    public int transfer(String fromUser, String toUser, BigDecimal amount) throws ServiceException {
        return 0;
    }
}
