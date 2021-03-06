-- auto Generated on 2019-05-23
-- DROP TABLE IF EXISTS dog_entity;
use boot;
CREATE TABLE dog_entity
(
    id       INT(11)     NOT NULL AUTO_INCREMENT COMMENT '功能描述：主键id',
    `name`   VARCHAR(50) NOT NULL DEFAULT '' COMMENT '属性描述：姓名',
    age      INT(11)     NOT NULL DEFAULT -1 COMMENT '功能描述：年龄',
    birthday DATETIME    NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '功能描述：生日',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'dog_entity';
