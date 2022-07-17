package com.ketan.springBoot.Nutrition.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ketan.springBoot.Nutrition.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByName(String name);

	void deleteByEmail(String email);

}
