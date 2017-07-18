/*
Navicat MySQL Data Transfer

Source Server         : mywork
Source Server Version : 50553
Source Host           : 127.0.0.1:3306
Source Database       : threeup

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-07-01 14:37:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `aid` int(5) NOT NULL AUTO_INCREMENT,
  `aname` varchar(6) NOT NULL,
  `apasswd` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES ('1', 'user', 'pass');
INSERT INTO `administrator` VALUES ('2', 'usee', 'padd');

-- ----------------------------
-- Table structure for appointment
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment` (
  `apid` varchar(15) NOT NULL,
  `apphone` varchar(11) DEFAULT NULL,
  `atphone` varchar(11) DEFAULT NULL,
  `acname` varchar(8) DEFAULT NULL,
  `acage` int(2) DEFAULT NULL,
  `acsex` varchar(4) DEFAULT NULL,
  `asubject` varchar(6) DEFAULT NULL,
  `acgrade` varchar(8) DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL,
  `astarttime` varchar(30) DEFAULT NULL,
  `astoptime` varchar(30) DEFAULT NULL,
  `aday` int(4) DEFAULT NULL,
  `aflag` int(11) DEFAULT '0',
  PRIMARY KEY (`apid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appointment
-- ----------------------------
INSERT INTO `appointment` VALUES ('20170531123045', '17864212755', '17863822789', 'zhangsan', '12', '男', '英语', '四年级', 'qingdao', '05/28/17', '05/31/17', '3', '1');
INSERT INTO `appointment` VALUES ('20170601092535', '17864212755', '17863822789', 'zhangsan', '12', '男', '数学', '四年级', 'qingdao', '05/28/17', '05/31/17', '3', '2');
INSERT INTO `appointment` VALUES ('201706191932417', '17864211234', '17864212755', 'tom', '13', '男', '语文', '三年级', 'shanghai', '06/20/17', '06/24/17', '4', '2');

-- ----------------------------
-- Table structure for follow
-- ----------------------------
DROP TABLE IF EXISTS `follow`;
CREATE TABLE `follow` (
  `fid` int(5) NOT NULL AUTO_INCREMENT,
  `followID` varchar(11) DEFAULT NULL,
  `followedID` varchar(11) DEFAULT NULL,
  `ftime` datetime DEFAULT NULL,
  `ftype` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of follow
-- ----------------------------
INSERT INTO `follow` VALUES ('2', '17864212755', '17863822789', '2017-05-28 17:08:09', 'PT');
INSERT INTO `follow` VALUES ('3', '17864212755', '17864212789', '2017-06-17 18:39:18', 'PT');
INSERT INTO `follow` VALUES ('4', '17864212755', '17864212755', '2017-06-19 18:24:46', 'PT');

-- ----------------------------
-- Table structure for fteacher
-- ----------------------------
DROP TABLE IF EXISTS `fteacher`;
CREATE TABLE `fteacher` (
  `tid` int(5) NOT NULL AUTO_INCREMENT,
  `tname` varchar(20) DEFAULT NULL,
  `tphone` varchar(11) NOT NULL,
  `tpasswd` varchar(8) DEFAULT NULL,
  `tage` int(2) DEFAULT NULL,
  `tsex` varchar(1) DEFAULT NULL,
  `tshool` varchar(30) DEFAULT NULL,
  `teducation` varchar(6) DEFAULT NULL,
  `tgread` varchar(8) DEFAULT NULL,
  `tintroduce` varchar(200) DEFAULT NULL,
  `thabit` varchar(100) DEFAULT NULL,
  `isPass` int(1) DEFAULT '0',
  `timage` varchar(100) DEFAULT NULL,
  `isGold` int(1) DEFAULT '0',
  `tpoints` int(5) DEFAULT '0',
  `registerDate` datetime DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=20014 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fteacher
-- ----------------------------
INSERT INTO `fteacher` VALUES ('20002', '李四', '17864212755', '1234', '19', 'M', '青岛科技大学', '本科', '一年级', 'a boy ', 'soccer', '1', 'img/17864212755.png', '0', '2', '2017-05-27 10:11:48');
INSERT INTO `fteacher` VALUES ('20003', '王五', '17864212789', '1234', '20', 'M', '青岛大学', '本科', '三年级', 'a girl', 'football', '1', 'img/17864212755.png', '0', '1', '2017-05-27 10:13:03');
INSERT INTO `fteacher` VALUES ('20004', '希特勒', '17863822789', '2222', '25', 'W', '青岛大学', '硕士', '一年级', 'a boy ', 'soccer ', '1', 'img/17864212755.png', '0', '3', '2017-05-27 10:33:22');
INSERT INTO `fteacher` VALUES ('20005', '秦始皇', '17865421987', '1111', '26', 'M', '青岛科技大学', '本科', '四年级', 'a boy', 'football', '1', 'img/17864212755.png', '0', '5', '2017-05-28 12:34:45');
INSERT INTO `fteacher` VALUES ('20006', '凯撒', '18398756421', '1234', '23', 'W', '青岛大学', '本科', '三年级', ' a girl', 'football', '1', 'img/17864212755.png', '0', '2', '2017-06-14 08:54:41');
INSERT INTO `fteacher` VALUES ('20007', '哥白尼', '17865423986', '1234', '24', 'M', '中国石油大学', '硕士', '二年级', 'a boy', 'football', '1', 'img/17864212755.png', '0', '4', '2017-06-08 08:56:14');
INSERT INTO `fteacher` VALUES ('20008', '梵高', '17654263562', '1234', '25', 'M', '青岛大学', '本科', '一年级', 'a boy', 'football', '1', 'img/17864212755.png', '0', '1', '2017-06-01 08:58:11');
INSERT INTO `fteacher` VALUES ('20009', 'tom', '17862362122', '1234', '23', 'W', '山东大学', '本科', '二年级', 'a girl', 'football', '1', 'img/17864212755.png', '0', '3', '2017-06-20 16:46:48');

-- ----------------------------
-- Table structure for parents
-- ----------------------------
DROP TABLE IF EXISTS `parents`;
CREATE TABLE `parents` (
  `pid` int(5) NOT NULL AUTO_INCREMENT,
  `pphone` varchar(11) NOT NULL,
  `ppasswd` varchar(8) DEFAULT NULL,
  `pimage` varchar(50) DEFAULT NULL,
  `pname` varchar(10) DEFAULT NULL,
  `cname` varchar(10) DEFAULT NULL,
  `csex` varchar(1) DEFAULT NULL,
  `cage` int(2) DEFAULT NULL,
  `cgrade` varchar(8) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `pclaim` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=30007 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of parents
-- ----------------------------
INSERT INTO `parents` VALUES ('30001', '17864212755', '1111', '../image/HeadPortrait/default.png', '王五', '王留', '男', '13', '六年级', '青岛即墨', '要求大三学生，数学专业');
INSERT INTO `parents` VALUES ('30002', '18653291732', '1234', '../image/HeadPortrait/default.png', '李柳', '李子', '女', '12', '三年级', '青岛市兰山区', '艺术生');
INSERT INTO `parents` VALUES ('30003', '17862352757', '1234', '../image/HeadPortrait/default.png', '张新', '张冬', '男', '14', '六年级', '青岛市市北', '要求有奥赛经验');
INSERT INTO `parents` VALUES ('30004', '18723725323', '1234', '../image/HeadPortrait/default.png', '刘师', '刘午', '男', '13', '五年级', '青岛市黄岛', '大三以上本科，计算机专业');
INSERT INTO `parents` VALUES ('30005', '16728738236', '1234', '../image/HeadPortrait/default.png', '元九', '元欧', '女', '12', '四年级', '青岛市北九水', '英语六级以上，有比赛经验');

-- ----------------------------
-- Table structure for qbank
-- ----------------------------
DROP TABLE IF EXISTS `qbank`;
CREATE TABLE `qbank` (
  `qid` int(5) NOT NULL AUTO_INCREMENT,
  `qnumber` int(5) DEFAULT NULL,
  `qsubject` varchar(8) DEFAULT NULL,
  `qconent` varchar(500) DEFAULT NULL,
  `qanswer` varchar(50) DEFAULT NULL,
  `qrank` varchar(2) DEFAULT NULL,
  `qanalysis` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qbank
-- ----------------------------
INSERT INTO `qbank` VALUES ('1', '1', '数学', '甲、乙两个自然数的最大公因数是7，并且甲数除以乙数所得的商是1又8分之一，求乙数？', 'A', '2', '甲数：乙数=11:8,甲乙两个数的最大公因数是7.甲数是11×7=77,乙数是8×7=56');
INSERT INTO `qbank` VALUES ('2', '2', '数学', '某班一次数学考试，所有成绩得优的同学平均分是95分，没有得优的同学平均分是80分，已知全班同学的平均成绩不少于90分，问得优的同学占全班同学的比例是多少？', 'B', '3', '为使全班同学平均分达到90分，需得2名得优的同学和一名没得优的同学匹配成一组。那么得优的同学至少是没得优的同学2倍，所以得优的同学所占比利至少是三分之二。');
INSERT INTO `qbank` VALUES ('3', '3', '数学', '用1、2、3、4、5、6、7这七个数字恰好组成一个一位数和两个三位数，每个数字只能使用一次，使得这三个数字两两互质。已知其中一个三位数是714，那么其他两个数是多少？', 'D', '3', '还剩下2、3、5、6可以使用。分解714=2*3*7*17，一位数只能是5，剩下的三位数只能是以3结尾，二623是7的倍数，不满足条件，所以只能是263.');
INSERT INTO `qbank` VALUES ('4', '4', '数学', '有一个三位数是8的倍数，把它的各位数字的顺序颠倒过来所得到的新三位数与原三位数的和恰好是1111.那么原来的三位数是多少?', 'C', '3', '设原三位数为abc，则新三位数为cba，根据位置原理有，abc+cba=101(a+c)+20b.\r\n\r\n又因为1111=101×11，且b为一位数，所以a+c=11,b=0;原数为8的倍数，则c=4,a=7,所以原来的三位数是704.');
INSERT INTO `qbank` VALUES ('5', '1', '语文', '下列各句中没有语病的一句是 （    ）', 'A', '2', 'B中说法不合事理，应删去“不”；C中成分残缺，缺少主语，应删去“使”；D中前后不一致，应删去“是否”。');

-- ----------------------------
-- Table structure for qconent
-- ----------------------------
DROP TABLE IF EXISTS `qconent`;
CREATE TABLE `qconent` (
  `qcid` int(5) NOT NULL AUTO_INCREMENT,
  `qid` int(5) DEFAULT NULL,
  `qoption` varchar(1) DEFAULT NULL,
  `qoconent` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`qcid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qconent
-- ----------------------------
INSERT INTO `qconent` VALUES ('1', '1', 'A', '56');
INSERT INTO `qconent` VALUES ('2', '1', 'B', '65');
INSERT INTO `qconent` VALUES ('3', '1', 'C', '34');
INSERT INTO `qconent` VALUES ('4', '1', 'D', '54');
INSERT INTO `qconent` VALUES ('5', '2', 'A', '1/3');
INSERT INTO `qconent` VALUES ('6', '2', 'B', '2/3');
INSERT INTO `qconent` VALUES ('7', '2', 'C', '3/4');
INSERT INTO `qconent` VALUES ('8', '2', 'D', '1/2');
INSERT INTO `qconent` VALUES ('9', '3', 'A', '4，245');
INSERT INTO `qconent` VALUES ('10', '3', 'B', '5，146');
INSERT INTO `qconent` VALUES ('11', '3', 'C', '3，256');
INSERT INTO `qconent` VALUES ('12', '3', 'D', '5，263');
INSERT INTO `qconent` VALUES ('13', '4', 'A', '703');
INSERT INTO `qconent` VALUES ('14', '4', 'B', '604');
INSERT INTO `qconent` VALUES ('15', '4', 'C', '704');
INSERT INTO `qconent` VALUES ('16', '4', 'D', '603');
INSERT INTO `qconent` VALUES ('17', '5', 'A', '我们只有相信自己的能力，才能在各种考验前充满信心。');
INSERT INTO `qconent` VALUES ('18', '5', 'B', '为防止不再发生类似的伤害事故，政教处采取了很多安全措施。');
INSERT INTO `qconent` VALUES ('19', '5', 'C', '经过昨天一场大雨，使空气清新多了。');
INSERT INTO `qconent` VALUES ('20', '5', 'D', '语言是否通顺是衡量一篇好作文的基本的标准。');

-- ----------------------------
-- Table structure for sqinfo
-- ----------------------------
DROP TABLE IF EXISTS `sqinfo`;
CREATE TABLE `sqinfo` (
  `sqid` int(5) NOT NULL AUTO_INCREMENT,
  `spphone` varchar(11) DEFAULT NULL,
  `sname` varchar(8) DEFAULT NULL,
  `sanswer` varchar(50) DEFAULT NULL,
  `qanswer` varchar(50) DEFAULT NULL,
  `sisright` varchar(5) DEFAULT NULL,
  `sqtime` datetime DEFAULT NULL,
  `qsubject` varchar(8) DEFAULT NULL,
  `qid` int(5) DEFAULT NULL,
  PRIMARY KEY (`sqid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sqinfo
-- ----------------------------
INSERT INTO `sqinfo` VALUES ('2', '17864212755', '王五', 'B', 'B', 'true', '2017-05-30 20:58:32', '数学', '2');
INSERT INTO `sqinfo` VALUES ('3', '17865421987', '秦始皇', 'A', 'A', 'true', '2017-06-16 16:55:54', '数学', '1');
INSERT INTO `sqinfo` VALUES ('4', '17865421987', '秦始皇', 'B', 'B', 'true', '2017-06-16 16:56:10', '数学', '2');
INSERT INTO `sqinfo` VALUES ('5', '17864212755', '王五', 'B', 'D', 'false', '2017-06-19 18:25:21', '数学', '3');
INSERT INTO `sqinfo` VALUES ('8', '17864212755', '王五', '', 'A', 'false', '2017-06-19 18:39:25', '数学', '1');
INSERT INTO `sqinfo` VALUES ('9', '17864212755', '王五', 'A', 'A', 'true', '2017-06-19 18:39:29', '数学', '1');
INSERT INTO `sqinfo` VALUES ('10', '17864212755', '王五', 'A', 'C', 'false', '2017-06-19 18:50:05', '数学', '4');

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `sid` int(5) NOT NULL AUTO_INCREMENT,
  `sname` varchar(8) DEFAULT NULL,
  `sprice` double(4,0) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=10009 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES ('10001', '语文', '40');
INSERT INTO `subject` VALUES ('10002', '数学', '50');
INSERT INTO `subject` VALUES ('10003', '英语', '40');
INSERT INTO `subject` VALUES ('10004', '物理', '40');
INSERT INTO `subject` VALUES ('10005', '化学', '40');
INSERT INTO `subject` VALUES ('10006', '政治', '30');
INSERT INTO `subject` VALUES ('10007', '历史', '35');
INSERT INTO `subject` VALUES ('10008', '生物', '40');

-- ----------------------------
-- Table structure for tcinfo
-- ----------------------------
DROP TABLE IF EXISTS `tcinfo`;
CREATE TABLE `tcinfo` (
  `tcid` int(5) NOT NULL AUTO_INCREMENT,
  `tphone` varchar(11) DEFAULT NULL,
  `grade` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`tcid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tcinfo
-- ----------------------------
INSERT INTO `tcinfo` VALUES ('1', '17864212755', '初中');
INSERT INTO `tcinfo` VALUES ('2', '17864212789', '高中');
INSERT INTO `tcinfo` VALUES ('3', '17863822789', '高中');
INSERT INTO `tcinfo` VALUES ('4', '17865421987', '初中');
INSERT INTO `tcinfo` VALUES ('5', '18398756421', '初中');
INSERT INTO `tcinfo` VALUES ('6', '18398756421', '高中');
INSERT INTO `tcinfo` VALUES ('7', '17865423986', '初中');
INSERT INTO `tcinfo` VALUES ('8', '17654263562', '初中');
INSERT INTO `tcinfo` VALUES ('9', '17862362122', '高中');

-- ----------------------------
-- Table structure for tporders
-- ----------------------------
DROP TABLE IF EXISTS `tporders`;
CREATE TABLE `tporders` (
  `oid` varchar(15) NOT NULL,
  `tphone` varchar(11) DEFAULT NULL,
  `pphone` varchar(11) DEFAULT NULL,
  `ocname` varchar(10) DEFAULT NULL,
  `ocage` int(2) DEFAULT NULL,
  `ocsex` varchar(4) DEFAULT NULL,
  `osubject` varchar(8) DEFAULT NULL,
  `ocgrade` varchar(8) DEFAULT NULL,
  `otime` datetime DEFAULT NULL,
  `studyTime` int(3) DEFAULT NULL,
  `startTime` varchar(30) DEFAULT NULL,
  `endTime` varchar(30) DEFAULT NULL,
  `oprice` double(4,0) DEFAULT NULL,
  `isValid` int(1) DEFAULT '0',
  `canceltime` datetime DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tporders
-- ----------------------------
INSERT INTO `tporders` VALUES ('201705312328116', '17863822789', '17864212755', 'zhangsan', '12', '男', '英语', '四年级', '2017-05-31 23:28:06', '3', '05/28/17', '05/31/17', '120', '1', '2017-05-31 23:28:06');
INSERT INTO `tporders` VALUES ('201706291732203', '17864212755', '17864211234', 'tom', '13', '男', '语文', '三年级', '2017-06-29 17:32:24', '4', '06/20/17', '06/24/17', '160', '1', '2017-06-29 17:32:24');
INSERT INTO `tporders` VALUES ('201706291742400', '17864212755', '17864211234', 'tom', '13', '男', '语文', '三年级', '2017-06-29 17:42:53', '4', '06/20/17', '06/24/17', '160', '1', '2017-06-29 17:42:53');

-- ----------------------------
-- Table structure for tsinfo
-- ----------------------------
DROP TABLE IF EXISTS `tsinfo`;
CREATE TABLE `tsinfo` (
  `tsid` int(5) NOT NULL AUTO_INCREMENT,
  `tphone` varchar(11) DEFAULT NULL,
  `sid` int(5) DEFAULT NULL,
  `sname` varchar(8) DEFAULT NULL,
  `tprice` double(4,0) DEFAULT NULL,
  PRIMARY KEY (`tsid`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tsinfo
-- ----------------------------
INSERT INTO `tsinfo` VALUES ('10', '17864212789', '10003', '英语', '40');
INSERT INTO `tsinfo` VALUES ('12', '17863822789', '10004', '物理', '40');
INSERT INTO `tsinfo` VALUES ('13', '17863822789', '10007', '历史', '40');
INSERT INTO `tsinfo` VALUES ('14', '17864212755', '10001', '语文', '40');
INSERT INTO `tsinfo` VALUES ('15', '17864212755', '10002', '数学', '50');
INSERT INTO `tsinfo` VALUES ('16', '17865421987', '10007', '历史', '40');
INSERT INTO `tsinfo` VALUES ('17', '17865421987', '10003', '英语', '40');
INSERT INTO `tsinfo` VALUES ('18', '17865421987', '10004', '物理', '40');
INSERT INTO `tsinfo` VALUES ('19', '18398756421', '10004', '物理', '40');
INSERT INTO `tsinfo` VALUES ('20', '18398756421', '10001', '语文', '40');
INSERT INTO `tsinfo` VALUES ('21', '17865423986', '10003', '英语', '40');
INSERT INTO `tsinfo` VALUES ('22', '17865423986', '10007', '历史', '40');
INSERT INTO `tsinfo` VALUES ('23', '17654263562', '10002', '数学', '50');
INSERT INTO `tsinfo` VALUES ('24', '17862362122', '10002', '数学', '50');
INSERT INTO `tsinfo` VALUES ('25', '17865212766', '10001', '语文', '40');
INSERT INTO `tsinfo` VALUES ('26', '17865212766', '10003', '英语', '40');
INSERT INTO `tsinfo` VALUES ('27', '17865432176', '10001', '语文', '40');
INSERT INTO `tsinfo` VALUES ('28', '17865432176', '10004', '物理', '40');
