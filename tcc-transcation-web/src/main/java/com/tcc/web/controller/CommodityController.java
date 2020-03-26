package com.tcc.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tcc.api.entity.CommodityDetail;
import com.tcc.api.entity.ResultObject;
import com.tcc.api.enumtype.StatusCodeEnum;
import com.tcc.api.exception.ServiceException;
import com.tcc.service.AccountService;
import com.tcc.service.CommodityService;
import com.tcc.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Program Name: CommodityController
 * Description:
 * Created by xuetao on 2020/3/23
 *
 * @author xuetao
 * @version 1.0
 */

@Controller
public class CommodityController {


    @Reference(group = "tcc")
    private CommodityService commodityService;

    @Reference(group = "tcc")
    private OrderService orderService;

    @Reference(group = "tcc")
    private AccountService accountService;

    /**
     * 商品界面
     *
     * @return
     * @throws ServiceException
     */
    @RequestMapping(value = "/commodity")
    public String commodity() throws ServiceException {
        return "index";
    }

    /**
     * 商品列表
     *
     * @param type
     * @return
     * @throws ServiceException
     */
    @GetMapping(value = "/commodities/{type}")
    @ResponseBody
    public ResultObject<List<CommodityDetail>> findCommodityList(@PathVariable("type") Integer type) throws ServiceException {
        try {
            List<CommodityDetail> commodityDetails = commodityService.findList(type);
            return new ResultObject<>(commodityDetails, StatusCodeEnum.STATUS_CODE_200.getCode());
        } catch (ServiceException e) {
            return new ResultObject<>("find findCommodityList error", StatusCodeEnum.STATUS_CODE_500.getCode());
        }
    }


}
