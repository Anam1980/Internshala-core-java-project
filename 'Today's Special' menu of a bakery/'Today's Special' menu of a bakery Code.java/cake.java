package com.internshala.javaapp;

public class Cake {

	String name;
	float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void display() {
		System.out.println("  " + name + " : " + '\u20B9' + " " + price + " per pound");
	}
}
