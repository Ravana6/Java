package com.josh.java.training.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class BookDriver {
	public static void main(String[] args) {

		Set<Book> s1 = new HashSet<>();

		s1.add(new Book(1, "java", 100));
		s1.add(new Book(2, "python", 100));

		// duplicate will not add
		s1.add(new Book(1, "java", 100));

		System.out.println("number of books present : " + s1.size());

		for (Book b : s1) {
			System.out.println(b);
		}

	}
}
