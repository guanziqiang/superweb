package guanziqiang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guanziqiang.dao.mybatis.UserDAO;
import guanziqiang.entities.UserDO;
import guanziqiang.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public int insert(UserDO userDO) {
		//TODO service层相关教研代码
		return userDAO.insert(userDO);
	}

}
