package com.bean.alias.service.model;

import java.util.List;

public class AmazonOrder {
	
	private List<String> products;
	private int zipCode;
	private String address;
	
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AmazonOrder [products=" + products + ", zipCode=" + zipCode + ", address=" + address + "]";
	}
	
	
	
	
	

}
