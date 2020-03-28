package com.tcc.order.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tcc.api.entity.OrderDetail;
import com.tcc.api.exception.ServiceException;
import com.tcc.order.mapper.OrderMapper;
import com.tcc.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Program Name: PayServiceImpl
 * Description:
 * Created by xuetao on 2020/3/25
 *
 * @author xuetao
 * @version 1.0
 */

@Service(group = "tcc")
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public int insert(OrderDetail orderDetail) throws ServiceException {
        return orderMapper.insert(orderDetail);
    }

    @Override
    public int update(OrderDetail orderDetail) throws ServiceException {
        return orderMapper.update(orderDetail);
    }

    @Override
    public int delete(String orderId) throws ServiceException {
        return orderMapper.delete(orderId);
    }

    @Override
    public OrderDetail findById(String orderId) throws ServiceException {
        return orderMapper.findById(orderId);
    }

    @Override
    public List<OrderDetail> findList(String accountId) throws ServiceException {
        return orderMapper.findList(accountId);
    }
}
