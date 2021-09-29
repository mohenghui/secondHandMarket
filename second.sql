/*
Navicat MySQL Data Transfer

Source Server         : 2
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : second

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2021-09-29 18:00:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `qq_message`
-- ----------------------------
DROP TABLE IF EXISTS `qq_message`;
CREATE TABLE `qq_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `fid` int(11) DEFAULT NULL,
  `qid` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `zan` int(11) DEFAULT '0',
  `note` varchar(500) DEFAULT NULL,
  `ndate` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `fusername` varchar(50) DEFAULT NULL,
  `attach` varchar(200) DEFAULT NULL,
  `attachname` varchar(200) DEFAULT NULL,
  `img` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qq_message
-- ----------------------------
INSERT INTO `qq_message` VALUES ('16', '97', '97', null, '1', null, '不错', '2019-03-03 22:47:46', 'bozai', 'bozai', null, null, 'photo1.jpg');
INSERT INTO `qq_message` VALUES ('17', '100', '97', null, '1', null, '在吗,这里可以发消息聊天', '2019-03-03 09:05:38', 'wangbo', 'bozai', null, null, 'photo4.jpg');
INSERT INTO `qq_message` VALUES ('22', '124', '100', null, '1', null, '在？', '2019-03-04 18:43:14', 'yangmi', 'wangbo', null, null, '8a52a523-060d-4a1f-a59c-490cba4e85a7.jpg');
INSERT INTO `qq_message` VALUES ('23', '125', '124', null, '1', null, '小幂在吗', '2019-03-04 19:07:40', 'linzhiling', 'yangmi', null, null, '3f987448-b54e-4ecf-a21f-9c36d63cf123.jpg');
INSERT INTO `qq_message` VALUES ('24', '126', '124', null, '1', null, null, '2021-02-27 20:48:11', 'mohenghui', 'yangmi', null, null, null);
INSERT INTO `qq_message` VALUES ('25', '126', '124', null, '2', null, null, '2021-02-27 20:49:11', 'mohenghui', 'yangmi', '3a6d8bee-cf46-4f18-8bb6-c7ceaf486101.aac', null, null);
INSERT INTO `qq_message` VALUES ('26', '126', '124', null, '2', null, null, '2021-02-27 20:51:04', 'mohenghui', 'yangmi', '3a6d8bee-cf46-4f18-8bb6-c7ceaf486101.aac', null, null);
INSERT INTO `qq_message` VALUES ('27', '126', '124', null, '2', null, null, '2021-02-27 20:51:21', 'mohenghui', 'yangmi', '3a6d8bee-cf46-4f18-8bb6-c7ceaf486101.aac', null, null);
INSERT INTO `qq_message` VALUES ('28', '126', '124', null, '2', null, null, '2021-02-27 20:51:32', 'mohenghui', 'yangmi', '3a6d8bee-cf46-4f18-8bb6-c7ceaf486101.aac', null, null);
INSERT INTO `qq_message` VALUES ('29', '124', '128', null, '1', null, '123', '2021-02-27 21:31:12', 'yangmi', 'mohenghui', null, null, '8a52a523-060d-4a1f-a59c-490cba4e85a7.jpg');
INSERT INTO `qq_message` VALUES ('30', '126', '124', null, '1', null, '12', '2021-02-27 21:31:41', 'mohenghui', 'yangmi', null, null, null);
INSERT INTO `qq_message` VALUES ('31', '124', '128', null, '1', null, '12212', '2021-02-27 21:32:01', 'yangmi', 'mohenghui', null, null, '8a52a523-060d-4a1f-a59c-490cba4e85a7.jpg');
INSERT INTO `qq_message` VALUES ('32', '126', '124', null, '1', null, '123', '2021-02-27 21:32:17', 'mohenghui', 'yangmi', null, null, null);
INSERT INTO `qq_message` VALUES ('33', '100', '124', null, '1', null, '在', '2021-02-27 21:51:20', 'wangbo', 'yangmi', null, null, 'photo4.jpg');
INSERT INTO `qq_message` VALUES ('34', '100', '124', null, '1', null, '你好', '2021-02-27 21:52:16', 'wangbo', 'yangmi', null, null, 'photo4.jpg');
INSERT INTO `qq_message` VALUES ('35', '124', '100', null, '1', null, '好的', '2021-02-27 21:52:24', 'yangmi', 'wangbo', null, null, '8a52a523-060d-4a1f-a59c-490cba4e85a7.jpg');
INSERT INTO `qq_message` VALUES ('36', '124', '100', null, '2', null, null, '2021-02-27 21:52:35', 'yangmi', 'wangbo', 'dcc99698-7b3e-49e1-893e-727c9cac3bc4.aac', null, '8a52a523-060d-4a1f-a59c-490cba4e85a7.jpg');
INSERT INTO `qq_message` VALUES ('37', '126', '124', null, '1', null, '12', '2021-02-27 22:10:07', 'mohenghui', 'yangmi', null, null, null);
INSERT INTO `qq_message` VALUES ('38', '124', '126', null, '1', null, '1', '2021-02-27 22:14:07', 'yangmi', 'mohenghui', null, null, '8a52a523-060d-4a1f-a59c-490cba4e85a7.jpg');
INSERT INTO `qq_message` VALUES ('39', '126', '124', null, '1', null, '12', '2021-02-27 22:14:57', 'mohenghui', 'yangmi', null, null, null);
INSERT INTO `qq_message` VALUES ('40', '137', '124', null, '2', null, null, '2021-03-07 21:38:14', 'mohenghui', 'yangmi', 'df7395e0-d437-4838-bc6b-88d7623ce3b2.aac', null, '84db0d49-b415-4a18-af5f-ed8cfbf8aa3e.jpg');
INSERT INTO `qq_message` VALUES ('41', '137', '124', null, '1', null, null, '2021-03-07 21:39:11', 'mohenghui', 'yangmi', null, null, '84db0d49-b415-4a18-af5f-ed8cfbf8aa3e.jpg');
INSERT INTO `qq_message` VALUES ('42', '137', '124', null, '1', null, null, '2021-03-07 21:39:13', 'mohenghui', 'yangmi', null, null, '84db0d49-b415-4a18-af5f-ed8cfbf8aa3e.jpg');
INSERT INTO `qq_message` VALUES ('43', '137', '124', null, '2', null, null, '2021-03-07 21:40:05', 'mohenghui', 'yangmi', '35b56e3b-a540-4b21-acdf-ffb3e026427c.aac', null, '84db0d49-b415-4a18-af5f-ed8cfbf8aa3e.jpg');
INSERT INTO `qq_message` VALUES ('44', '124', '137', null, '1', null, '123', '2021-03-07 21:41:07', 'yangmi', 'mohenghui', null, null, '8a52a523-060d-4a1f-a59c-490cba4e85a7.jpg');
INSERT INTO `qq_message` VALUES ('45', '137', '139', null, '1', null, '123', '2021-03-19 17:00:22', 'mohenghui', 'luomanting', null, null, '84db0d49-b415-4a18-af5f-ed8cfbf8aa3e.jpg');
INSERT INTO `qq_message` VALUES ('46', '139', '137', null, '1', null, '你好\n', '2021-03-19 17:00:31', 'luomanting', 'mohenghui', null, null, '6cc4b517-2f28-4a08-ae32-89bcbb93bb64.jpeg');
INSERT INTO `qq_message` VALUES ('47', '139', '137', null, '1', null, null, '2021-03-19 17:00:38', 'luomanting', 'mohenghui', null, null, '6cc4b517-2f28-4a08-ae32-89bcbb93bb64.jpeg');
INSERT INTO `qq_message` VALUES ('48', '139', '137', null, '1', null, null, '2021-03-19 17:00:48', 'luomanting', 'mohenghui', null, null, '6cc4b517-2f28-4a08-ae32-89bcbb93bb64.jpeg');
INSERT INTO `qq_message` VALUES ('49', '139', '137', null, '2', null, null, '2021-03-19 17:00:48', 'luomanting', 'mohenghui', 'f9251496-6ad6-44a0-b03c-bea42c1b285f.aac', null, '6cc4b517-2f28-4a08-ae32-89bcbb93bb64.jpeg');
INSERT INTO `qq_message` VALUES ('50', '139', '137', null, '1', null, null, '2021-03-19 17:00:55', 'luomanting', 'mohenghui', null, null, '6cc4b517-2f28-4a08-ae32-89bcbb93bb64.jpeg');

-- ----------------------------
-- Table structure for `qq_yzmessage`
-- ----------------------------
DROP TABLE IF EXISTS `qq_yzmessage`;
CREATE TABLE `qq_yzmessage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ndate` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tid` int(11) DEFAULT NULL,
  `fid` int(11) DEFAULT NULL,
  `fuser` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qq_yzmessage
-- ----------------------------
INSERT INTO `qq_yzmessage` VALUES ('1', '2019-03-03 16:09:01', '已同意', '97', '100', 'wangbo', 'photo4.jpg');
INSERT INTO `qq_yzmessage` VALUES ('2', '2019-03-03 16:43:10', '已同意', '97', '101', 'bozai5', 'photo3.jpg');
INSERT INTO `qq_yzmessage` VALUES ('3', '2019-03-03 16:48:30', '待同意', '98', '97', 'bozai', 'photo1.jpg');

-- ----------------------------
-- Table structure for `wct_bill`
-- ----------------------------
DROP TABLE IF EXISTS `wct_bill`;
CREATE TABLE `wct_bill` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `gids` varchar(100) DEFAULT NULL,
  `pirce` varchar(100) DEFAULT NULL,
  `user` varchar(100) DEFAULT NULL,
  `uid` varchar(100) DEFAULT NULL,
  `shop` varchar(100) DEFAULT NULL,
  `bill` varchar(2000) DEFAULT NULL,
  `openid` varchar(255) DEFAULT NULL,
  `ndate` varchar(255) DEFAULT NULL,
  `total` varchar(255) DEFAULT NULL,
  `way` varchar(50) DEFAULT NULL,
  `gnames` varchar(500) DEFAULT NULL,
  `sid` varchar(10) DEFAULT NULL,
  `state` int(1) DEFAULT NULL,
  `statecn` varchar(50) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `note` varchar(200) DEFAULT NULL,
  `price` varchar(100) DEFAULT NULL,
  `cuidan` varchar(255) DEFAULT NULL,
  `fnote` varchar(500) DEFAULT NULL,
  `paytype` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wct_bill
-- ----------------------------
INSERT INTO `wct_bill` VALUES ('22', '40', null, 'yangmi', '124', 'yangmi', null, null, '2019-03-04', '29', '', '化妆品收纳盒', '124', null, '未付款', '13111111111', '上海市闸北区西藏北路', '', null, null, null, null);
INSERT INTO `wct_bill` VALUES ('23', '41', null, 'yangmi', '124', 'wangbo', null, null, '2019-03-04', '98', null, '雅诗兰黛粉底', '100', null, '已付款', '13111111111', '上海市闸北区西藏北路', '11', null, null, null, null);
INSERT INTO `wct_bill` VALUES ('24', '41', null, 'yangmi', '124', 'wangbo', null, null, '2019-03-04', '98', null, '雅诗兰黛粉底', '100', null, '已付款', '13111111111', '上海市闸北区西藏北路', '11', null, null, null, null);
INSERT INTO `wct_bill` VALUES ('25', '36', null, 'linzhiling', '125', 'yangmi', null, null, '2019-03-04', '386', null, '全新雅诗兰黛眼霜', '124', null, '已发货', '13666666666', '台湾', '支持一下', null, null, null, null);
INSERT INTO `wct_bill` VALUES ('26', '38', null, 'mohenghui', '137', 'yangmi', null, null, '2021-03-07', '198', null, '自用九成新电竞椅', '124', null, '已付款', '13288290151', '广东省佛山市三水区', '123', null, null, null, null);
INSERT INTO `wct_bill` VALUES ('27', '37,44', null, 'mohenghui', '137', 'yangmi', null, null, '2021-03-19', '299', '', '全新雅诗兰黛粉底液,鞋子', '124', null, '未付款', '13288290151', '广东省佛山市三水区', '23', null, null, null, null);
INSERT INTO `wct_bill` VALUES ('28', '47', null, 'mohenghui', '137', 'luomanting', null, null, '2021-03-19', '12', '', '新鲜玩具', '139', null, '已付款', '13288290151', '广东省佛山市三水区', '23', null, null, null, null);

-- ----------------------------
-- Table structure for `wct_dingzuo`
-- ----------------------------
DROP TABLE IF EXISTS `wct_dingzuo`;
CREATE TABLE `wct_dingzuo` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `openid` varchar(200) DEFAULT NULL,
  `username` varchar(200) DEFAULT NULL,
  `renshu` varchar(20) DEFAULT NULL,
  `xingming` varchar(200) DEFAULT NULL,
  `shouji` varchar(200) DEFAULT NULL,
  `shijian` varchar(200) DEFAULT NULL,
  `todate` varchar(200) DEFAULT NULL,
  `beizhu` varchar(600) DEFAULT NULL,
  `shopid` varchar(200) DEFAULT NULL,
  `shopname` varchar(200) DEFAULT NULL,
  `ndate` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wct_dingzuo
-- ----------------------------

-- ----------------------------
-- Table structure for `wct_good`
-- ----------------------------
DROP TABLE IF EXISTS `wct_good`;
CREATE TABLE `wct_good` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `gname` varchar(100) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `jifen` varchar(10) DEFAULT NULL,
  `note` varchar(500) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `img` varchar(500) DEFAULT NULL,
  `count` varchar(10) DEFAULT '0',
  `typeid` varchar(10) DEFAULT NULL,
  `xiaoliang` int(10) DEFAULT '0',
  `ownid` varchar(10) DEFAULT NULL,
  `sid` varchar(10) DEFAULT NULL,
  `shop` varchar(50) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `uid` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `ntime` bigint(20) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `stype` varchar(50) DEFAULT NULL,
  `statecn` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wct_good
-- ----------------------------
INSERT INTO `wct_good` VALUES ('36', '全新雅诗兰黛眼霜', '386', null, '自用全新雅诗兰黛眼霜（尚未开封）', null, '60f035ac-dacd-4fb3-b841-8c439786bb62.jpg', null, null, null, null, '124', 'yangmi', null, '124', 'yangmi', '1551692646731', '9', null, '已交易');
INSERT INTO `wct_good` VALUES ('37', '全新雅诗兰黛粉底液', '298', null, '自用全新雅诗兰黛粉底液（尚未开封）', null, '1d0454fe-7cac-4a83-9707-869ed8524ee9.jpg', null, '28', null, null, '124', 'yangmi', null, '124', 'yangmi', '1551692694858', '9', null, '待交易');
INSERT INTO `wct_good` VALUES ('38', '自用九成新电竞椅', '198', null, '自用九成新电竞椅', null, '22c43197-07b8-4e6c-9c6e-834c9efbde0d.jpg', null, '25', null, null, '124', 'yangmi', null, '124', 'yangmi', '1551692753081', '9', null, '已交易');
INSERT INTO `wct_good` VALUES ('39', '自用恋爱秘籍', '38', null, '自用恋爱秘籍，一书得手，撩妹撩小哥哥手到擒来。', null, '7d119ebb-3671-4beb-a334-38d60cea0149.jpg', null, '27', null, null, '124', 'yangmi', null, '124', 'yangmi', '1551692830215', '9', null, '待交易');
INSERT INTO `wct_good` VALUES ('40', '化妆品收纳盒', '29', null, '自用九成新化妆品收纳盒', null, '20fbaae9-4bee-492f-8eb7-3bfc52076016.jpg', null, '28', null, null, '124', 'yangmi', null, '124', 'yangmi', '1551692884642', '9', null, '待交易');
INSERT INTO `wct_good` VALUES ('41', '雅诗兰黛粉底', '98', null, '自用雅诗兰黛粉底（未拆封）', null, 'a0ca1304-210f-43c8-b3c0-4546c1508dbf.jpg', null, '28', null, null, '100', 'wangbo', null, '100', 'wangbo', '1551696338842', '9', null, '已交易');
INSERT INTO `wct_good` VALUES ('43', '测试商品', '998', null, '测试商品介绍一番', null, 'f5945112-f611-4025-bdab-e92da442f8a8.jpg', null, '29', null, null, '125', 'linzhiling', null, '125', 'linzhiling', '1551697516132', '9', null, '待交易');
INSERT INTO `wct_good` VALUES ('44', '鞋子', '1', null, '\r\n                ', null, '249d1261-3418-480e-bb5c-58f492bd2bd5.jpg', null, '51', null, null, '124', 'yangmi', null, '124', 'yangmi', '1615124606188', '5', null, '待交易');
INSERT INTO `wct_good` VALUES ('45', '新鲜胶棒', '3', null, '不想要了\r\n                ', null, 'd2895201-d8a2-4e97-93d8-4743b00feee1.jpg', null, '44', null, null, '124', 'yangmi', null, '124', 'yangmi', '1615173434327', '5', null, '待交易');
INSERT INTO `wct_good` VALUES ('46', '耳机不要了，随便出', null, null, '\r\n                1', null, '28106f0b-3e3f-4fbf-bad8-a0f7683113f1.jpg', null, '45', null, null, '124', 'yangmi', null, '124', 'yangmi', '1616143854248', '5', null, '待交易');
INSERT INTO `wct_good` VALUES ('47', '新鲜玩具', '12', null, '\r\n                3', null, '91c04b00-126d-4f93-9a52-d729d5542ff9.jpg', null, '53', null, null, '139', 'luomanting', null, '139', 'luomanting', '1616144505371', '5', null, '待交易');
INSERT INTO `wct_good` VALUES ('48', '积木', '123', null, '\r\n          3      ', null, '5031f9cb-5dd8-4e8d-9a61-d28e1bbe0bb4.jpg', null, '53', null, null, '137', 'mohenghui', null, '137', 'mohenghui', '1630676291874', '5', null, '待交易');

-- ----------------------------
-- Table structure for `wct_notice`
-- ----------------------------
DROP TABLE IF EXISTS `wct_notice`;
CREATE TABLE `wct_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `note` varchar(500) DEFAULT NULL,
  `ndate` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `img` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wct_notice
-- ----------------------------
INSERT INTO `wct_notice` VALUES ('2', '这里是通知标题', '管理员可以发布一些通知给用户看', '2019-03-03 21:22:46', null, null);
INSERT INTO `wct_notice` VALUES ('5', '测试通知', '这里是通知内容', '2019-03-03 18:59:27', null, null);
INSERT INTO `wct_notice` VALUES ('6', '发布一则消息招收代理有想法的联系我', '发布一则消息招收代理有想法的联系我Tel:13777777777', '2019-03-04 19:00:01', null, null);
INSERT INTO `wct_notice` VALUES ('7', '测试', 'mo', '2021-02-27 20:23:52', null, null);

-- ----------------------------
-- Table structure for `wct_posts`
-- ----------------------------
DROP TABLE IF EXISTS `wct_posts`;
CREATE TABLE `wct_posts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `note` varchar(500) DEFAULT NULL,
  `uid` varchar(10) DEFAULT NULL,
  `username` varchar(200) DEFAULT NULL,
  `ndate` varchar(50) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wct_posts
-- ----------------------------
INSERT INTO `wct_posts` VALUES ('8', '出一个1.2M的席梦思床垫', '1.2M九成新席梦思床垫', '124', 'yangmi', '2019-03-04 17:55:50', '59fd6aa8-e47a-45c6-bffc-53d6277513bd.jpg', '出售');
INSERT INTO `wct_posts` VALUES ('10', '顺便发布一个代理消息', '招收校园代理', '125', 'linzhiling', '2019-03-04 19:10:11', '77df28fd-b1d5-4245-a25e-da7ce80dc7fe.jpg', '其他');
INSERT INTO `wct_posts` VALUES ('11', '234', '4', '124', 'yangmi', '2021-03-03 17:07:51', 'd63637ed-cae8-403f-b0cd-acb3f7ee663e.png', '求购');
INSERT INTO `wct_posts` VALUES ('12', '求买', '谢谢大佬', '124', 'yangmi', '2021-03-07 21:44:10', '788f079d-f148-4b09-a67d-fe76542d18d6.jpg', '求购');
INSERT INTO `wct_posts` VALUES ('13', '123', '买', '137', 'mohenghui', '2021-03-19 17:04:00', 'c1c36f69-c712-4a5b-9424-006603ab55a5.jpg', '求购');

-- ----------------------------
-- Table structure for `wct_replay`
-- ----------------------------
DROP TABLE IF EXISTS `wct_replay`;
CREATE TABLE `wct_replay` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` varchar(10) DEFAULT NULL,
  `note` varchar(500) DEFAULT NULL,
  `uid` varchar(10) DEFAULT NULL,
  `username` varchar(200) DEFAULT NULL,
  `ndate` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wct_replay
-- ----------------------------
INSERT INTO `wct_replay` VALUES ('42', '26', '你好', '59', 'admin', '2019-03-03 20:34:33');
INSERT INTO `wct_replay` VALUES ('43', '26', '呵呵呵', '59', 'admin', '2019-03-03 20:35:09');
INSERT INTO `wct_replay` VALUES ('44', '16', '这里可以相互交流', '111', '波仔', '2019-03-03 08:54:48');
INSERT INTO `wct_replay` VALUES ('45', '26', '这里可以卖家沟通', '113', '小凤', '2019-03-03 09:17:33');
INSERT INTO `wct_replay` VALUES ('46', '1', '可以相互回复交流', '113', '小凤', '2019-03-03 09:20:42');
INSERT INTO `wct_replay` VALUES ('47', '26', '发信息留言', '113', '小凤', '2019-03-03 18:58:33');
INSERT INTO `wct_replay` VALUES ('48', '16', '可以大家讨论', '113', '小凤', '2019-03-03 18:58:42');
INSERT INTO `wct_replay` VALUES ('52', '11', '不错', '97', 'bozai', '2019-03-03 16:23:03');
INSERT INTO `wct_replay` VALUES ('59', '41', '1', '124', 'yangmi', '2019-03-04 18:47:55');
INSERT INTO `wct_replay` VALUES ('60', '8', '11', '124', 'yangmi', '2019-03-04 18:51:21');
INSERT INTO `wct_replay` VALUES ('61', '43', '新品上市都来看看', '125', 'linzhiling', '2019-03-04 19:07:09');
INSERT INTO `wct_replay` VALUES ('62', '36', '听不错', '125', 'linzhiling', '2019-03-04 19:08:29');
INSERT INTO `wct_replay` VALUES ('63', '10', '我来我来', '125', 'linzhiling', '2019-03-04 19:10:30');
INSERT INTO `wct_replay` VALUES ('64', '39', '6', '124', 'yangmi', '2021-02-27 20:36:30');
INSERT INTO `wct_replay` VALUES ('65', '37', '', '126', 'mohenghui', '2021-02-27 21:29:36');
INSERT INTO `wct_replay` VALUES ('66', '12', '123123', '124', 'yangmi', '2021-03-07 21:44:17');
INSERT INTO `wct_replay` VALUES ('67', '44', '牛', '124', 'yangmi', '2021-03-08 11:33:06');
INSERT INTO `wct_replay` VALUES ('68', '47', '123', '137', 'mohenghui', '2021-03-19 17:01:55');

-- ----------------------------
-- Table structure for `wct_shop`
-- ----------------------------
DROP TABLE IF EXISTS `wct_shop`;
CREATE TABLE `wct_shop` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `sname` varchar(100) DEFAULT NULL,
  `img` varchar(500) DEFAULT NULL,
  `note` varchar(500) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `longitude` varchar(100) DEFAULT NULL,
  `latitude` varchar(100) DEFAULT NULL,
  `tel` varchar(100) DEFAULT NULL,
  `ownid` varchar(10) DEFAULT NULL,
  `passwd` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wct_shop
-- ----------------------------
INSERT INTO `wct_shop` VALUES ('26', '重庆', null, null, null, null, null, null, null, null);
INSERT INTO `wct_shop` VALUES ('27', '深圳', null, null, null, null, null, null, '59', null);
INSERT INTO `wct_shop` VALUES ('28', '成都', null, null, null, null, null, null, '59', null);

-- ----------------------------
-- Table structure for `wct_type`
-- ----------------------------
DROP TABLE IF EXISTS `wct_type`;
CREATE TABLE `wct_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(500) DEFAULT NULL,
  `ownid` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wct_type
-- ----------------------------
INSERT INTO `wct_type` VALUES ('25', '桌椅', null);
INSERT INTO `wct_type` VALUES ('27', '书籍', null);
INSERT INTO `wct_type` VALUES ('28', '化妆品', null);
INSERT INTO `wct_type` VALUES ('29', '测试类别', null);
INSERT INTO `wct_type` VALUES ('30', '空调', null);
INSERT INTO `wct_type` VALUES ('31', '篮球', null);
INSERT INTO `wct_type` VALUES ('32', '饮料', null);
INSERT INTO `wct_type` VALUES ('33', '望远镜', null);
INSERT INTO `wct_type` VALUES ('34', '书籍', null);
INSERT INTO `wct_type` VALUES ('35', '收音机', null);
INSERT INTO `wct_type` VALUES ('36', '计算器', null);
INSERT INTO `wct_type` VALUES ('37', '键盘', null);
INSERT INTO `wct_type` VALUES ('38', '电脑屏幕', null);
INSERT INTO `wct_type` VALUES ('39', '鼠标', null);
INSERT INTO `wct_type` VALUES ('41', '哑铃', null);
INSERT INTO `wct_type` VALUES ('42', '电筒', null);
INSERT INTO `wct_type` VALUES ('43', '足球', null);
INSERT INTO `wct_type` VALUES ('44', '胶棒', null);
INSERT INTO `wct_type` VALUES ('45', '耳机', null);
INSERT INTO `wct_type` VALUES ('46', '笔', null);
INSERT INTO `wct_type` VALUES ('47', '手机', null);
INSERT INTO `wct_type` VALUES ('48', '冰箱', null);
INSERT INTO `wct_type` VALUES ('49', '剪刀', null);
INSERT INTO `wct_type` VALUES ('50', '衣服', null);
INSERT INTO `wct_type` VALUES ('51', '鞋子', null);
INSERT INTO `wct_type` VALUES ('52', '零食', null);
INSERT INTO `wct_type` VALUES ('53', '玩具', null);
INSERT INTO `wct_type` VALUES ('54', '投影仪', null);
INSERT INTO `wct_type` VALUES ('55', '洗衣机', null);

-- ----------------------------
-- Table structure for `wct_user`
-- ----------------------------
DROP TABLE IF EXISTS `wct_user`;
CREATE TABLE `wct_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `passwd` varchar(50) DEFAULT NULL,
  `roletype` varchar(50) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `wechat` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `birth` varchar(20) DEFAULT NULL,
  `img` varchar(200) DEFAULT NULL,
  `sid` varchar(10) DEFAULT NULL,
  `latitude` varchar(200) DEFAULT NULL,
  `longitude` varchar(200) DEFAULT NULL,
  `money` int(11) DEFAULT NULL,
  `fids` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=140 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wct_user
-- ----------------------------
INSERT INTO `wct_user` VALUES ('59', 'admin', 'admin', '1', '', '6栋120', '15123385885', '543548596', '', null, '2019-03-03', null, null, '38.00125', '110.5635817', null, '100');
INSERT INTO `wct_user` VALUES ('124', 'yangmi', '1122', '2', '123', '广东中山电子科技大学', '13111111111', '1234', '56', '女', '2019-03-04', '8a52a523-060d-4a1f-a59c-490cba4e85a7.jpg', null, '37.00125', '116.56358166666665', '196', '100,125,126,137,139');
INSERT INTO `wct_user` VALUES ('103', 'admin2', '1', '1', null, null, null, null, null, null, '2019-03-03', null, null, '29.595428', '106.228918', null, null);
INSERT INTO `wct_user` VALUES ('137', 'mohenghui', '123456', '2', '123456@qq.com', '广东省佛山市三水区', '13288290151', '973733507', '123456', '男', '2000-03-07', '84db0d49-b415-4a18-af5f-ed8cfbf8aa3e.jpg', null, '37.00125', '108.56358166666665', '210', '124,139');
INSERT INTO `wct_user` VALUES ('139', 'luomanting', '123321', '2', '456465', '广东茂名', '11111111111', '1236666', '123131231', '女', '2021-03-19', '6cc4b517-2f28-4a08-ae32-89bcbb93bb64.jpeg', null, '39.00125', '110.56358166666665', null, '124,137');
INSERT INTO `wct_user` VALUES ('131', 'lihua', '123', '2', '132321@qq.com', '北京天安门', '13288290151', '973733507', '123', '女', '2000-03-07', 'b8f5c458-7191-4cb7-995e-bae543ae72e7.jpeg', null, '37.00125', '116.56358166666665', null, null);
INSERT INTO `wct_user` VALUES ('132', 'limeimei', '123', '2', '132321@qq.com', '北京天安门广场', '18288290151', '973733507', '123', '男', '2000-03-07', '7cae149b-453c-416c-b8e2-e159c2fe2f79.jpeg', null, null, null, null, null);
INSERT INTO `wct_user` VALUES ('133', 'lurenjia', '123', '2', '132321@qq.com', '北京天安门广场', '18288290151', '973733507', '123', '男', '2000-03-07', '44989897-fa50-4728-9cc5-e051f053874a.jpeg', null, null, null, null, null);
INSERT INTO `wct_user` VALUES ('134', 'lurenyi', '123', '2', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `wct_user` VALUES ('136', 'luomangou2', '123', '2', '132321@qq.com', '北京天安门广场', '18288290151', '973733507', '123', '男', '2000-03-07', '3e1c62a3-1b1d-4441-8535-8297492ad5eb.jpeg', null, null, null, null, null);

-- ----------------------------
-- Table structure for `wct_vip`
-- ----------------------------
DROP TABLE IF EXISTS `wct_vip`;
CREATE TABLE `wct_vip` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `qq` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `openid` varchar(255) DEFAULT NULL,
  `vname` varchar(255) DEFAULT NULL,
  `wname` varchar(255) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wct_vip
-- ----------------------------
