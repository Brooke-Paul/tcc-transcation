package com.tcc.order.mapper;

import com.tcc.api.entity.OrderDetail;
import com.tcc.api.exception.ServiceException;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Program Name: OrderMapper
 * Description:
 * Created by xuetao on 2020/3/26
 *
 * @author xuetao
 * @version 1.0
 */

@Mapper
public interface OrderMapper {

    /**
     * 保存支付详情
     *
     * @param orderDetail
     * @return
     * @throws ServiceException
     */
    @InsertProvider(type = OrderProvider.class, method = "insert")
    int insert(OrderDetail orderDetail) throws ServiceException;


    /**
     * 更新支付详情
     *
     * @param orderDetail
     * @return
     * @throws ServiceException
     */
    @UpdateProvider(type = OrderProvider.class, method = "update")
    int update(OrderDetail orderDetail) throws ServiceException;


    /**
     * 删除支付信息
     *
     * @param orderId
     * @return
     * @throws ServiceException
     */
    @DeleteProvider(type = OrderProvider.class, method = "delete")
    int delete(String orderId) throws ServiceException;

    /**
     * 查找支付详情
     *
     * @param orderId
     * @return
     * @throws ServiceException
     */
    @SelectProvider(type = OrderProvider.class, method = "findById")
    OrderDetail findById(String orderId) throws ServiceException;


    /**
     * 查找我的支付记录
     *
     * @param accountId
     * @return
     * @throws ServiceException
     */
    @SelectProvider(type = OrderProvider.class, method = "findList")
    List<OrderDetail> findList(String accountId) throws ServiceException;

}
