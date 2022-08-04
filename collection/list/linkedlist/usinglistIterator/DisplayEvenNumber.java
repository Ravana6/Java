package com.josh.java.training.collection.list.linkedlist.usinglistIterator;

import java.util.LinkedList;
import java.util.Scanner;

public class DisplayEvenNumber {

	// method sould return even numbers between m and n

	public static LinkedList<Integer> genEven(int lowerLimit, int upperLimit) {
		LinkedList<Integer> evenNumber = new LinkedList<>();

		for (int i = lowerLimit; i <= upperLimit; i++) {
			if (i % 2 == 0)
				evenNumber.add(i);
		}
		/*
		 * can not use for each loop to intiail the value form Scanner
		 */

		/*
		 * for (int i :evenNumber) { if (i % 2 == 0) evenNumber.add(i);
		 */

		return evenNumber;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter start of even number ");
		int start = s.nextInt();
		System.out.println("Enter end of even number ");
		int end = s.nextInt();
		LinkedList<Integer> result = genEven(start, end);
		System.out.println(result);
	}
}
