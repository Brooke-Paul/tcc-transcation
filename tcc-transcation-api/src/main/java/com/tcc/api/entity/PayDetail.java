package com.tcc.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Program Name: PayDetail
 * Description:
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

@Data
public class PayDetail implements Serializable {
    private static final long serialVersionUID = -8536594296959564522L;

    private String payId;
    private BigDecimal amount;
    private String commodityId;
    private Date created;
    private Date modified;
}
