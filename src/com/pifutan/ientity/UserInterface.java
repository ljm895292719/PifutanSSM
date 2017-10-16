package com.pifutan.ientity;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.pifutan.entity.User;

public interface UserInterface {

	@Select("select * from user where id=#{id}")
    public User getUserById(String id);
	
	@Select("select * from user")
    public List<User> getAllUser();
	
	@Insert("insert into user(id, name, password, description, createDate) values(#{user.id}, #{user.name}, #{user.password}, #{user.description}, #{user.createDate})")
    public boolean insertUser(User user);
	
	@Select("select * from user where name=#{name}")
    public List<User> getUserByName(String name);
	
	@Select("delete from user where id=#{id}")
	public boolean deleteUserById(String id);

}
