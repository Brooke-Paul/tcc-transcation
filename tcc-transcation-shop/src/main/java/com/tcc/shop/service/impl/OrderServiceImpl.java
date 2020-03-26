package com.tcc.shop.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tcc.api.entity.OrderDetail;
import com.tcc.api.exception.ServiceException;
import com.tcc.service.OrderService;

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


    @Override
    public int insert(OrderDetail orderDetail) throws ServiceException {
        return 0;
    }

    @Override
    public int update(OrderDetail orderDetail) throws ServiceException {
        return 0;
    }

    @Override
    public int delete(String orderId) throws ServiceException {
        return 0;
    }

    @Override
    public OrderDetail findById(String orderId) throws ServiceException {
        return null;
    }

    @Override
    public List<OrderDetail> findList(String accountId) throws ServiceException {
        return null;
    }
}
