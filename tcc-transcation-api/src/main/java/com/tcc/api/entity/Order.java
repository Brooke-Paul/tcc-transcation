package com.tcc.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Program Name: com.tcc.api.entity
 * Description: order detail
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

@Data
public class Order implements Serializable {

    private static final long serialVersionUID = -2267569952769463261L;
    private String orderId;
    private String price;
    private String accountId;
    private Integer status;
    private Date created;
    private Date modified;

}
