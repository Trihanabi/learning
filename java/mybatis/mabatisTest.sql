CREATE DATABASE IF NOT EXISTS `mybatis_test`;
USE `mybatis_test`;
Create table `t_article` (
	`id` int(20) NOT NULL AUTO_INCREMENT COMMENT '文章id',
    `title` varchar(200) DEFAULT NULL COMMENT '文章标题',
    `content` longtext COMMENT '文章内容',
    primary key(`id`)
) engine=innoDB Auto_increment=2 Default charset=utf8;