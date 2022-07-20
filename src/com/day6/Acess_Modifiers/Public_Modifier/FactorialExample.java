package com.day6.Acess_Modifiers.Public_Modifier;

public class FactorialExample {
	
		public static void main(String args[]){
		int i,fact=1;
		int number=5;//It is the number to calculate factorial.
		for(i=1;i<=number;i++){
		fact=fact*i;
		}
		System.out.println("Factorial of "+number+" is: "+fact);
}
}

//we can access public anywhere 