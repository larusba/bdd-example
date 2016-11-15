package it.larus.study.myapp.user.service.impl;

import it.larus.study.myapp.user.dao.UserDao;
import it.larus.study.myapp.user.domain.User;
import it.larus.study.myapp.user.representation.HypermediaLink;
import it.larus.study.myapp.user.representation.UserLoginOuput;
import it.larus.study.myapp.user.service.UserService;

public class UserServiceDefault implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserLoginOuput get(User user, String password) throws IllegalArgumentException {
		User realUser = this.userDao.read(user.getUsername());
		UserLoginOuput out = new UserLoginOuput();
		if(realUser == null)
		{
			out.setLanguage(user.getLanguage());	
			if(user.getFacebookAccount() != null)
			{
				out.setFacebookRegistration(new HypermediaLink("registrationWithFacebook","/user/facebook","POST"));				
			}
//			out.setRegistration(new HypermediaLink("registration", "/user", "POST"));
		}
		
		return out;
	}


}
