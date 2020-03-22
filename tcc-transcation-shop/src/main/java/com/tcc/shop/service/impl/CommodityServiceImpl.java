package com.tcc.shop.service.impl;

import com.tcc.api.entity.CommodityDetail;
import com.tcc.api.exception.ServiceException;
import com.tcc.shop.mapper.CommodityMapper;
import com.tcc.shop.service.CommodityService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Program Name: CommodityServiceImpl
 * Description:
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

@Service("commodityService2")
public class CommodityServiceImpl implements CommodityService {

    @Resource
    private CommodityMapper commodityMapper;

    @Override
    public int insert(CommodityDetail commodityDetail) throws ServiceException {
        return commodityMapper.insert(commodityDetail);
    }

    @Override
    public int update(CommodityDetail commodityDetail) throws ServiceException {
        return commodityMapper.update(commodityDetail);
    }

    @Override
    public int delete(String commodityId) throws ServiceException {
        return commodityMapper.delete(commodityId);
    }

    @Override
    public CommodityDetail findById(String commodityId) throws ServiceException {
        return commodityMapper.findById(commodityId);
    }

    @Override
    public List<CommodityDetail> findList(Integer type) throws ServiceException {
        return commodityMapper.findList(type);
    }
}
