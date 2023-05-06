package com.review2.project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class StudentAddress 
{
	@Id
	private int doornumber;
	private String street;
	private String city;
	private String state;
	public int getDoornumber() {
		return doornumber;
	}
	public void setDoornumber(int doornumber) {
		this.doornumber = doornumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
		this.state=state;
	}
	

}