package com.nse.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name="Portfolio")
public class Portfolio {
	
	@Id
	private int id;
	private String holdername;
	private double investment;
	@ManyToMany(cascade=CascadeType.ALL,mappedBy = "portfolio")
	private List<Share>shares = new ArrayList<>();
	public int getId() {
		return id;
	}
	
	public List<Share> getShares() {
		return shares;
	}

	public void setShares(List<Share> shares) {
		this.shares = shares;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public double getInvestment() {
		return investment;
	}
	public void setInvestment(double investment) {
		this.investment = investment;
		
	}
	@Override
	public String toString() {
		return "Portfolio [id=" + id + ", holdername=" + holdername + ", investment=" + investment + "]";
	}
	
	

}
