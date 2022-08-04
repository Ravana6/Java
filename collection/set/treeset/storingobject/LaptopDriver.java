package com.josh.java.training.collection.set.treeset.storingobject;

import java.util.Set;
import java.util.TreeSet;

public class LaptopDriver {
	public static void main(String[] args) {
		Set<Laptop> cart = new TreeSet<>();

		/*
		 * tree will not work because in tree we can not add object directly if we add
		 * we get exception of run time
		 * 
		 * so we have implement comparable first
		 * 
		 */

		cart.add(new Laptop(8, 120));
		cart.add(new Laptop(4, 120));
		cart.add(new Laptop(12, 120));

		System.out.println("hi");
	}
}
        	