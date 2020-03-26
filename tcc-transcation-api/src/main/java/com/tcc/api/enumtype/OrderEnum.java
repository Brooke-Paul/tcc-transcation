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
     * 未支付
     */
    UN_PAID(0),

    /**
     * 已支付
     */
    PAID(1),
    /**
     * 已退款
     */
    REFUND(2),
    /**
     * 已取消
     */
    CANCELLED(3);

    private Integer state;

    OrderEnum(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }
}
