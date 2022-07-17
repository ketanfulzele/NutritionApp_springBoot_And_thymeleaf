package com.ketan.springBoot.Nutrition.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketan.springBoot.Nutrition.Entities.User;
import com.ketan.springBoot.Nutrition.Entities.nutritionPlan;
import com.ketan.springBoot.Nutrition.repo.PlanRepository;

@Service
public class PlanService {

	@Autowired
	PlanRepository repo;

	public List<nutritionPlan> viewPlans() {
		List<nutritionPlan> plans = repo.findAll();
		return plans;
	}


	public nutritionPlan savePlan(nutritionPlan nutritionplan) {
		nutritionPlan planSaved = repo.save(nutritionplan);
		return planSaved;
	}


	public nutritionPlan updatePlan(nutritionPlan nutritionplan) {
		nutritionPlan save = repo.save(nutritionplan);
		return save;
	}

	public List<nutritionPlan> searchByPrice(int price) {
		List<nutritionPlan> plans = repo.findByPrice(price);
		return plans;
	}


	public void deletePlanByName(String name) {
		repo.deleteByName(name);
	}
}
