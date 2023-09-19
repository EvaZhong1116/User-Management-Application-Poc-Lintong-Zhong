 package com.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.SecurityUser;
import com.demo.service.UserService;

@RestController
public class SecurityUserController {

	@Autowired
	JdbcUserDetailsManager jdbcUserDetailsManager;
	
	@Autowired
	UserService	userService;

	@RequestMapping(value = "/customizelogin", method = RequestMethod.GET) public ModelAndView login(Model model, String error, String
			logout) {
			if (error != null)
			            model.addAttribute("errorMsg", "Your username and password are invalid.");
			if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully."); 
			return new ModelAndView("login");
			}
	
	@RequestMapping(value = "/customizelogin", method = RequestMethod.POST) public ModelAndView loginpost(Model model, String error, String
			logout) {
			if (error != null)
			            model.addAttribute("errorMsg", "Your username and password are invalid.");
			if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully."); 
			return new ModelAndView("welcome");
			}
	

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView("registeration", "user", new SecurityUser());
	}
	
    // authorities to be granted
//	List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//	
//	authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//	User user = new User(securityUser.getUsername(), securityUser.getPassword(), authorities);
//    jdbcUserDetailsManager.createUser(user);

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView processRegister(@ModelAttribute("user") SecurityUser securityUser) {

		userService.addNewUser(securityUser);
		
        return new ModelAndView("redirect:/welcome");
	}
	
	
	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public List<SecurityUser> getAllUser() {
		
		return userService.getAllusers();
	}
	
	@RequestMapping(value = "/getUserById/{id}", method = RequestMethod.GET)
	public SecurityUser getUserById(@PathVariable(value="id") final int id) {
		
		return userService.getUserById(id);
	}

	
	@DeleteMapping("/deleteUserById/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable("id") int id){
		userService.deleteUserById(id);
        return ResponseEntity.ok("User deleted successfully!.");
    }
	
	 @PutMapping("/updateUser/{id}")
	 public SecurityUser updateUser(@PathVariable int id,@RequestBody SecurityUser updatedUser) {
		 
		 userService.updateUser(id, updatedUser);
		 return userService.getUserById(id);
	     
	 }
	
}
