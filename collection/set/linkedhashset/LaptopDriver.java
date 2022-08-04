package com.josh.java.training.collection.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LaptopDriver {
	public static void main(String[] args) {

		Set<Laptop> cart = new LinkedHashSet<Laptop>();
		cart.add(new Laptop(4, 512));
		cart.add(new Laptop(4, 240));
		cart.add(new Laptop(4, 120));
		cart.add(new Laptop(5, 120));

		/*
		 * we cannot add other than Laptop object cart.add("karthik");
		 */
		System.out.println(cart);
	}

}
