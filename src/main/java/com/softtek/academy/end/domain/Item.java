package com.softtek.academy.end.domain;

public class Item {

	private int id;
	private String description;
	private double price;
	private int stock;
	
	public Item(int id, String description, double price, int stock) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
