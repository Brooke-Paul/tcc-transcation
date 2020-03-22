package com.tcc.api.enumtype;


/**
 * Program Name: OrderEnum
 * Description: user order
 * Created by xuetao on 2020/3/21
 *
 * @author xuetao
 * @version 1.0
 */
public enum OrderEnum {

    /**
     * 未付款
     */
    UNPAID(1),
    /**
     * 已付款
     */
    PAID(2);


    private Integer status;

    OrderEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }
}
