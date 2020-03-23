package com.tcc.shop.controller;

import com.tcc.api.entity.CommodityDetail;
import com.tcc.api.entity.ResultObject;
import com.tcc.api.enumtype.StatusCodeEnum;
import com.tcc.shop.service.CommodityService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.tcc.api.exception.ServiceException;
import javax.annotation.Resource;

/**
 * Program Name: CommodityController
 * Description: 商品控制层
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

@RestController
public class CommodityController {

    @Resource
    private CommodityService commodityService;

    /**
     * 商品列表
     *
     * @param type
     * @return
     * @throws ServiceException
     */
    @ResponseBody
    @GetMapping(value = "/commodities/{type}")
    public ResultObject<List<CommodityDetail>> findCommodityList(@PathVariable("type") Integer type) throws ServiceException {
        try {
            List<CommodityDetail> commodityDetails = commodityService.findList(type);
            return new ResultObject<>(commodityDetails, StatusCodeEnum.STATUS_CODE_200.getCode());
        } catch (ServiceException e) {
            return new ResultObject<>("find findCommodityList error", StatusCodeEnum.STATUS_CODE_500.getCode());
        }
    }


}
