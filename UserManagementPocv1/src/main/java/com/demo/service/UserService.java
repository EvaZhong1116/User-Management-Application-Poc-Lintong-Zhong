package com.demo.service;

import java.util.List;


import com.demo.model.SecurityUser;

public interface UserService {

	
	List<SecurityUser> getAllusers();
	SecurityUser getUserById(int id);
	void deleteUserById(int id);
	void addNewUser(SecurityUser securityUser);
	SecurityUser updateUser(int userId, SecurityUser updatedUser); 
}
