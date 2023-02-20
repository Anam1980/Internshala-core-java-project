package com.internshala.javaapp;

public class Pastry extends Cake {

	@Override
	public void display() {
		System.out.println("  " + name + " : " + '\u20B9' + " " + price + " per piece");
	}
}
