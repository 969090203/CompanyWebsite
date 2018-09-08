CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(255) NOT NULL COMMENT '姓名',
  `card_id` varchar(255) NOT NULL COMMENT '身份证号码',
  `phone` varchar(255) COMMENT '电话号码',
  `brithday` varchar(255) NOT NULL COMMENT '出生日期',
  `entry_data` varchar(255) NOT NULL COMMENT '入职时间',
  `status` int(1) NOT NULL COMMENT '是否在职',
  `job_number`VARCHAR(20) NOT NULL COMMENT '工号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
INSERT INTO `user` VALUES (1, '张芮源', '612723199012205636', '15291278581', '1990-12-20', '2018-04-04', '0', 'B0000001');
SET FOREIGN_KEY_CHECKS=1;

DELETE from user where id="1";

SELECT * FROM user WHERE id ="1";

DROP TABLE user;