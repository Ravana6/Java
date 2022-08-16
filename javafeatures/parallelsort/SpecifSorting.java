package com.josh.java.training.javafeatures.parallelsort;

import java.util.Arrays;

public class SpecifSorting {
	public static void main(String[] args) {
		int numbers[] = { 22, 89, 1, 3, 10, 0, 5 };
		/*
		 * Specifying the start and end index. The start index is 1 here and the end
		 * index is 5. which means the the elements starting from index 1 till index 5
		 * would be sorted.
		 */
		System.out.println("Before Sorting= " + Arrays.toString(numbers));
		Arrays.parallelSort(numbers, 1, 5);

		System.out.println("\nAfter specify  Sorting = " + Arrays.toString(numbers));
	}
}
