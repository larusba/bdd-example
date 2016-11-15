package it.larus.study.myapp.user.dao;

import it.larus.study.myapp.user.domain.User;

public interface UserDao {

	public User read(String username);
}
