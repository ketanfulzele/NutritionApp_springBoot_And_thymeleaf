package com.ketan.springBoot.Nutrition.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue
	public int user_id;
	
	private String name ;
	private int contact ;
	private String gender ;
	private String dob ;
	private String email ;
	private String role ;
	private float weight;
	private float height ;
	private String diatery_orientation;
	private int intensity;
	private String goal ;
	private String work_out_time;
	private String wake_up_time;
	private String sleep_time;
	private String medical_condition;
	private String allergic_to;
	private String login_name;
	private String password;
	
	
	public int getUserId() {
		return user_id;
	}
	public void setUserId(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public String isDiatery_orientation() {
		return diatery_orientation;
	}
	public void setDiatery_orientation(String diatery_orientation) {
		this.diatery_orientation = diatery_orientation;
	}
	public int getIntensity() {
		return intensity;
	}
	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getWork_out_time() {
		return work_out_time;
	}
	public void setWork_out_time(String work_out_time) {
		this.work_out_time = work_out_time;
	}
	public String getWake_up_time() {
		return wake_up_time;
	}
	public void setWake_up_time(String wake_up_time) {
		this.wake_up_time = wake_up_time;
	}
	public String getSleep_time() {
		return sleep_time;
	}
	public void setSleep_time(String sleep_time) {
		this.sleep_time = sleep_time;
	}
	public String getMedical_condition() {
		return medical_condition;
	}
	public void setMedical_condition(String medical_condition) {
		this.medical_condition = medical_condition;
	}
	public String getAllergic_to() {
		return allergic_to;
	}
	public void setAllergic_to(String allergic_to) {
		this.allergic_to = allergic_to;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + user_id + ", name=" + name + ", contact=" + contact + ", gender=" + gender + ", dob="
				+ dob + ", email=" + email + ", role=" + role + ", weight=" + weight + ", height=" + height
				+ ", diatery_orientation=" + diatery_orientation + ", intensity=" + intensity + ", goal=" + goal
				+ ", work_out_time=" + work_out_time + ", wake_up_time=" + wake_up_time + ", sleep_time=" + sleep_time
				+ ", medical_condition=" + medical_condition + ", allergic_to=" + allergic_to + ", login_name="
				+ login_name + ", password=" + password + "]";
	}
	
	
	
}
