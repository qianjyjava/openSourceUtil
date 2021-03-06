
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_name` varchar(30) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `user_grade` varchar(1) DEFAULT NULL COMMENT '性别:1男0女',
  `user_head_url` varchar(100) DEFAULT NULL COMMENT '头像',
  `user_big_head_url` varchar(100) DEFAULT NULL COMMENT '用户大头像',
  `is_salesman` varchar(1) DEFAULT '2' COMMENT '营销员或普通用户（1营销员、2普通用户）',
  `status` varchar(1) DEFAULT '1' COMMENT '状态（0无限、1有效）只有有效才可以访问一起保',
  `flow_number` varchar(2) DEFAULT NULL COMMENT '营销员的审核流程（1用户提交资料、2用户个人信息、3用户支付、4需重新上传

资料、5待回访、6审核不通过、7已退款、8审核通过、9营销员已登录并点击、10待退费）',
  `flow_number_ancillary` varchar(2) DEFAULT NULL COMMENT '营销员的审核流程（如null代表没有提出申请、1提出申请、9审核通过

、6审核不通过）',
  `company_id` int(3) unsigned DEFAULT '0' COMMENT '所在公司编号',
  `company_type` int(3) unsigned DEFAULT '0' COMMENT '所在公司类型',
  `company_simple_name` varchar(255) DEFAULT NULL COMMENT '所在公司简称',
  `province_code` varchar(100) DEFAULT NULL COMMENT '所在省份编号',
  `province_name` varchar(50) DEFAULT NULL COMMENT '所在省份名称',
  `city_code` varchar(100) DEFAULT NULL COMMENT '所在城市编号',
  `city_name` varchar(50) DEFAULT NULL COMMENT '所在城市名',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `mobile_phone` varchar(100) DEFAULT NULL COMMENT '移动电话',
  `real_name` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `birth` date DEFAULT NULL COMMENT '出生日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户基本信息表';

DROP TABLE IF EXISTS `user_msg`;
CREATE TABLE `user_msg` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `salesmanId` int(10) not null DEFAULT 0 comment '营销员编号',
  `business_life` date DEFAULT NULL COMMENT '从业开始年月日，页面显示时计算年限',
  `lastjob` varchar(255) DEFAULT NULL COMMENT '上一份职业',
  `duty` varchar(255) DEFAULT NULL COMMENT '职务',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `certificate_num` varchar(50) DEFAULT NULL COMMENT '资格证号',
  `exhibition_card` varchar(50) DEFAULT NULL COMMENT '展业证号',
  `license_card` varchar(50) DEFAULT NULL COMMENT '执业证号',
  `personal_profile` varchar(2000) DEFAULT NULL COMMENT '个人简介',
  `hx_score` double(10,2) DEFAULT '0.00' COMMENT '和讯总积分',
  `extension_400` varchar(10) DEFAULT '0' COMMENT '400分机号',
  `overdue` datetime DEFAULT NULL COMMENT '开店结束时间',
  `status_400` varchar(1) DEFAULT '0' COMMENT '400电话状态：1开通、0未开通',
  `surplus_400` int(10) DEFAULT '0' COMMENT '400剩余话费，是实时的,单位为分',
  `mdrt` varchar(1) DEFAULT NULL COMMENT '是否MDRT成员：1是\\0否',
  `ljxsbe` varchar(10) DEFAULT '0' COMMENT '累计销售额，单位万元',
  `nxsbe` varchar(10) DEFAULT '0' COMMENT '年销售保额，单位万元',
  `tsjl` varchar(500) DEFAULT NULL COMMENT '投诉记录(前台不用营销员自己填写)',
  `shotmsg_400` varchar(1) DEFAULT '0' COMMENT '短信名片标志 1 开通 0未开通',
  `xbl` double(8,2) DEFAULT '0.00' COMMENT '续保率:单位%',
  `sndkhs` int(11) DEFAULT '0' COMMENT '上年度客户数:单位人',
  `ljkhs` int(11) DEFAULT '0' COMMENT '累计客户数:单位人',
  `recordTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录时间。新增、修改的时间。',
  `qq` varchar(20) DEFAULT NULL COMMENT 'qq号',
  `ida` varchar(20) DEFAULT NULL COMMENT '世界华人保险国际龙奖(IDA)资格:金奖、银奖、铜奖',
  `busylife` int(10) unsigned DEFAULT '0' COMMENT '从业年限',
  `snzjyj` varchar(10) DEFAULT '' COMMENT '上一年度首年直接佣金（FYC）   单位万元',
  `clickrate` int(8) DEFAULT '0' COMMENT '点击率',
  `constellation` varchar(20) DEFAULT NULL COMMENT '星座(直接写文字)',
  `source` varchar(1) DEFAULT '0' COMMENT '营销员来源（0散户、1机构）',
  `service_num` varchar(30) DEFAULT NULL COMMENT '公司业务号',
  `certificate_num_url1` varchar(100) DEFAULT NULL COMMENT '从业资格证图片1（第一页）',
  `certificate_num_url2` varchar(100) DEFAULT NULL COMMENT '从业资格证图片1（第二页）',
  `exhibition_card_url1` varchar(100) DEFAULT NULL COMMENT '保险展业图片1（正面）',
  `exhibition_card_url2` varchar(100) DEFAULT NULL COMMENT '保险展业图片2（背面）',
  `certification_url` varchar(100) DEFAULT NULL COMMENT '认证表格上传照片',
  `hobby` varchar(100) DEFAULT NULL COMMENT '爱好',
  `speciality` varchar(200) DEFAULT NULL COMMENT '擅长领域',
  `id_card_url1` varchar(100) DEFAULT NULL COMMENT '身份证图片1',
  `age_is_publish` varchar(1) DEFAULT NULL COMMENT '年龄是否公开、0不公开、1公开',
  `weixin` varchar(200) DEFAULT NULL COMMENT '微信',
  `weibo` varchar(200) DEFAULT NULL COMMENT '微博',
  `boke` varchar(200) DEFAULT NULL COMMENT '博客',
  `reg_time` datetime DEFAULT NULL COMMENT '注册日期',
  `payment_time` datetime DEFAULT NULL COMMENT '缴费时间',
  `start_time` datetime DEFAULT NULL COMMENT '开店开始时间',
  `over_time` datetime DEFAULT NULL COMMENT '终止时间',
  `certificate_num_time` date DEFAULT NULL COMMENT '从业资格证到期日',
  `exhibition_card_time` date DEFAULT NULL COMMENT '保险展业到期日',
  `partnercode` varchar(50) DEFAULT NULL COMMENT '合作机构代码',
  `awards` varchar(1) DEFAULT NULL COMMENT '1表示获得，0表示没有；曾获公司的全国级荣誉奖项，或和讯放心保认可的其他奖项或

专业资格',
  `servicepack` varchar(50) DEFAULT '' COMMENT '所选服务包,nf10(168套餐),nf30(2000套餐),nf60(9800套餐),nf45(688套餐)',
  `picIfValid` varchar(1) DEFAULT '0' COMMENT '图片分享设置是否隐藏状态，0不隐藏，1为隐藏',
  `weimendian` varchar(1) DEFAULT '0' COMMENT '手机微门户功能:0关闭，1打开',
  `weimendian_name` varchar(100) DEFAULT NULL COMMENT '手机版微门户名称',
  `weimendian_company` varchar(200) DEFAULT NULL COMMENT '微名片公司信息',
  `weimendian_address` varchar(200) DEFAULT NULL COMMENT '微名片公司地址',
  `weimendian_style` varchar(1) DEFAULT '1' COMMENT '微门店样式',
  `weimendian_servicepack` varchar(50) DEFAULT NULL COMMENT '微门店服务包，0免费，1收费',
  `weimendian_start` datetime DEFAULT NULL COMMENT '记录微门店开店日期',
  `weChat_account` varchar(500) DEFAULT NULL COMMENT '收红包微信账号',
  `buscard_style` varchar(1) DEFAULT '1' COMMENT '微名片样式',
  `auth` varchar(1) DEFAULT '1' COMMENT '认证状态:0为非认证,1认证',
  `weimendian_style_big` varchar(10) DEFAULT '1' COMMENT '微门店样式大类，1-代表样式一，2-代表样式二',
  `weChat_img_path` varchar(100) DEFAULT NULL COMMENT '微信二维码图片地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户信息扩展表';

DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` varchar(64) NOT NULL COMMENT '编号',
  `type` char(1) DEFAULT '1' COMMENT '日志类型',
  `title` varchar(255) DEFAULT '' COMMENT '日志标题',
  `create_by` varchar(64) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `remote_addr` varchar(255) DEFAULT NULL COMMENT '操作IP地址',
  `user_agent` varchar(255) DEFAULT NULL COMMENT '用户代理',
  `request_uri` varchar(255) DEFAULT NULL COMMENT '请求URI',
  `method` varchar(5) DEFAULT NULL COMMENT '操作方式',
  `params` text COMMENT '操作提交的数据',
  `exception` text COMMENT '异常信息',
  PRIMARY KEY (`id`),
  KEY `sys_log_create_by` (`create_by`),
  KEY `sys_log_request_uri` (`request_uri`),
  KEY `sys_log_type` (`type`),
  KEY `sys_log_create_date` (`create_date`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='日志表';
