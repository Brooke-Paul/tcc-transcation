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

    private String commodityId;
    private String title;
    private String subtitle;
    private String picture;
    private Integer type;
    private Integer deleted;
    private BigDecimal price;
    private Date created;
    private Date modified;
}
