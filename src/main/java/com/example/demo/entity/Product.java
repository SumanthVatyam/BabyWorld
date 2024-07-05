package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="prname")
	private String prname;
	@Column(name="prprice")
	private double prprice;
	@Column(name="prdescription")
	private String prdescription;
	@Column(name="primage")
	private String primage;
	@Column(name="pcid")
	private int pcid;
	@Column(name="cgname")
	private String cgname;
	public Product() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String prname, double prprice, String prdescription, String primage, int pcid,
			String cgname) {
		//super();
		this.id = id;
		this.prname = prname;
		this.prprice = prprice;
		this.prdescription = prdescription;
		this.primage = primage;
		this.pcid = pcid;
		this.cgname = cgname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrname() {
		return prname;
	}
	public void setPrname(String prname) {
		this.prname = prname;
	}
	public double getPrprice() {
		return prprice;
	}
	public void setPrprice(double prprice) {
		this.prprice = prprice;
	}
	public String getPrdescription() {
		return prdescription;
	}
	public void setPrdescription(String prdescription) {
		this.prdescription = prdescription;
	}
	public String getPrimage() {
		return primage;
	}
	public void setPrimage(String primage) {
		this.primage = primage;
	}
	public int getPcid() {
		return pcid;
	}
	public void setPcid(int pcid) {
		this.pcid = pcid;
	}
	public String getCgname() {
		return cgname;
	}
	public void setCgname(String cgname) {
		this.cgname = cgname;
	}
	
	

}
