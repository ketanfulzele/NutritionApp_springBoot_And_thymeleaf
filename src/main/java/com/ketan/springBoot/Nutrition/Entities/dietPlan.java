package com.ketan.springBoot.Nutrition.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dietPlan")
public class dietPlan {
	@Id
	@GeneratedValue
	private int id ;
	private int user_id ;
	private String slots ;
	private String food_type;
	private String  protein_ratio ;
	private String carbos_ratio;
	private String total;
	
	
	
	@Override
	public String toString() {
		return "dietPlan [id=" + id + ", user_id=" + user_id + ", slots=" + slots + ", food_type=" + food_type
				+ ", protein_ratio=" + protein_ratio + ", carbos_ratio=" + carbos_ratio + ", total=" + total + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getSlots() {
		return slots;
	}
	public void setSlots(String slots) {
		this.slots = slots;
	}
	public String getFood_type() {
		return food_type;
	}
	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}
	public String getProtein_ratio() {
		return protein_ratio;
	}
	public void setProtein_ratio(String protein_ratio) {
		this.protein_ratio = protein_ratio;
	}
	public String getCarbos_ratio() {
		return carbos_ratio;
	}
	public void setCarbos_ratio(String carbos_ratio) {
		this.carbos_ratio = carbos_ratio;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
}
