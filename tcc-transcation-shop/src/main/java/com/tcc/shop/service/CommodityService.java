package com.tcc.shop.service;

import com.tcc.api.entity.CommodityDetail;

import java.util.List;

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
     * @throws Exception
     */
    int insert(CommodityDetail commodityDetail) throws Exception;


    /**
     * 更新商品详情
     *
     * @param commodityDetail
     * @return
     * @throws Exception
     */
    int update(CommodityDetail commodityDetail) throws Exception;


    /**
     * 删除商品详情
     *
     * @param commodityId
     * @return
     * @throws Exception
     */
    int delete(String commodityId) throws Exception;

    /**
     * 查找商品详情
     *
     * @param commodityId
     * @return
     * @throws Exception
     */
    CommodityDetail findById(String commodityId) throws Exception;


    /**
     * 按类型查找所有商品（未删除）
     *
     * @param type
     * @return
     * @throws Exception
     */
    List<CommodityDetail> findList(Integer type) throws Exception;
}
