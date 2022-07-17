package com.ketan.springBoot.Nutrition.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ketan.springBoot.Nutrition.Entities.User;
import com.ketan.springBoot.Nutrition.services.UserService;

@Controller
public class UserController {

	public static final String folder = "User/" ;
	@Autowired
	UserService service;

	@RequestMapping("/")
	public String hello() {
		return "HomePage/hello";
	}

	@RequestMapping("/user")
	public String Users() {
		return folder+"User";
	}

	@RequestMapping("/viewUsers")
	public ModelAndView view_Users() {
		ModelAndView mav = new ModelAndView(folder+"viewUsers");
		List<User> users = service.viewUsers();
		System.out.println(users);
		mav.addObject("users", users);
		return mav;
	}
	
	@RequestMapping("/addUserform")
	public String addUser() {
		return folder+"addUserForm";
	}
	@PostMapping(value = "/saveUser")
	public String savefeedback(@ModelAttribute("user") User user) {
		System.out.println("inside SaveUser");
		System.out.println(user);
		service.saveUser(user);
		return "redirect:/addUserform";
		
	}
	
	
	@RequestMapping("/searchPage")
	public String searchUserForm() {
		return folder+"SearchUserForm";
		
	}
	
	@GetMapping("/searchUserByName")
	public ModelAndView searchUser(@RequestParam(name="name") String name ) {
		ModelAndView model = new ModelAndView(folder+"SearchUserFormResult");
		List<User> users = service.searchByname(name);
		users.forEach((u)->System.out.println(u));
		model.addObject("users" ,users);
		return model;	
	}
	
	@GetMapping("/deleteUserByEmailIdform")
	public ModelAndView deleteUserForm() {
		ModelAndView model = new ModelAndView(folder+"deleteUserByEmailIdform");
		List<User> users = service.findAllUsers();
//		users.forEach((u)->System.out.println(u));
		model.addObject("users" ,users);
		return model;	
	}
	
//	@DeleteMapping("/deleteUserByEmailId")
	@RequestMapping(value = "/deleteUserByEmailId" , method = RequestMethod.POST)
	@Transactional
	public String deleteUser(@RequestParam(name="email") String email) {
		service.deleteUserByEmailId(email);
		return "redirect:/deleteUserByEmailIdform";	
	}
	
	@GetMapping("/updateUserForm")
	public ModelAndView updateUserForm() {
		ModelAndView model = new ModelAndView(folder+"updateUserForm");
		List<User> users = service.findAllUsers();
//		users.forEach((u)->System.out.println(u));
		model.addObject("users" ,users);
		return model;	
	}
	
//	/UpdateUser
	@RequestMapping(value = "/UpdateUser" , method = RequestMethod.POST)
	@Transactional
	public String deleteUser(@ModelAttribute("user") User user) {
		service.updateUser(user);
		return "redirect:/updateUserForm";	
	}
	
	
}
