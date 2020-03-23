package com.tcc.web.controller;

import com.tcc.api.exception.ServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    /**
     * @return
     * @throws ServiceException
     */
    @RequestMapping(value = "/commodity")
    public String commodity() throws ServiceException {
        return "index";
    }

}
