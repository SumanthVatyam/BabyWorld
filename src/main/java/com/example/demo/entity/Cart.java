package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prid")
	private int prid;
	@Column(name="prname")
	private String prname;
	@Column(name="primage")
	private String primage;
	@Column(name="prprice")
	private double prprice;
	public Cart() 
	{
		
		
	}
	public Cart(int prid, String prname, String primage, double prprice)
	{
	
		this.prid = prid;
		this.prname = prname;
		this.primage = primage;
		this.prprice = prprice;
	}
	public int getPrid() {
		return prid;
	}
	public void setPrid(int prid) {
		this.prid = prid;
	}
	public String getPrname() {
		return prname;
	}
	public void setPrname(String prname) {
		this.prname = prname;
	}
	public String getPrimage() {
		return primage;
	}
	public void setPrimage(String primage) {
		this.primage = primage;
	}
	public double getPrprice() {
		return prprice;
	}
	public void setPrprice(double prprice) {
		this.prprice = prprice;
	}
	
	

}
