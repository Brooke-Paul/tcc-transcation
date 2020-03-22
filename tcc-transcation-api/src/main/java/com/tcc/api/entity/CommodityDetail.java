package com.tcc.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Program Name: CommodityDetail
 * Description: commodity detail
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */
@Data
public class CommodityDetail implements Serializable {
    private static final long serialVersionUID = 6846781296812419385L;
    /**
     * 商品id
     */
    private String commodityId;
    /**
     * 商品名称
     */
    private String title;
    /**
     * 商品二级标题
     */
    private String subtitle;
    /**
     * 商品配图
     */
    private String picture;
    /**
     * 商品类型
     */
    private Integer type;
    /**
     * 是否删除
     */
    private Integer deleted = 0;
    /**
     * 商品价格
     */
    private BigDecimal price;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 更改时间
     */
    private Date modified;
}
