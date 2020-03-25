package com.tcc.shop.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tcc.api.exception.ServiceException;
import com.tcc.service.PayService;
import org.springframework.beans.factory.annotation.Value;

/**
 * Program Name: PayServiceImpl
 * Description:
 * Created by xuetao on 2020/3/25
 *
 * @author xuetao
 * @version 1.0
 */

@Service(group = "tcc")
public class PayServiceImpl implements PayService {
    @Override
    public int delete(String commodityId) throws ServiceException {
        return 0;
    }
}
