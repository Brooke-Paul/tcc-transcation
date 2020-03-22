package com.tcc.api.exception;

/**
 * Program Name: ServiceException
 * Description: 服务异常
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

public class ServiceException extends Exception {

    private static final long serialVersionUID = -3328734230765759080L;

    public ServiceException(String message) {
        super(message);
    }

}
