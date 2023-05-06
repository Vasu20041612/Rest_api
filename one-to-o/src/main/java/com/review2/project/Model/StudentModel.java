package com.review2.project.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class StudentModel 
{
	@Id
	private int studentid;
	private String studentname;
	private int studentage;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="")
	private StudentAddress saddress;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	public StudentAddress getSaddress() {
		return saddress;
	}
	public void setSaddress(StudentAddress saddress) {
		this.saddress = saddress;
	}
	

}