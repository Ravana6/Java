package com.josh.java.training.collection.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public class HashmapConcept {

	public static void main(String[] args) {

		HashMap<Integer, String> menu1 = new HashMap<>();

		menu1.put(1501, "Idli");
		menu1.put(2001, "Dosa");
		menu1.put(37, "Vada");

		System.out.println("menu1 : " + menu1);

		// collection of values

		/*
		 * we can use List to store the values and key separately in different List
		 */
		ArrayList<String> menuList = new ArrayList<>(menu1.values());
		System.out.println("dish values = " + menuList);

		for (String dish : menuList) {
			System.out.println("dish accessing values using for each = " + dish);
		}

		System.out.println("---------------------------");

		LinkedList<Integer> menuListNumber = new LinkedList<>(menu1.keySet());
		System.out.println("dish Numbers = " + menuListNumber);

		for (int dishNumber : menuListNumber) {
			System.out.println("dish number accessing key  using for each = " + dishNumber);
		}

		// to extract all the keys
		System.out.println("===================================");
		HashSet<Integer> hs1 = new HashSet<>(menu1.keySet());
		System.out.println(hs1);

		for (Integer key : hs1) {
			System.out.println(key);
		}

		System.out.println("======================================");
		// set of key-value pairs

		System.out.println("using Hashset");
		HashSet<Entry<Integer, String>> hs2 = new HashSet<>(menu1.entrySet());
		System.out.println(menu1.entrySet());
		System.out.println(hs2);
		for (Object o : hs2) {
			System.out.println(o);
		}
		System.out.println("\nusing LinkedList");
		LinkedList<Entry<Integer, String>> hs3 = new LinkedList<>(menu1.entrySet());
		System.out.println(menu1.entrySet());
		System.out.println(hs3);
		for (Object o : hs3) {
			System.out.println(o);
		}
	}
}
