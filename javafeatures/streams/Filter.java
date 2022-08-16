package com.josh.java.training.javafeatures.streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 20),
				new Person("lawrence", 40));

		/*
		 * Convert to steam we want "jack" only If 'findAny' then return found If not
		 * found, return null
		 */
		Person result1 = persons.stream().filter(x -> "jack".equals(x.getName())).findAny().orElse(null);

		System.out.println(result1);

		Person result2 = persons.stream().filter(x -> "ahmook".equals(x.getName())).findAny().orElse(null);

		System.out.println(result2);

	}

}
