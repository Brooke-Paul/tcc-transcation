/**
 商品详情
 */
CREATE TABLE `orderdetail` (
  `orderId` varchar(52) NOT NULL,
  `price`  DECIMAL(7,0) NOT NULL,
  `accountId` varchar(255) NOT NULL,
  `state` TINYINT(2) NOT NULL,
  `deleted` TINYINT(2) NOT NULL DEFAULT 0,
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;