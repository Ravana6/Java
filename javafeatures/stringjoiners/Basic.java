package com.josh.java.training.javafeatures.stringjoiners;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Basic {
	public static void main(String[] args) {

		StringJoiner stringJoiner1 = new StringJoiner(",");
		stringJoiner1.add("aaa");
		stringJoiner1.add("bbb");
		stringJoiner1.add("ccc");
		String result1 = stringJoiner1.toString();
		System.out.println("stringJoiner1");
		System.out.println(stringJoiner1);
		System.out.println("using tostring() = " + result1);

		StringJoiner stringJoiner2 = new StringJoiner("/", "prefix-", "-suffix");
		stringJoiner2.add("2016");
		stringJoiner2.add("02");
		stringJoiner2.add("26");
		String result2 = stringJoiner2.toString();
		System.out.println("\nstringJoiner2");
		System.out.println(stringJoiner2);
		System.out.println("using tostring() = " + result2);

		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		System.out.println("\nThis one is in the from of array =  " + list);

		String result3 = String.join(", ", list);
		System.out.println("\nThis one is in the from of string = " + result3);

		String result4 = list.stream().map(x -> x).collect(Collectors.joining(" | "));
		System.out.println("\nusing streams = " + result4);
	}
}
