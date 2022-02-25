package com.nse.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name="Share")
public class Share {
	
	@Id 	
	private int id;
	private String company;
	private int quantity;
	private double price;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Portfolio>portfolio = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Portfolio> getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(List<Portfolio> portfolio) {
		this.portfolio = portfolio;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Share [id=" + id + ", company=" + company + ", quantity=" + quantity + ", price=" + price + "]";
	}
	

}
