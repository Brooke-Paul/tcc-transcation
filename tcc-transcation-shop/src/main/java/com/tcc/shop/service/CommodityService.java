package com.tcc.shop.service;

import com.tcc.api.entity.CommodityDetail;

import java.util.List;

import com.tcc.api.exception.ServiceException;

/**
 * Program Name: CommodityService
 * Description: 商品服务接口
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

public interface CommodityService {

    /**
     * 保存商品详情
     *
     * @param commodityDetail
     * @return
     * @throws ServiceException
     */
    int insert(CommodityDetail commodityDetail) throws ServiceException;


    /**
     * 更新商品详情
     *
     * @param commodityDetail
     * @return
     * @throws ServiceException
     */
    int update(CommodityDetail commodityDetail) throws ServiceException;


    /**
     * 删除商品详情
     *
     * @param commodityId
     * @return
     * @throws ServiceException
     */
    int delete(String commodityId) throws ServiceException;

    /**
     * 查找商品详情
     *
     * @param commodityId
     * @return
     * @throws ServiceException
     */
    CommodityDetail findById(String commodityId) throws ServiceException;


    /**
     * 按类型查找所有商品（未删除）
     *
     * @param type
     * @return
     * @throws ServiceException
     */
    List<CommodityDetail> findList(Integer type) throws ServiceException;
}
