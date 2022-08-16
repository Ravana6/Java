package com.josh.java.training.javafeatures.methodreferences.staticmethod;

import java.util.function.BiFunction;

public class MethodReferenceUsingOwnClass {

	public static void main(String[] args) {

		// anonymous class
		String result1 = playTwoArgument(1, 2, new BiFunction<Integer, Integer, String>() {
			@Override
			public String apply(Integer a, Integer b) {
				return IntegerUtils.join(a, b);
			}
		}); // 3
		System.out.println("Result1 = " + result1);
		// lambda
		String result2 = playTwoArgument(1, 2, (a, b) -> IntegerUtils.join(a, b)); // 3
		System.out.println("Result2 = " + result2);

		// method reference
		String result3 = playTwoArgument(1, 2, IntegerUtils::join); // 3

		System.out.println("Result3 = " + result3);

	}

	private static <R> R playTwoArgument(Integer i1, Integer i2, BiFunction<Integer, Integer, R> func) {
		return func.apply(i1, i2);
	}

}
