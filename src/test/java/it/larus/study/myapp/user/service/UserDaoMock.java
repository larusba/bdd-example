package it.larus.study.myapp.user.service;

import it.larus.study.myapp.user.dao.UserDao;
import it.larus.study.myapp.user.domain.User;

public class UserDaoMock implements UserDao {
	
	public void reset()
	{
		
	}
	
	public User read(String username) {
		return null;
	}

}
