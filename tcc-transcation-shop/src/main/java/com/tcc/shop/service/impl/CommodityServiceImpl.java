package com.tcc.shop.service.impl;

import com.tcc.api.entity.CommodityDetail;
import com.tcc.shop.mapper.CommodityMapper;
import com.tcc.shop.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Program Name: CommodityServiceImpl
 * Description:
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public int insert(CommodityDetail commodityDetail) throws Exception {
        return commodityMapper.insert(commodityDetail);
    }

    @Override
    public int update(CommodityDetail commodityDetail) throws Exception {
        return commodityMapper.update(commodityDetail);
    }

    @Override
    public int delete(String commodityId) throws Exception {
        return commodityMapper.delete(commodityId);
    }

    @Override
    public CommodityDetail findById(String commodityId) throws Exception {
        return commodityMapper.findById(commodityId);
    }

    @Override
    public List<CommodityDetail> findList(Integer type) throws Exception {
        return commodityMapper.findList(type);
    }
}
