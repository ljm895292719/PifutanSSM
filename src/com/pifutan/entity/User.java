package com.pifutan.entity;

import java.util.Date;

public class User{
//	CREATE TABLE `user` (
//			  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
//			  `name` varchar(32) NOT NULL DEFAULT '',
//			  `password` varchar(32) NOT NULL DEFAULT '',
//			  `description` varchar(128) NOT NULL DEFAULT '',
//			  `createDate` datetime,
//			  PRIMARY KEY (`id`)
//			) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;
	private String id;
	private String name;
	private String password;
	private String description;
	private Date createDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public static User getTestInstance() {
		User user = new User();
		user.setId("1");
		user.setName("pifutan");
		user.setPassword("******");
		user.setDescription("pifutan");
		user.setCreateDate(new Date());
		return user;
	}
}
