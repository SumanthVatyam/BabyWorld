package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Category 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="cgname")
	private String cgname;
	public Category() {
		
	}
	public Category(int id, String cgname) {
		
		this.id = id;
		this.cgname = cgname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCgname() {
		return cgname;
	}
	public void setCgname(String cgname) {
		this.cgname = cgname;
	}
	
	
	

}
