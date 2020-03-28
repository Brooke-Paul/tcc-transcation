package com.tcc.order.mapper;

import com.tcc.api.entity.OrderDetail;
import com.tcc.api.exception.ServiceException;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

/**
 * Program Name: OrderProvider
 * Description:
 * Created by xuetao on 2020/3/26
 *
 * @author xuetao
 * @version 1.0
 */

public class OrderProvider {
    private static final String ORDERMYSQL = "orderId,price,accountId,state,created,modified";

    /**
     * 保存订单详情
     *
     * @param orderDetail 订单详情
     * @return sql
     * @throws ServiceException 异常
     */

    public String insert(OrderDetail orderDetail) throws ServiceException {
        return new SQL() {{
            INSERT_INTO("orderdetail");
            VALUES(ORDERMYSQL, "#{orderId},#{price},#{accountId},#{state},#{created},#{modified}");
        }}.toString();
    }


    /**
     * 更新订单详情
     *
     * @param orderDetail 订单详情
     * @return sql
     * @throws ServiceException 异常
     */
    public String update(OrderDetail orderDetail) throws ServiceException {
        return new SQL() {{
            UPDATE("orderdetail");
            if (!StringUtils.isEmpty(orderDetail.getState())) {
                SET("state = #{state}");
            }

            WHERE("orderId = #{orderId}");
        }}.toString();
    }


    /**
     * 删除订单详情
     *
     * @param orderId 订单id
     * @return sql
     * @throws ServiceException 异常
     */
    public String delete(String orderId) throws ServiceException {
        return new SQL() {{
            UPDATE("orderdetail");
            SET("deleted = 1");
            WHERE("orderId = #{orderId}");
        }}.toString();
    }

    /**
     * 查找订单详情
     *
     * @param orderId 订单id
     * @return sql
     * @throws ServiceException 异常
     */
    public String findById(String orderId) throws ServiceException {
        return new SQL() {{
            SELECT(ORDERMYSQL);
            FROM("orderdetail");
            WHERE("orderId = #{orderId}");
        }}.toString();
    }

    /**
     * 查找所有订单详情
     *
     * @param accountId 账户id
     * @return sql
     * @throws ServiceException 异常
     */

    public String findList(String accountId) throws ServiceException {
        return new SQL() {{
            SELECT(ORDERMYSQL);
            FROM("orderdetail");
            WHERE("accountId = #{accountId}");
        }}.toString();
    }
}
