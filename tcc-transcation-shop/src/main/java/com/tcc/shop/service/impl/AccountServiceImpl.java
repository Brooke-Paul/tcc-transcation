package com.tcc.shop.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tcc.api.entity.Account;
import com.tcc.api.exception.ServiceException;
import com.tcc.service.AccountService;
import com.tcc.shop.mapper.AccountMapper;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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

    @Resource
    private AccountMapper accountMapper;

    @Override
    public int insert(Account account) throws ServiceException {
        return accountMapper.insert(account);
    }

    @Override
    public int update(Account account) throws ServiceException {
        return accountMapper.update(account);
    }

    @Override
    public int delete(String accountId) throws ServiceException {
        return accountMapper.delete(accountId);
    }

    @Override
    public Account findById(String accountId) throws ServiceException {
        return accountMapper.findById(accountId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int transfer(String fromUser, String toUser, BigDecimal amount) throws ServiceException {
        accountMapper.transfer(fromUser, BigDecimal.ZERO.subtract(amount));
        accountMapper.transfer(toUser, BigDecimal.ZERO.add(amount));
        return 1;
    }
}
