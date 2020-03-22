/**
 商品详情
 */
CREATE TABLE `commoditydetail` (
  `commodityid` varchar(52) NOT NULL,
  `title` varchar(100) NOT NULL,
  `subtitle` varchar(255) NOT NULL,
  `picture` varchar(255) NOT NULL,
  `type` TINYINT(2) NOT NULL,
  `deleted` TINYINT(2) NOT NULL DEFAULT 0,
  `price` DECIMAL(7,0) DEFAULT NULL,
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`commodityid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;