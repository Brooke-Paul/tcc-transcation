package com.tcc.pay.mapper;

import com.tcc.api.entity.Account;
import com.tcc.api.exception.ServiceException;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;

/**
 * Program Name: OrderProvider
 * Description:
 * Created by xuetao on 2020/3/26
 *
 * @author xuetao
 * @version 1.0
 */

public class AccountProvider {
    private static final String TABLE_FIELD = "accountId,accountName,amount,version,created,modified,state";

    /**
     * 保存账户详情
     *
     * @param account 订单详情
     * @return sql
     * @throws ServiceException 异常
     */

    public String insert(Account account) throws ServiceException {
        return new SQL() {{
            INSERT_INTO("account");
            VALUES(TABLE_FIELD, "#{accountId},#{accountName},#{amount},#{version},#{created},#{modified},#{state}");
        }}.toString();
    }


    /**
     * 更新账户详情
     *
     * @param account 账户详情
     * @return sql
     * @throws ServiceException 异常
     */
    public String update(Account account) throws ServiceException {
        return new SQL() {{
            UPDATE("account");
            SET("state = #{state}");
            if (!StringUtils.isEmpty(account.getAccountName())) {
                SET("accountname = #{accountName}");
            }
            WHERE("accountId = #{accountId}");
        }}.toString();
    }


    /**
     * 删除账户详情
     *
     * @param accountId 账户id
     * @return sql
     * @throws ServiceException 异常
     */
    public String delete(String accountId) throws ServiceException {
        return new SQL() {{
            UPDATE("account");
            SET("deleted = 1");
            WHERE("accountId = #{accountId}");
        }}.toString();
    }

    /**
     * 查找账户详情
     *
     * @param accountId 账户id
     * @return sql
     * @throws ServiceException 异常
     */
    public String findById(String accountId) throws ServiceException {
        return new SQL() {{
            SELECT(TABLE_FIELD);
            FROM("account");
            WHERE("accountId = #{accountId}");
        }}.toString();
    }

    /**
     * 转账
     *
     * @param accountId 账户id
     * @return sql
     * @throws ServiceException 异常
     */

    public String transfer(String accountId, BigDecimal amount) throws ServiceException {
        return new SQL() {{
            UPDATE("account");
            SET("amount = amount + #{amount}");
            SET("version = version + 1");
            WHERE("accountId = #{accountId} and version = #{version}");
        }}.toString();
    }
}
