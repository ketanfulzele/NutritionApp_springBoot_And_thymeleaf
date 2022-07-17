package com.ketan.springBoot.Nutrition.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketan.springBoot.Nutrition.Entities.User;
import com.ketan.springBoot.Nutrition.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo ;
	
	
	public List<User> viewUsers(){
		List<User> users =  repo.findAll();
		return users;
	}


	public User saveUser(User user) {
		User userSaved = repo.save(user);
		return userSaved;
	}


	public User searchUserById(int user_id) {
		User user = repo.findById(user_id).get();
		return user;
	}


	public User updateUser(User user) {
		User save = repo.save(user);
		return save;
	}


	public void deleteUserById(int user_id) {
		repo.deleteById(user_id);
	}


	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		List<User> all = repo.findAll();
		return all;
	}


	public List<User> searchByname(String name) {
		System.out.println("inside search by name method in servics");
		List<User> users = repo.findByName(name);
		return users;
	}


	public void deleteUserByEmailId(String email) {
		repo.deleteByEmail(email);
	}
	
	
}