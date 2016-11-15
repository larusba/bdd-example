package it.larus.study.myapp.user.service;

import it.larus.study.myapp.user.domain.User;
import it.larus.study.myapp.user.representation.UserLoginOuput;

/**
 * Manages user profile and access
 * @author omar
 *
 */
public interface UserService {

	/**
	 * User login if can
	 * @param user
	 * @param password
	 * @return
	 */
	public UserLoginOuput get(User user, String password);
}
