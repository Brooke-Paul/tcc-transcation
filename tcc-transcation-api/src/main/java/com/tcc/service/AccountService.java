package com.tcc.service;

import com.tcc.api.entity.Account;
import com.tcc.api.exception.ServiceException;

import java.math.BigDecimal;

/**
 * Program Name: AccountService
 * Description:
 * Created by xuetao on 2020/3/26
 *
 * @author xuetao
 * @version 1.0
 */

public interface AccountService {
    /**
     * 保存账户信息
     *
     * @param account
     * @return
     * @throws ServiceException
     */
    int insert(Account account) throws ServiceException;


    /**
     * 更新账户信息
     *
     * @param account
     * @return
     * @throws ServiceException
     */
    int update(Account account) throws ServiceException;


    /**
     * 删除账户信息
     *
     * @param accountId
     * @return
     * @throws ServiceException
     */
    int delete(String accountId) throws ServiceException;

    /**
     * 查找账户信息
     *
     * @param accountId
     * @return
     * @throws ServiceException
     */
    Account findById(String accountId) throws ServiceException;

    /**
     * 转账
     *
     * @param fromAccount 处理者
     * @param toAccount   接收者
     * @param amount      金额
     * @return
     * @throws ServiceException
     */
    int transfer(String fromAccount, String toAccount, BigDecimal amount) throws ServiceException;

}
