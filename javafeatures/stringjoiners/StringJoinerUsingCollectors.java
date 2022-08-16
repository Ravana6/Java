package com.josh.java.training.javafeatures.stringjoiners;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StringJoinerUsingCollectors {
	public static void main(String[] args) {
		List<Game> list = Arrays.asList(new Game("Dragon Blaze", 5), new Game("Angry Bird", 5),
				new Game("Candy Crush", 5));

		 List<String>result1=list.stream().map(Game::getName).collect(Collectors.toList());
		 System.out.println("In the form of array = "+result1);
		 
		String result2 = list.stream().map(x -> x.getName()).collect(Collectors.joining(", ", "{", "}"));
		System.out.println("\n In the form of string = "+result2);
		

		
	}
}
