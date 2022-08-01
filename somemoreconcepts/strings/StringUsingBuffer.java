package com.josh.java.training.somemoreconcepts.strings;

public class StringUsingBuffer {
	public static void main(String[] args) {
		StringBuffer stringBufferVariable = new StringBuffer("javayou");
		
		/*
		 * length() method is use get length of the string*/
		System.out.println("length of the string = "+stringBufferVariable.length()); // 7 
		
		/*
		 * capacity() method is used to to get the capacity of the string*/
		System.out.println("capcity of the string = "+stringBufferVariable.capacity());// 23
		
		/*
		 * append() method is used add the given string to the last */
		stringBufferVariable.append("friend");
		System.out.println(stringBufferVariable); // javayoufriend
		/*
		 * insert() method is used to insert from a particular point */
		stringBufferVariable.insert(4, "for");
		System.out.println(stringBufferVariable);// javaforyoufriend
		char c[] = { 'a', 'a', 't', 'i', 'f' };
		stringBufferVariable.insert(16, c);
		System.out.println(stringBufferVariable);// javaforyoufriendaatif
		System.out.println(stringBufferVariable.charAt(2)); // v
		
		System.out.println("================");
		
		StringBuffer stringBufferVariable1 = new StringBuffer("javaworld");
		System.out.println("Before delete method  : "+stringBufferVariable1); 
		/*
		 * delete() method is use to delete string from particular  point */
		stringBufferVariable1.delete(3, 5);
		System.out.println("After delete method  : "+stringBufferVariable1);  // javorld
		System.out.println("================");
		
		StringBuffer stringBufferVariable2 = new StringBuffer("javaworld");
		System.out.println("Before deleteCharAt  method  : "+stringBufferVariable2); 
		
		/*
		 * deleteCharAt() method is use to delete particular character from string */
		stringBufferVariable2.deleteCharAt(4);
		System.out.println("After deleteCharAt  method  : "+stringBufferVariable2);  // javaorld
		
		System.out.println("================");
		
		StringBuffer stringBufferVariable3 = new StringBuffer("java");
		System.out.println("Befor reverse method  : "+stringBufferVariable3);
		stringBufferVariable3.reverse();
		System.out.println("After reverse method  : "+stringBufferVariable3);// avaj
	}

}
