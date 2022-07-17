package com.ketan.springBoot.Nutrition.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	@Id
	@GeneratedValue
	private int id;
	private String payment;
	private float discount;
	private String created_at;
	private String updated_at;
	private int user_id;

	@Override
	public String toString() {
		return "Payment [id=" + id + ", payment=" + payment + ", discount=" + discount + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + ", user_id=" + user_id + ", plan_id=" + plan_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}

	private int plan_id;
}
