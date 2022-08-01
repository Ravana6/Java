package com.josh.java.training.somemoreconcepts.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r1 {
	public static void main(String[] args) {
//	 String content = "This is a tutorial Website!";
//	 String patternString = ".*tutorial.*";
//	 boolean isMatch = Pattern.matches(patternString, content);
//	 System.out.println("The text contains 'tutorial'? " + isMatch);

//	 String content = "This is a tutorial Website!";
//	 String patternString = ".*tuToRiAl.";
//	 Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);

		String content = "This is a tutorial tutorial Website!";
		String patternString = ".*tuToRiAl.*";
		Pattern pattern = Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
//		System.out.println("patter : " + pattern);
		Matcher matcher = pattern.matcher(content);
		System.out.println("match : " + matcher);
		boolean isMatched = matcher.matches();
		System.out.println("Is it a Match?" + isMatched);
//		System.out.println(matcher.find());
		
		
		while (matcher.find()) {
			System.out.println("hi");
              System.out.println(matcher.start());
                 System.out.println("Found at: "+ matcher.start()
	    		+ 
	    		" - " + matcher.end());
		}

//
//		 	String text = "ThisIsChaitanya.ItISMyWebsite";
//		     // Pattern for delimiter
//		 	String patternString = "is";
//		 	Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
//		 	String[] myStrings = pattern.split(text);
//		 	for(String temp: myStrings){
//		 	    System.out.println(temp);
//		 	}
//		 	System.out.println("Number of split strings: "+myStrings.length);
//		 

//	  String content = "ZZZ AA PP AA QQQ AAA ZZ";
//
//	  String string = "AA";
//	  Pattern pattern = Pattern.compile(string);
//	  Matcher matcher= pattern.matcher(content);
//         System.out.println(matcher.find());
//        System.out.println(matcher.find());
//	  while(matcher.find()) {
//	     System.out.println("Found at: "+ matcher.start()
//	    		+ 
//	    		" - " + matcher.end());
//	  }
	}

}
