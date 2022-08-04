package com.josh.java.training.collection.list.arraylist.usingiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args) {

		ArrayList<Integer> removeVariable = new ArrayList();
		removeVariable.add(10);
		removeVariable.add(20);
		removeVariable.add(30);
		System.out.println(removeVariable);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element to be removed ");
		int key = s.nextInt();

		Iterator<Integer> i = removeVariable.iterator();

		while (i.hasNext()) {
			int ele = (Integer) i.next();
			if (ele == key) {
				removeVariable.remove((Integer) ele);
				System.out.println("removed successfully");
			}
		}
		System.out.println(removeVariable);
	}
}
