package com.tcc.api.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Program Name: ResultObject
 * Description:
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

@Data
public class ResultObject<T> implements Serializable {
    private static final long serialVersionUID = 2941845267815455393L;

    private T data;
    private String message;
    private Integer errCode;

    public ResultObject(T data, Integer errCode) {
        this.data = data;
        this.errCode = errCode;
    }

    public ResultObject(String message, Integer errCode) {
        this.message = message;
        this.errCode = errCode;
    }

}
