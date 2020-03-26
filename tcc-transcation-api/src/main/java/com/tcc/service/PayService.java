package com.tcc.service;

import com.tcc.api.entity.PayDetail;
import com.tcc.api.exception.ServiceException;

import java.util.List;

/**
 * Program Name: PayService
 * Description:
 * Created by xuetao on 2020/3/25
 *
 * @author xuetao
 * @version 1.0
 */

public interface PayService {
    /**
     * 保存支付详情
     *
     * @param payDetail
     * @return
     * @throws ServiceException
     */
    int insert(PayDetail payDetail) throws ServiceException;


    /**
     * 更新支付详情
     *
     * @param payDetail
     * @return
     * @throws ServiceException
     */
    int update(PayDetail payDetail) throws ServiceException;


    /**
     * 删除支付信息
     *
     * @param payId
     * @return
     * @throws ServiceException
     */
    int delete(String payId) throws ServiceException;

    /**
     * 查找支付详情
     *
     * @param payId
     * @return
     * @throws ServiceException
     */
    PayDetail findById(String payId) throws ServiceException;


    /**
     * 查找支付记录
     *
     * @param userId
     * @return
     * @throws ServiceException
     */
    List<PayDetail> findList(String userId) throws ServiceException;
}
