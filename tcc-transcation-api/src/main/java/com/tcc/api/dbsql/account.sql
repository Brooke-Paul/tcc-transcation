/**
 账户详情
 */
CREATE TABLE `account` (
  `accountId` varchar(52) NOT NULL,
  `accountName` varchar(100) NOT NULL,
  `amount` DECIMAL(12,3) NOT NULL,
  `version` int(255) NOT NULL,
  `state` TINYINT(2) NOT NULL DEFAULT 0,
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`accountId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;