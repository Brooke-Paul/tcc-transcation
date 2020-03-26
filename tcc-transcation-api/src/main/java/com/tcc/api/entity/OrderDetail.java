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
    private String orderId;
    private BigDecimal price;
    private String accountId;
    private Integer state;
    private Date created;
    private Date modified;

}
