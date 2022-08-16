package com.josh.java.training.javafeatures.parallelsort;

import java.util.Arrays;

public class NumberSorting {
	public static void main(String[] args) {
		int numbers[] = { 654,56,655,54,79,21,0,123,36,65,6,3,-1,-2,1};
		// Parallel Sort method for sorting int array
		Arrays.parallelSort(numbers);
		// converting the array to stream and displaying using forEach
		Arrays.stream(numbers).forEach(n -> System.out.print(n + ", "));
	}
}