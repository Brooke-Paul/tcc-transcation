package com.tcc.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Program Name: OrderDetail
 * Description: order detail
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

@Data
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = -2267569952769463261L;
    /**
     * 订单Id
     */
    private String orderId;
    /**
     * 订单价格
     */
    private BigDecimal price;
    /**
     * 付款账户
     */
    private String accountId;
    /**
     * 付款状态
     */
    private Integer state;
    /**
     * 是否删除
     */
    private Integer deleted = 0;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 更新时间
     */
    private Date modified;

}
