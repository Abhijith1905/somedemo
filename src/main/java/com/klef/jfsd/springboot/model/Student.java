package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student
{
	@Id
	@Column(name = "sid")
	private int id;
	@Column(name = "sname",length = 30,nullable = false)
	private String name;
	@Column(name = "sgender",length = 30,nullable = false)
	private String gender;
	@Column(name = "sdept",length=10,nullable = false)
	private String department;
	@Column(name = "scgpa",nullable = false)
	private float cgpa;
	@Column(name = "semail",nullable = false,unique = true)
	private String email;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department + ", cgpa="
				+ cgpa + ", email="+ email + "]";
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
