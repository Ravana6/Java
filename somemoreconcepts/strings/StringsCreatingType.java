package com.josh.java.training.somemoreconcepts.strings;

public class StringsCreatingType {
	public static void main(String[] args) {

		/*
		 * create a String using String literal
		 * 
		 * if the object already exist in the memory it does not create a new Object
		 * rather it assigns the same old object to the new instance
		 */
		String stringVariableUsingLiteral1, stringVariableUsingLiteral2;
		stringVariableUsingLiteral1 = "hello";
		stringVariableUsingLiteral2 = "hello";
		
		System.out.println("create a String using String literal");
		System.out.println("-----------------------------------");
		System.out.println("stringVariableUsingLiteral1 = "+stringVariableUsingLiteral1);
		System.out.println("stringVariableUsingLiteral2 = "+stringVariableUsingLiteral2);
		
		
		/*
		 *  == compare the references of the object in string not the value
		 * */
		
		System.out.println("using == to check it is same : "+(stringVariableUsingLiteral1 == stringVariableUsingLiteral2)); // true
		
		/*
		 *  equals()  compare the value of the object in string not the value
		 * */
		System.out.println("using equals() to check it is same : "+stringVariableUsingLiteral1.equals(stringVariableUsingLiteral2)); // true
		
		System.out.println(stringVariableUsingLiteral1.toString()+"\n");
		 
		
		/*
		 *create a String using new keyword
		 * */
		
		String stringVariableUsingNewKeyword1= new String("hello");
		String stringVariableUsingNewKeyword2= new String("hello");
		System.out.println("create a String using new keyword ");
		System.out.println("-----------------------------------");
		System.out.println("stringVariableUsingNewKeyword1 =  "+stringVariableUsingNewKeyword1);
		System.out.println("stringVariableUsingNewKeyword2 =  "+stringVariableUsingNewKeyword2);
		
		/*
		 *  == compare the references of the object in string not the value
		 * */
     	System.out.println("using == to check it is same : "+(stringVariableUsingNewKeyword1 == stringVariableUsingNewKeyword2)); // false
		
		/*
		 *  equals()  compare the value of the object in string not the value
		 * */
		System.out.println("using equals() to check it is same : "+stringVariableUsingNewKeyword1.equals(stringVariableUsingNewKeyword2)); // true
		
		System.out.println(stringVariableUsingLiteral1.toString()+"\n");
	}
}
