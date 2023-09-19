package com.demo.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDao;
import com.demo.dao.UserRepository;
import com.demo.model.Employee;
import com.demo.model.SecurityUser;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	UserRepository userRepository;
	
	public void deleteUserById(int id) {
		userDao.deleteUserById(id);
	}
	
	public List<SecurityUser> getAllusers() {
		return userDao.getAllusers();
	}

	@Override
	public SecurityUser getUserById(int id) {
		SecurityUser securityUser = userDao.getUserById(id);
		return securityUser;
	}
	
	//void addNewUser(SecurityUser securityUser);
	public void addNewUser(SecurityUser securityUser) {
		userDao.addNewUser(securityUser);
	}
	
	public SecurityUser updateUser(int id, SecurityUser updatedUser) {
		
		SecurityUser existingUser = userDao.getUserById(id);
		
		if (existingUser != null) {
            
            // Update user data with the new values
			existingUser.setId(updatedUser.getId());
			existingUser.setUsername(updatedUser.getUsername());
			existingUser.setPassword(updatedUser.getPassword());
			existingUser.setEmail(updatedUser.getEmail());
            
            // Add more fields as needed

            // Save the updated user to the database
            return userRepository.save(existingUser);
        } else {
            // User not found
            return null;
        }
    }
	
}
