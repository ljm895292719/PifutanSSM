package com.pifutan.dao;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.pifutan.entity.User;
import com.pifutan.ientity.IUser;


@Scope("prototype")
public class UserDao extends BaseDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public boolean insertUser(User user) {
		sqlSessionTemplate.insert("com.pifutan.ientity.UserInterface.insertUser", user);
		return true;
	}

	public List<User> getAllUser() {
		return sqlSessionTemplate.selectList("com.pifutan.ientity.UserInterface.getAllUser");
	}

	public User getUserById(String id) {
		return getSqlSession().getMapper(IUser.class).getUserById(id);
//		return getSqlSession().selectOne("com.pifutan.ientity.UserInterface.getUserById", id);
	}
	public List<User> getUserByName(String name) {
		return sqlSessionTemplate.selectList("com.pifutan.ientity.UserInterface.getUserByName", name);
	}

	public boolean deleteUserById(String id) {
		getSqlSession().delete("com.pifutan.ientity.UserInterface.deleteUserById", id);
		return true;
	}

}
