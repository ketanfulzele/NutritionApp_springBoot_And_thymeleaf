package com.ketan.springBoot.Nutrition.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weightLog")
public class weightLog {

	@Id
	@GeneratedValue
	private int id;
	private int user_id;
	private float weightLog;
	private String created_at;
	private String updated_at;

	@Override
	public String toString() {
		return "weightLog [id=" + id + ", user_id=" + user_id + ", weightLog=" + weightLog + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
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

	public float getWeightLog() {
		return weightLog;
	}

	public void setWeightLog(float weightLog) {
		this.weightLog = weightLog;
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
}
