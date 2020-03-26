package com.tcc.api.enumtype;


/**
 * Program Name: PayEnum
 * Description:
 * Created by xuetao on 2020/3/26
 *
 * @author xuetao
 * @version 1.0
 */
public enum PayEnum {

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
    CANCELLED(3);;

    private Integer type;

    PayEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
