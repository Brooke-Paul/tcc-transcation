package com.tcc.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Program Name: Account
 * Description: user amount
 * Created by xuetao on 2020/3/21
 *
 * @author xuetao
 * @version 1.0
 */

@Data
public class Account implements Serializable {

    private static final long serialVersionUID = -157479313895500686L;
    /**
     * 账户Id
     */
    private String accountId;
    /**
     * 账户名称
     */
    private String accountName;
    /**
     * 账户余额
     */
    private BigDecimal amount;
    /**
     * 账户版本号
     */
    private Integer version;
    /**
     * 常见时间
     */
    private Date created;
    /**
     * 更新时间
     */
    private Date modified;
    /**
     * 余额状态
     */
    private Integer state;
}
