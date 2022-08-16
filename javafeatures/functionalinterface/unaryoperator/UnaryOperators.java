package com.josh.java.training.javafeatures.functionalinterface.unaryoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperators {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> result = math(list, x -> x * 2);

		System.out.println("input : " + list);
		System.out.println("output" + result); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

	}

	public static <T> List<T> math(List<T> list, UnaryOperator<T> uo) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			result.add(uo.apply(t));
		}
		return result;
	}

}