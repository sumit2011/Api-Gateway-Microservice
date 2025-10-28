package com.n4ksum.user.service.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "micro_user")
public class User {
	@Id
	@Column(name = "USERID")
	private String userId;
	
	@Column(name = "NAME",length = 20)
	private String name;
	@Column
	private String email;
	@Column
	private String phoneNo;
	@Column
	private String address;
	
	// no need to store in database we will get ratings from the another microservice
	@Transient
	private List<Rating> ratings = new ArrayList<>();
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", address="
				+ address + "]";
	}
	
	
	

}
