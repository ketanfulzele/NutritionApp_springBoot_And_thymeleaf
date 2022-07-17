package com.ketan.springBoot.Nutrition.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ketan.springBoot.Nutrition.Entities.User;
import com.ketan.springBoot.Nutrition.services.UserService;

@RestController
public class UserControllerRest {
	
	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/users/", method = RequestMethod.GET)
	public List<User> getUsers() {
		return service.findAllUsers();
	}

	@PostMapping("/addUser/")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	// what ever parameters which was comming on that id that will pas to that
	// method by using the pathvariable
	@GetMapping("/user/{user_id}")
	@Transactional(readOnly = true) // why read only because we are fetching the data only
	public User searchUser(@PathVariable("user_id") int user_id) {
		return service.searchUserById(user_id);
	}

	@RequestMapping(value = "/users/", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}

	@RequestMapping(value = "/user/{user_id}", method = RequestMethod.DELETE)
	@CacheEvict("Product-cache") // when record is deleted then object in cache also should be deleted
									// automatically
	public void deleteUser(@PathVariable("user_id") int user_id) {
		service.deleteUserById(user_id);
	}
}
