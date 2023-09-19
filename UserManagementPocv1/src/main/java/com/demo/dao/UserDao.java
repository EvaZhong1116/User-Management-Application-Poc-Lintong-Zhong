package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.SecurityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface UserDao {
	
	void deleteUserById(int id);

	
	List<SecurityUser> getAllusers();
	SecurityUser getUserById(int id);
	void addNewUser(SecurityUser securityUser);
	
}
