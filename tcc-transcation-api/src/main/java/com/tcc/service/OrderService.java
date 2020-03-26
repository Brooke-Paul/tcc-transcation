package com.tcc.service;

import com.tcc.api.entity.OrderDetail;
import com.tcc.api.exception.ServiceException;

import java.util.List;

/**
 * Program Name: OrderService
 * Description:
 * Created by xuetao on 2020/3/26
 *
 * @author xuetao
 * @version 1.0
 */

public interface OrderService {

    /**
     * 保存支付详情
     *
     * @param orderDetail
     * @return
     * @throws ServiceException
     */
    int insert(OrderDetail orderDetail) throws ServiceException;


    /**
     * 更新支付详情
     *
     * @param orderDetail
     * @return
     * @throws ServiceException
     */
    int update(OrderDetail orderDetail) throws ServiceException;


    /**
     * 删除支付信息
     *
     * @param orderId
     * @return
     * @throws ServiceException
     */
    int delete(String orderId) throws ServiceException;

    /**
     * 查找支付详情
     *
     * @param orderId
     * @return
     * @throws ServiceException
     */
    OrderDetail findById(String orderId) throws ServiceException;


    /**
     * 查找我的支付记录
     *
     * @param accountId
     * @return
     * @throws ServiceException
     */
    List<OrderDetail> findList(String accountId) throws ServiceException;
}
