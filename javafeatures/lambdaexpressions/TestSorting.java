package com.josh.java.training.javafeatures.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();
		
		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		System.out.println("After Sort");
		
		//lambda here!
		listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
	
		//java 8 only, lambda also, to print the List
		listDevs.forEach((developer)->System.out.println(developer));
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("karthik",10000,33));
		result.add(new Developer("shiva", 80000, 20));
		result.add(new Developer("suresh", 900000,10));
		result.add(new Developer("karthi", 600000, 55));
		
		return result;
	}
	}