package com.tcc.api.enumtype;


/**
 * Program Name: AccountEnum
 * Description: user amount
 * Created by xuetao on 2020/3/21
 *
 * @author xuetao
 * @version 1.0
 */
public enum AccountEnum {

    /**
     * 余额正常
     */
    NORMAL(1),

    /**
     * 余额操作中
     */
    TRANSFERING(2);


    private Integer type;

    AccountEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
