/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50644
Source Host           : localhost:3306
Source Database       : spring

Target Server Type    : MYSQL
Target Server Version : 50644
File Encoding         : 65001

Date: 2019-10-31 20:35:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `book_id` int(6) NOT NULL COMMENT '书标识',
  `book_name` varchar(64) DEFAULT NULL COMMENT '书名',
  `book_price` decimal(10,2) DEFAULT NULL COMMENT '书价格',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'java', '70.00');
INSERT INTO `book` VALUES ('2', 'c++', '50.00');

-- ----------------------------
-- Table structure for count
-- ----------------------------
DROP TABLE IF EXISTS `count`;
CREATE TABLE `count` (
  `book_id` int(6) NOT NULL,
  `count` int(6) DEFAULT NULL COMMENT '库存',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of count
-- ----------------------------
INSERT INTO `count` VALUES ('1', '10');
INSERT INTO `count` VALUES ('2', '10');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '用户名',
  `balance` decimal(10,2) DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'ld', '200.00');
