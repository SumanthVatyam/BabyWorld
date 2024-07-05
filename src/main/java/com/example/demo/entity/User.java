package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="uid")
	private int uid;
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="utype")
	private String utype;
	public User() 
	{
		
		
	}
	public User(int uid, String fname, String lname, String email, String password, String utype)
	{
		
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.utype = utype;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	
	

}
