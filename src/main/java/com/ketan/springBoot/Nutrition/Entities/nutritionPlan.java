package com.ketan.springBoot.Nutrition.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nutrition_plan")
public class nutritionPlan {
	
	@Id
	@GeneratedValue
	private int id ;
	private String name ;
	private String created_at;
	private String updated_at;
	private int price ;
	private  int user_id;
	
	
	@Override
	public String toString() {
		return "NutritionPlan [id=" + id + ", name=" + name + ", created_at=" + created_at + ", updated_at="
				+ updated_at + ", price=" + price + ", user_id=" + user_id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

}
