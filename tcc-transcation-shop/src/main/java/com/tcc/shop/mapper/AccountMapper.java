package com.tcc.shop.mapper;

import com.tcc.api.entity.Account;
import com.tcc.api.exception.ServiceException;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;

/**
 * Program Name: OrderMapper
 * Description:
 * Created by xuetao on 2020/3/26
 *
 * @author xuetao
 * @version 1.0
 */

@Mapper
public interface AccountMapper {


    /**
     * 保存账户信息
     *
     * @param account
     * @return
     * @throws ServiceException
     */
    @InsertProvider(type = AccountProvider.class, method = "insert")
    int insert(Account account) throws ServiceException;


    /**
     * 更新账户信息
     *
     * @param account
     * @return
     * @throws ServiceException
     */
    @UpdateProvider(type = AccountProvider.class, method = "update")
    int update(Account account) throws ServiceException;


    /**
     * 删除账户信息
     *
     * @param accountId
     * @return
     * @throws ServiceException
     */
    @DeleteProvider(type = AccountProvider.class, method = "delete")
    int delete(String accountId) throws ServiceException;

    /**
     * 查找账户信息
     *
     * @param accountId
     * @return
     * @throws ServiceException
     */
    @SelectProvider(type = AccountProvider.class, method = "findById")
    Account findById(String accountId) throws ServiceException;

    /**
     * 转账
     *
     * @param accountId 处理者
     * @param amount    金额
     * @return
     * @throws ServiceException
     */
    @UpdateProvider(type = AccountProvider.class, method = "transfer")
    int transfer(String accountId, BigDecimal amount) throws ServiceException;

}
