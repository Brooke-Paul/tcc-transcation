package com.tcc.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Program Name: com.tcc.api.entity
 * Description: user amount
 * Created by xuetao on 2020/3/21
 *
 * @author xuetao
 * @version 1.0
 */

@Data
public class Account implements Serializable {

    private String accountId;
    private String userId;
    private BigDecimal amount;
    private Integer version;
    private Date created;
    private Date modified;
}
