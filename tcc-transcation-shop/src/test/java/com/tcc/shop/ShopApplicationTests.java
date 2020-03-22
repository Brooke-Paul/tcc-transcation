package com.tcc.shop;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tcc.api.entity.CommodityDetail;
import com.tcc.shop.service.CommodityService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@SpringBootTest
@MapperScan(basePackages = "com.tcc.shop.mapper")
class ShopApplicationTests {

    @Autowired
    CommodityService commodityService;

    @Test
    void contextLoads() {
    }

    @Test
    void insert() throws Exception {
        for (int i = 0; i < 10; i++) {
            CommodityDetail commodityDetail = new CommodityDetail();
            commodityDetail.setCommodityId(UUID.randomUUID().toString());
            commodityDetail.setPicture("");
            commodityDetail.setPrice(BigDecimal.valueOf((i + 1) * 200 + 99));
            commodityDetail.setTitle("Iphone" + (i + 1));
            commodityDetail.setSubtitle("火爆抢购中...");
            commodityDetail.setType(1);
            commodityService.insert(commodityDetail);
        }
    }

    @Test
    void update() throws Exception {
        CommodityDetail commodityDetail = commodityService.findById("3f507161-2300-42aa-af60-678d53067ac2");
        if (null != commodityDetail) {
            commodityDetail.setPrice(BigDecimal.valueOf(99));
            commodityDetail.setDeleted(0);
            System.out.println(commodityService.update(commodityDetail));
        }
    }

    @Test
    void delete() throws Exception {
        CommodityDetail commodityDetail = commodityService.findById("3f507161-2300-42aa-af60-678d53067ac2");
        if (null != commodityDetail) {
            System.out.println(commodityService.delete(commodityDetail.getCommodityId()));
        }
    }

    @Test
    void findList() throws Exception {
        List<CommodityDetail> list = commodityService.findList(1);
        Gson gson = new Gson();
        System.out.println(gson.toJson(list));
    }

}
