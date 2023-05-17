package com.learning.Mapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_addr")
public class Address {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int addr_id;
	   
	   @Column(name="user_city")
       private String city;
	   
	   @Column(name="user_state")
       private String state;
       
	   @OneToOne(fetch = FetchType.LAZY,cascade =CascadeType.ALL,mappedBy="address")
	   private User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public int getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addr_id=" + addr_id + ", city=" + city + ", state=" + state + "]";
	}
	   
	   
}
