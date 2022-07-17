package com.ketan.springBoot.Nutrition.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ketan.springBoot.Nutrition.Entities.User;
import com.ketan.springBoot.Nutrition.Entities.nutritionPlan;
import com.ketan.springBoot.Nutrition.repo.UserRepository;
import com.ketan.springBoot.Nutrition.services.PlanService;

@Controller
public class NutritionPlanController {

	public static final String folder = "Plan/";
	public static final String value = null;
	public static final String Exception = "Exception/";

	@Autowired
	PlanService service;

	@Autowired
	UserRepository userRepo;

	@RequestMapping("/NutritionPlans")
	public String NutritionPlans() {
		return folder + "NutritionPlan";
	}

	@RequestMapping("/viewPlans")
	public ModelAndView view_plans() {
		ModelAndView mav = new ModelAndView(folder + "viewPlans");
		List<nutritionPlan> plans = service.viewPlans();
		System.out.println(plans);
		mav.addObject("plans", plans);
		return mav;
	}

	@RequestMapping("/addPlanForm")
	public String addPlanForm() {
		return folder + "addPlanForm";
	}

	@PostMapping(value = "/savePlan")
	public String savePlan(@ModelAttribute("plan") nutritionPlan plan, Model model) {
		System.out.println("inside SavePlan");

		Optional<User> user = userRepo.findById(plan.getUser_id());
		if (user.isPresent()) {
			System.out.println(plan);
			service.savePlan(plan);
			return "redirect:/addPlanForm";
		}
		model.addAttribute("key", "User_Id");
		return Exception + "foreignKeyMissmatchException";

	}

	@RequestMapping("/searchPlanPage")
	public String searchPlanForm() {
		return folder + "SearchPlanForm";

	}

//	
	@GetMapping("/searchPlanByPrice")
	public ModelAndView searchPlan(@RequestParam(name = "price") int price) {
		ModelAndView model = new ModelAndView(folder + "SearchPlanFormResult");
		List<nutritionPlan> nutritionPlans = service.searchByPrice(price);
		nutritionPlans.forEach((u) -> System.out.println(u));
		model.addObject("nutritionPlans", nutritionPlans);
		return model;
	}

//	
	@GetMapping("/deletePlanByNameform")
	public ModelAndView deleteUserForm() {
		ModelAndView model = new ModelAndView(folder + "deletePlanByNameform");
		List<nutritionPlan> plans = service.viewPlans();
//		users.forEach((u)->System.out.println(u));
		model.addObject("plans", plans);
		return model;
	}

//	@DeleteMapping("/deleteUserByEmailId")
	@RequestMapping(value = "/deletePlanByName", method = RequestMethod.POST)
	@Transactional
	public String deletePlan(@RequestParam(name = "name") String name) {
		service.deletePlanByName(name);
		return "redirect:/deletePlanByNameform";
	}

	@GetMapping("/updatePlanForm")
	public ModelAndView updateUserForm() {
		ModelAndView model = new ModelAndView(folder + "updatePlanForm");
		List<nutritionPlan> plans = service.viewPlans();
//		users.forEach((u)->System.out.println(u));
		model.addObject("plans", plans);
		return model;
	}

//	
//	/UpdatePlan
	@RequestMapping(value = "/UpdatePlan", method = RequestMethod.POST)
	@Transactional
	public String updatePlan(@ModelAttribute("plan") nutritionPlan plan, Model model) {

		
		Optional<User> user = userRepo.findById(plan.getUser_id());
		if (user.isPresent()) {
			service.updatePlan(plan);
			return "redirect:/updatePlanForm";
		}
		model.addAttribute("key", "User_Id");
		return Exception + "foreignKeyMissmatchException";

	}
//	
}
