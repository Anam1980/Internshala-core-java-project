package com.internshala.javaapp;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// List of Today's Special Cake
		Cake brownieCake = new Cake();
		brownieCake.setName("Chocolate Brownie");
		brownieCake.setPrice(250);

		Cake mapleCake = new Cake();
		mapleCake.setName("Chocolate Maple");
		mapleCake.setPrice(300);

		List<Cake> cakeList = new ArrayList<>();
		cakeList.add(brownieCake);
		cakeList.add(mapleCake);

		// List of Today's Special Pastries
		Pastry blackForestPastry = new Pastry();
		blackForestPastry.setName("Black Forest");
		blackForestPastry.setPrice(35);

		Pastry chocoTrufflePastry = new Pastry();
		chocoTrufflePastry.setName("Choco Truffle");
		chocoTrufflePastry.setPrice(40);

		List<Pastry> pastryList = new ArrayList<>();
		pastryList.add(blackForestPastry);
		pastryList.add(chocoTrufflePastry);

		System.out.println("         Today's Special Menu");
		System.out.println("-----------------------------------------");

		System.out.println();
		System.out.println("  Special Cakes");
		System.out.println("  -------------------------------");

		for (Cake cake: cakeList) {
			cake.display();
		}

		System.out.println();
		System.out.println("  Special Pastries");
		System.out.println("  -------------------------------");

		for (Pastry pastry: pastryList) {
			pastry.display();
		}
	}
}
