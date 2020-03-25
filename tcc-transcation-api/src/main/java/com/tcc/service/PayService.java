package com.tcc.service;

import com.tcc.api.exception.ServiceException;

/**
 * Program Name: PayService
 * Description:
 * Created by xuetao on 2020/3/25
 *
 * @author xuetao
 * @version 1.0
 */

public interface PayService {
//    /**
//     * 保存商品详情
//     *
//     * @param commodityDetail
//     * @return
//     * @throws ServiceException
//     */
//    int insert(CommodityDetail commodityDetail) throws ServiceException;
//
//
//    /**
//     * 更新商品详情
//     *
//     * @param commodityDetail
//     * @return
//     * @throws ServiceException
//     */
//    int update(CommodityDetail commodityDetail) throws ServiceException;


    /**
     * 删除商品详情
     *
     * @param commodityId
     * @return
     * @throws ServiceException
     */
    int delete(String commodityId) throws ServiceException;
//
//    /**
//     * 查找商品详情
//     *
//     * @param commodityId
//     * @return
//     * @throws ServiceException
//     */
//    CommodityDetail findById(String commodityId) throws ServiceException;
//
//
//    /**
//     * 按类型查找所有商品（未删除）
//     *
//     * @param type
//     * @return
//     * @throws ServiceException
//     */
//    List<CommodityDetail> findList(Integer type) throws ServiceException;
//}
}
