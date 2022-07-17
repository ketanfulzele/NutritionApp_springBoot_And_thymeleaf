package com.ketan.springBoot.Nutrition.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketan.springBoot.Nutrition.Entities.nutritionPlan;

public interface PlanRepository extends JpaRepository<nutritionPlan, Integer> {

	List<nutritionPlan> findByPrice(int price);


	void deleteByName(String name);

}
