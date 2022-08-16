package com.josh.java.training.javafeatures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 20),
				new Person("lawrence", 40));
		String findName="jack";
      //convert stream to String
		String name = persons.stream().filter(x -> findName.equals(x.getName())).map(Person::getName).findAny()
				.orElse(findName+" is not there");

		System.out.println("name : " + name);

		System.out.println("============================");
		List<String> collect = persons.stream().map(Person::getName).collect(Collectors.toList());

		collect.forEach(System.out::println);

	}

}