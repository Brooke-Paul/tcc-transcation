package com.tcc.api.enumtype;

/**
 * Program Name: StatusCodeEnum
 * Description:
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

public enum StatusCodeEnum {


    /**
     * 返回成功
     */
    STATUS_CODE_200(200),
    /**
     * 返回失败
     */
    STATUS_CODE_500(500);

    private int code;

    StatusCodeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
