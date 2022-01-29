/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : second_market

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2022-01-29 16:45:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `market_area`
-- ----------------------------
DROP TABLE IF EXISTS `market_area`;
CREATE TABLE `market_area` (
  `id` varchar(64) NOT NULL,
  `area_name` varchar(64) DEFAULT NULL,
  `area_desc` varchar(64) DEFAULT NULL,
  `del_flag` char(1) DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_area
-- ----------------------------
INSERT INTO `market_area` VALUES ('1', 'yifulou', '逸夫楼', '0', '1', '2022-01-01 17:37:10', '1', '2022-01-01 17:37:10');
INSERT INTO `market_area` VALUES ('2', 'tushuguan', '图书馆', '0', '1', '2022-01-01 17:37:10', '1', '2022-01-01 17:37:10');
INSERT INTO `market_area` VALUES ('3', 'xiaomenkou', '校门口', '0', '1', '2022-01-01 17:37:10', '1', '2022-01-01 17:37:10');
INSERT INTO `market_area` VALUES ('4', 'qinyuan', '沁园餐厅', '0', '1', '2022-01-01 17:37:10', '1', '2022-01-01 17:37:10');
INSERT INTO `market_area` VALUES ('5', 'wenti', '文体馆', '0', '1', '2022-01-01 17:37:10', '1', '2022-01-01 17:37:10');
INSERT INTO `market_area` VALUES ('6', 'other', '其它场所', '0', '1', '2022-01-01 17:37:10', '1', '2022-01-01 17:37:10');

-- ----------------------------
-- Table structure for `market_article`
-- ----------------------------
DROP TABLE IF EXISTS `market_article`;
CREATE TABLE `market_article` (
  `id` varchar(64) NOT NULL,
  `title` varchar(64) DEFAULT NULL,
  `content` varchar(4000) DEFAULT NULL,
  `del_flag` char(1) DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_article
-- ----------------------------
INSERT INTO `market_article` VALUES ('34258499059008', '舒服舒服', '21312312玩儿玩儿我我', '0', '1', '2022-01-23 05:12:45', '1', '2022-01-23 05:21:48');
INSERT INTO `market_article` VALUES ('34258509529408', '232323232323232去二期我去额', '问问去额千万千万而且我 ', '0', '1', '2022-01-23 05:12:56', '1', '2022-01-23 05:12:56');
INSERT INTO `market_article` VALUES ('34259347476800', '蔷薇蔷薇蔷薇 ', '请问弃我而去温泉温泉温泉', '0', '1', '2022-01-23 05:26:34', '1', '2022-01-23 05:26:34');
INSERT INTO `market_article` VALUES ('34259734704448', '2323232', '323232喂喂喂wewewewe我我', '0', '1', '2022-01-23 05:32:52', '1', '2022-01-23 05:32:52');
INSERT INTO `market_article` VALUES ('34554027222336', ' 额外请问清 ', '蔷薇蔷薇蔷薇 请问 清', '0', '1', '2022-01-26 13:22:47', '1', '2022-01-26 13:22:47');

-- ----------------------------
-- Table structure for `market_class`
-- ----------------------------
DROP TABLE IF EXISTS `market_class`;
CREATE TABLE `market_class` (
  `id` varchar(64) NOT NULL,
  `dept_id` varchar(64) DEFAULT NULL,
  `class_name` varchar(64) DEFAULT NULL,
  `class_desc` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_class
-- ----------------------------

-- ----------------------------
-- Table structure for `market_comment`
-- ----------------------------
DROP TABLE IF EXISTS `market_comment`;
CREATE TABLE `market_comment` (
  `id` varchar(64) NOT NULL,
  `content` varchar(8000) DEFAULT NULL,
  `message_id` varchar(64) DEFAULT NULL,
  `user_id` varchar(64) DEFAULT NULL,
  `del_flag` char(1) DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_comment
-- ----------------------------
INSERT INTO `market_comment` VALUES ('3', '额喂喂喂喂喂喂问额喂喂喂喂喂喂问额外我诶我亲亲亲亲亲亲亲亲亲亲亲亲亲QQ群111111去去去22211111212121212', '11', '1', '0', '1', '2022-01-09 12:14:01', '1', '2022-01-11 06:13:34');
INSERT INTO `market_comment` VALUES ('33041201994048', '11111111111111sdsadsads撒大声地阿萨收到撒打算打算啊是啊', '2', '1', '0', '1', '2022-01-09 10:59:59', '1', '2022-01-09 10:59:59');
INSERT INTO `market_comment` VALUES ('33041270564160', '喂喂喂喂喂喂问我', '3', '1', '0', '1', '2022-01-09 11:01:06', '1', '2022-01-09 11:01:06');
INSERT INTO `market_comment` VALUES ('33041292382528', '喂喂喂喂喂喂问我蔷薇蔷薇蔷薇', '3', '1', '0', '1', '2022-01-09 11:01:27', '1', '2022-01-09 11:01:27');
INSERT INTO `market_comment` VALUES ('33041321214272', '蔷薇蔷薇蔷薇', '3', '1', '0', '1', '2022-01-09 11:01:55', '1', '2022-01-09 11:01:55');
INSERT INTO `market_comment` VALUES ('33041328167232', '蔷薇蔷薇蔷薇', '3', '1', '0', '1', '2022-01-09 11:02:02', '1', '2022-01-09 11:02:02');
INSERT INTO `market_comment` VALUES ('33041449529664', 'wewewewewewwewewewew收到韶山滴水洞是是的但是是', '2', '1', '0', '1', '2022-01-09 11:04:01', '1', '2022-01-09 11:04:01');
INSERT INTO `market_comment` VALUES ('33041516079424', '喂喂喂喂喂wewe我', '2', '1', '0', '1', '2022-01-09 11:05:06', '1', '2022-01-09 11:05:06');
INSERT INTO `market_comment` VALUES ('33041535588672', '喂喂喂', '2', '1', '0', '1', '2022-01-09 11:05:25', '1', '2022-01-09 11:05:25');
INSERT INTO `market_comment` VALUES ('33041623509312', '24323232', '2', '1', '0', '1', '2022-01-09 11:06:50', '1', '2022-01-09 11:06:50');
INSERT INTO `market_comment` VALUES ('33041877093696', 'eweweweeww', '32739950356800', '1', '0', '1', '2022-01-09 11:10:58', '1', '2022-01-09 11:10:58');
INSERT INTO `market_comment` VALUES ('33041892232512', '233343', '32739950356800', '1', '0', '1', '2022-01-09 11:11:13', '1', '2022-01-09 11:11:13');
INSERT INTO `market_comment` VALUES ('33041945206080', 'ewewewew', '32739950356800', '1', '0', '1', '2022-01-09 11:12:05', '1', '2022-01-09 11:12:05');
INSERT INTO `market_comment` VALUES ('33047702347072', '121212', '11', '1', '0', '1', '2022-01-09 12:45:47', '1', '2022-01-09 12:45:47');
INSERT INTO `market_comment` VALUES ('33047929544000', '1212121', '32739950356800', '1', '0', '1', '2022-01-09 12:49:29', '1', '2022-01-09 12:49:29');
INSERT INTO `market_comment` VALUES ('33047941450048', '1212121', '32739950356800', '1', '0', '1', '2022-01-09 12:49:40', '1', '2022-01-09 12:49:40');
INSERT INTO `market_comment` VALUES ('33047952953664', '12121212', '32739950356800', '1', '0', '1', '2022-01-09 12:49:52', '1', '2022-01-09 12:49:52');
INSERT INTO `market_comment` VALUES ('33049490484544', '味儿问问', '3', '31976229095744', '0', '31976229095744', '2022-01-09 13:14:53', '31976229095744', '2022-01-09 13:14:53');
INSERT INTO `market_comment` VALUES ('33049503148352', '喂喂喂', '32739950356800', '31976229095744', '0', '31976229095744', '2022-01-09 13:15:05', '31976229095744', '2022-01-09 13:15:05');
INSERT INTO `market_comment` VALUES ('33049741979968', '撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as撒大声地as', '32739950356800', '31976229095744', '0', '31976229095744', '2022-01-09 13:18:59', '31976229095744', '2022-01-09 13:18:59');
INSERT INTO `market_comment` VALUES ('33049879072064', 'q权威qq111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111', '32739950356800', '31976229095744', '0', '31976229095744', '2022-01-09 13:21:13', '31976229095744', '2022-01-09 13:21:13');
INSERT INTO `market_comment` VALUES ('33540178379072', '让我热舞', '32739950356800', '1', '0', '1', '2022-01-15 02:21:20', '1', '2022-01-15 02:21:20');
INSERT INTO `market_comment` VALUES ('33540222976320', '23223432', '32739950356800', '1', '0', '1', '2022-01-15 02:22:04', '1', '2022-01-15 02:22:04');
INSERT INTO `market_comment` VALUES ('33540253058368', '12312123', '32739950356800', '1', '0', '1', '2022-01-15 02:22:33', '1', '2022-01-15 02:22:33');
INSERT INTO `market_comment` VALUES ('33565645215040', '23232', '32739950356800', '1', '0', '1', '2022-01-15 09:15:50', '1', '2022-01-15 09:15:50');
INSERT INTO `market_comment` VALUES ('33565660805440', '呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜', '32739950356800', '1', '0', '1', '2022-01-15 09:16:06', '1', '2022-01-15 09:16:06');
INSERT INTO `market_comment` VALUES ('34556181824832', 'WWE我是福山', '34555426403648', '1', '0', '1', '2022-01-26 13:57:51', '1', '2022-01-26 13:57:51');
INSERT INTO `market_comment` VALUES ('34715616302400', 'DDD', '32872795966784', '1', '0', '1', '2022-01-28 09:12:49', '1', '2022-01-28 09:12:49');
INSERT INTO `market_comment` VALUES ('34728741934400', '玩儿玩儿我 ', '32872768467264', '1', '0', '1', '2022-01-28 12:46:27', '1', '2022-01-28 12:46:27');
INSERT INTO `market_comment` VALUES ('34796820491584', '11 额', '34555426403648', '1', '0', '1', '2022-01-29 07:14:30', '1', '2022-01-29 07:14:30');
INSERT INTO `market_comment` VALUES ('4', '随声附和风格化发个堆放高度法国的个', '11', '1', '0', '1', '2022-01-09 12:14:01', '1', '2022-01-09 12:14:01');
INSERT INTO `market_comment` VALUES ('5', '喂喂喂清楚 玩儿玩儿额玩儿we我额we我我我', '11', '1', '0', '1', '2022-01-09 12:14:01', '1', '2022-01-09 12:14:01');

-- ----------------------------
-- Table structure for `market_dept`
-- ----------------------------
DROP TABLE IF EXISTS `market_dept`;
CREATE TABLE `market_dept` (
  `id` varchar(64) NOT NULL DEFAULT '',
  `dept_name` varchar(64) DEFAULT NULL,
  `dept_desc` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_dept
-- ----------------------------

-- ----------------------------
-- Table structure for `market_message`
-- ----------------------------
DROP TABLE IF EXISTS `market_message`;
CREATE TABLE `market_message` (
  `id` varchar(64) NOT NULL,
  `message_title` varchar(64) DEFAULT NULL,
  `type_id` varchar(64) DEFAULT NULL,
  `area_id` varchar(64) DEFAULT NULL,
  `price` varchar(64) DEFAULT NULL,
  `message_desc` varchar(4000) DEFAULT NULL,
  `user_id` varchar(64) DEFAULT NULL,
  `message_photo` varchar(64) DEFAULT NULL,
  `old_value` varchar(64) DEFAULT NULL,
  `top_value` varchar(64) DEFAULT NULL,
  `user_name` varchar(64) DEFAULT NULL,
  `user_phone` varchar(64) DEFAULT NULL,
  `user_email` varchar(64) DEFAULT NULL,
  `flag` char(1) DEFAULT NULL,
  `del_flag` char(1) DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_message
-- ----------------------------
INSERT INTO `market_message` VALUES ('11', '小猪电脑ert维修', '1', '2', '111111', '小猪电脑维修小猪电脑维修小猪电脑维修小猪电脑维修小猪电脑维修小猪电脑维修小猪电脑维修小猪电脑维修小猪电脑维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修维修小电脑维修维修小电脑维修维修小电脑维修维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维维修小电脑维修维修小猪电脑维修小猪电脑维修小猪电脑维修', '1', null, '6', '1', '方剑', '13265656565', '1@qq.com', '0', '0', '1', '1995-06-22 16:58:31', '1', '2022-01-11 06:07:54');
INSERT INTO `market_message` VALUES ('2', '小猪电脑维修1', '1', '2', '11', '小猪电脑维修', '1', null, '6', '2', '周杰伦', '13265656565', '1@qq.com', '0', '0', '1', '2022-01-01 16:58:31', '1', '2022-01-11 06:07:43');
INSERT INTO `market_message` VALUES ('3', '小猪电脑维修2', '1', '2', '111', '小猪电脑维修', '1', null, '6', '0', '方2剑', '13265656565', '1@qq.com', '1', '0', '1', '2022-01-01 16:58:31', '1', '2022-01-01 16:58:31');
INSERT INTO `market_message` VALUES ('32739950356800', '4545454454', '1', '1', '454545', '2121222222', '1', null, '1', '5', 'admin', '18765068623', '1@qq.com', '1', '0', '1', '2022-01-01 16:58:31', '1', '2022-01-01 16:58:31');
INSERT INTO `market_message` VALUES ('32781994805568', '222', '6', '2', '22', '232323', '1', null, '4', '0', 'admin', '18765068623', '1@qq.com', '0', '0', '1', '2022-01-01 16:58:31', '1', '2022-01-01 16:58:31');
INSERT INTO `market_message` VALUES ('32860582293824', '打发打发打发打发打发打发的', '4', '2', '232', '2323232323232', '1', null, '10', '0', 'admin', '18765068623', '1@qq.com', '1', '0', '1', '2022-01-01 16:58:31', '1', '2022-01-01 16:58:31');
INSERT INTO `market_message` VALUES ('32872731223360', 'e33', '3', '1', '3333', '333', '1', null, '1', '0', 'admin', '18765068623', '1@qq.com', '1', '0', '1', '2022-01-01 16:58:31', '1', '2022-01-01 16:58:31');
INSERT INTO `market_message` VALUES ('32872768467264', 'ewewewewewewewewewewewew', '2', '1', '3232', '323232', '1', null, '2', '2', 'admin', '18765068623', '1@qq.com', '1', '0', '1', '2022-01-01 16:58:31', '1', '2022-01-01 16:58:31');
INSERT INTO `market_message` VALUES ('32872795966784', '儿鹅鹅鹅鹅鹅鹅鹅鹅呃呃呃呃', '3', '1', '2323', '2323', '1', null, '10', '1', 'admin', '18765068623', '1@qq.com', '1', '0', '1', '2022-01-01 16:58:31', '1', '2022-01-01 16:58:31');
INSERT INTO `market_message` VALUES ('32872812965184', '333333333333333333333333', '2', '1', '3333', '3333', '1', null, '1', '0', 'admin', '18765068623', '1@qq.com', '0', '0', '1', '2022-01-01 16:58:31', '1', '2022-01-01 16:58:31');
INSERT INTO `market_message` VALUES ('32938799734080', '121212', '1', '1', '11', '1', '32938809133376', null, '10', '0', 'admin', '18765068623', '1@qq.com', '1', '0', '1', '2022-01-01 16:58:31', '1', '2022-01-01 16:58:31');
INSERT INTO `market_message` VALUES ('32939390174528', '23232', '1', '1', '22', '2', '1', null, '1', '0', 'admin', '18765068623', '1@qq.com', '0', '0', '1', '2022-01-08 07:22:56', '1', '2022-01-08 07:22:56');
INSERT INTO `market_message` VALUES ('32957179992384', '3333', '2', '2', '333', '3333', '1', null, '2', '0', 'admin', '18765068623', '1@qq.com', '1', '0', '1', '2022-01-08 12:12:26', '1', '2022-01-08 12:12:26');
INSERT INTO `market_message` VALUES ('34555335860544', '333', '1', '2', '1212', '1212', '1', null, '2', '0', 'admin', '18765068623', '122@qq.com', '0', '0', '1', '2022-01-26 13:44:05', '1', '2022-01-26 13:44:05');
INSERT INTO `market_message` VALUES ('34555359176000', '王企鹅请问', '1', '2', '121', '1212', '1', null, '1', '0', 'admin', '18765068623', '122@qq.com', '0', '0', '1', '2022-01-26 13:44:28', '1', '2022-01-26 13:44:28');
INSERT INTO `market_message` VALUES ('34555374897472', '12323', '1', '2', '12323', '232', '1', null, '3', '0', 'admin', '18765068623', '122@qq.com', '1', '0', '1', '2022-01-26 13:44:43', '1', '2022-01-26 13:44:43');
INSERT INTO `market_message` VALUES ('34555386616128', '23232323', '1', '3', '2323', '32', '1', null, '1', '0', 'admin', '18765068623', '122@qq.com', '0', '0', '1', '2022-01-26 13:44:55', '1', '2022-01-26 13:44:55');
INSERT INTO `market_message` VALUES ('34555399977280', '3433', '2', '2', '33', '3232', '1', null, '1', '0', 'admin', '18765068623', '122@qq.com', '1', '0', '1', '2022-01-26 13:45:08', '1', '2022-01-26 13:45:08');
INSERT INTO `market_message` VALUES ('34555426403648', '蔷薇蔷薇蔷薇', '1', '2', '123123', '2312', '1', null, '1', '4', 'admin', '18765068623', '122@qq.com', '0', '0', '1', '2022-01-26 13:45:34', '1', '2022-01-26 13:45:34');

-- ----------------------------
-- Table structure for `market_old_value`
-- ----------------------------
DROP TABLE IF EXISTS `market_old_value`;
CREATE TABLE `market_old_value` (
  `id` varchar(255) NOT NULL,
  `old_value` varchar(255) DEFAULT NULL,
  `old_name` varchar(255) DEFAULT NULL,
  `del_flag` char(1) DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_old_value
-- ----------------------------
INSERT INTO `market_old_value` VALUES ('1', '1', '1成新', '0', '1', '2022-01-03 11:02:03', '1', '2022-01-03 11:02:03');
INSERT INTO `market_old_value` VALUES ('10', '10', '全新', '0', '1', '2022-01-03 11:02:03', '1', '2022-01-03 11:02:03');
INSERT INTO `market_old_value` VALUES ('2', '2', '2成新', '0', '1', '2022-01-03 11:02:03', '1', '2022-01-03 11:02:03');
INSERT INTO `market_old_value` VALUES ('3', '3', '3成新', '0', '1', '2022-01-03 11:02:03', '1', '2022-01-03 11:02:03');
INSERT INTO `market_old_value` VALUES ('4', '4', '4成新', '0', '1', '2022-01-03 11:02:03', '1', '2022-01-03 11:02:03');
INSERT INTO `market_old_value` VALUES ('5', '5', '5成新', '0', '1', '2022-01-03 11:02:03', '1', '2022-01-03 11:02:03');
INSERT INTO `market_old_value` VALUES ('6', '6', '6成新', '0', '1', '2022-01-03 11:02:03', '1', '2022-01-03 11:02:03');
INSERT INTO `market_old_value` VALUES ('7', '7', '7成新', '0', '1', '2022-01-03 11:02:03', '1', '2022-01-03 11:02:03');
INSERT INTO `market_old_value` VALUES ('8', '8', '8成新', '0', '1', '2022-01-03 11:02:03', '1', '2022-01-03 11:02:03');
INSERT INTO `market_old_value` VALUES ('9', '9', '9成新', '0', '1', '2022-01-03 11:02:03', '1', '2022-01-03 11:02:03');

-- ----------------------------
-- Table structure for `market_sales_type`
-- ----------------------------
DROP TABLE IF EXISTS `market_sales_type`;
CREATE TABLE `market_sales_type` (
  `id` varchar(155) NOT NULL,
  `sales_type_name` varchar(155) DEFAULT NULL,
  `sales_type_desc` varchar(155) DEFAULT NULL,
  `del_flag` char(1) DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_sales_type
-- ----------------------------
INSERT INTO `market_sales_type` VALUES ('0', 'sales', '出售', '0', '1', '2022-01-05 20:43:48', '1', '2022-01-20 06:38:31');
INSERT INTO `market_sales_type` VALUES ('1', 'buy', '求购', '0', '1', '2022-01-05 20:43:48', '1', '2022-01-05 20:43:48');

-- ----------------------------
-- Table structure for `market_student`
-- ----------------------------
DROP TABLE IF EXISTS `market_student`;
CREATE TABLE `market_student` (
  `id` varchar(64) NOT NULL,
  `stu_name` varchar(64) DEFAULT NULL,
  `class_id` varchar(64) DEFAULT NULL,
  `sex` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_student
-- ----------------------------

-- ----------------------------
-- Table structure for `market_type`
-- ----------------------------
DROP TABLE IF EXISTS `market_type`;
CREATE TABLE `market_type` (
  `id` varchar(64) NOT NULL,
  `type_name` varchar(64) DEFAULT NULL,
  `type_desc` varchar(64) DEFAULT NULL,
  `del_flag` char(1) DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_type
-- ----------------------------
INSERT INTO `market_type` VALUES ('1', 'computer', '电脑及配件', '0', '1', '2022-01-01 17:05:12', '1', '2022-01-01 17:05:15');
INSERT INTO `market_type` VALUES ('2', 'communication', '通讯器材', '0', '1', '2022-01-01 17:07:13', '1', '2022-01-01 17:07:13');
INSERT INTO `market_type` VALUES ('3', 'media', '视听设备', '0', '1', '2022-01-01 17:07:13', '1', '2022-01-01 17:07:13');
INSERT INTO `market_type` VALUES ('4', 'books', '书籍报刊', '0', '1', '2022-01-01 17:07:13', '1', '2022-01-01 17:07:13');
INSERT INTO `market_type` VALUES ('5', 'service', '生活服务', '0', '1', '2022-01-01 17:07:13', '1', '2022-01-01 17:07:13');
INSERT INTO `market_type` VALUES ('6', 'houses', '房屋信息', '0', '1', '2022-01-01 17:07:13', '1', '2022-01-01 17:07:13');
INSERT INTO `market_type` VALUES ('7', 'traffic', '交通工具', '0', '1', '2022-01-02 00:00:00', '1', '2022-01-02 00:00:00');
INSERT INTO `market_type` VALUES ('8', 'others', '其它物品', '0', '1', '2022-01-01 17:07:13', '1', '2022-01-01 17:07:13');

-- ----------------------------
-- Table structure for `market_user`
-- ----------------------------
DROP TABLE IF EXISTS `market_user`;
CREATE TABLE `market_user` (
  `id` varchar(64) NOT NULL,
  `user_name` varchar(64) DEFAULT NULL,
  `pass_word` varchar(64) DEFAULT NULL,
  `image` varchar(64) DEFAULT NULL,
  `student_no` varchar(64) DEFAULT NULL,
  `sex` varchar(64) DEFAULT NULL,
  `birthday` varchar(64) DEFAULT NULL,
  `del_flag` char(1) DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_user
-- ----------------------------
INSERT INTO `market_user` VALUES ('1', 'admin', '1', '127c5f3039de48759711c4a43cce17ec.png', '2121', '男', '2021-12-23', '0', '1', '2022-01-15 18:55:59', '1', '2022-01-15 18:55:59', '122@qq.com', '18765068623');
INSERT INTO `market_user` VALUES ('31976229095744', 'math', '1', 'd0c0155cff20417b9920c2cadfd75bdb.png', '2333', '男', '2021-12-11', '0', '1', '2022-01-15 18:55:59', '1', '2022-01-15 18:55:59', '2', '2');
INSERT INTO `market_user` VALUES ('33584302863680', '2', null, null, '2', '女', '2021-11-29', '0', '1', '2022-01-15 00:00:00', '1', '2022-01-23 05:27:00', '2是', '222222');
INSERT INTO `market_user` VALUES ('33719531192640', '4', null, null, '4我', '男', '2021-12-01', '0', '1', '2022-01-17 00:00:00', '1', '2022-01-19 05:00:12', '4是', '4444');
INSERT INTO `market_user` VALUES ('33720041123136', '9', null, null, '9', '男', '2021-12-11', '0', '1', '2022-01-17 03:08:48', '1', '2022-01-17 03:08:48', '9', 'www');
INSERT INTO `market_user` VALUES ('33720049062208', '8', null, null, '8', '女', '2021-12-11', '0', '1', '2022-01-17 03:08:55', '1', '2022-01-17 03:08:55', '8', '8');
INSERT INTO `market_user` VALUES ('33903853481280', '31111', null, null, '1', '男', null, '0', '1', '2022-01-19 05:00:32', '1', '2022-01-19 05:00:32', '1', '1');
INSERT INTO `market_user` VALUES ('33903954296128', '2', null, null, '2', '男', '2022-01-13', '0', '1', '2022-01-19 05:02:10', '1', '2022-01-19 05:02:10', '2', '222');
