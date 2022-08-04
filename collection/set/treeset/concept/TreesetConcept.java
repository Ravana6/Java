package com.josh.java.training.collection.set.treeset.concept;

//LinkedHashSet
import java.util.TreeSet;

public class TreesetConcept {

	public static void main(String args[]) {
		// TreeSet of String Type
		TreeSet<String> tset = new TreeSet<String>();

		// Adding elements to TreeSet<String>
		tset.add("karthik");
		tset.add("ravana");
		tset.add("rama");
		tset.add("sita");
		tset.add("bro");
		tset.add("Jack");
		tset.add("ravana");

		// Displaying TreeSet
		System.out.println(tset);

		// TreeSet of Integer Type
		TreeSet<Integer> tset2 = new TreeSet<Integer>();

		// Adding elements to TreeSet<Integer>
		tset2.add(88);
		tset2.add(7);
		tset2.add(101);
		tset2.add(0);
		tset2.add(3);
		tset2.add(222);
		System.out.println(tset2);
	}
}
