package com.onboarding.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "employee")
public class Employee {
	
	@Id 
	@Column (name = "emp_id")
	private String id;
	@Column (name = "username")
	private String username;
	@Column (name = "fName")
	private String fName;
	@Column (name = "lName")
	private String lName;
	@Column (name = "dob")
	private String dob;
	@Column (name = "email")
	private String email;
	@Column (name = "password")
	private String password;
	
	public Employee() {
		
	}
	
	public Employee(String id, String username, String fName, String lName, String dob, String email, String password) {
		
		this.id = id;
		this.username = username;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.email = email;
		this.password = password;
	}

	public Employee(String username, String fName, String lName, String dob, String email, String password) {
		
		this.username = username;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.email = email;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
