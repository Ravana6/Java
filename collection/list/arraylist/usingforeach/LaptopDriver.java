package com.josh.java.training.collection.list.arraylist.usingforeach;

import java.util.ArrayList;
import java.util.Scanner;

public class LaptopDriver {
	public static void main(String[] args) {

		ArrayList<Laptop> laptopShop = new ArrayList<Laptop>();
		laptopShop.add(new Laptop(4, 500));
		laptopShop.add(new Laptop(8, 500));
		laptopShop.add(new Laptop(12, 500));
		laptopShop.add(new Laptop(8, 1024));

		/*
		 * ask the user to enter the ram size and count the number of laptops present
		 * with the entered ram size using for each loop
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the ram_size : ");
		int ram = s.nextInt();
		int count = 0;
		for (Object l : laptopShop) {
			Laptop temp = (Laptop) l;
			if (temp.ram == ram)
				count++;
		}
		if (count != 0) {
			System.out.println("There are " + count + " laptops available");
		} else
			System.out.println("No laptops available for given ram");
	}
}
