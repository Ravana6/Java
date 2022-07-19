package com.oopsConcepts.staticKeyword.staticVariable;

public class SavingsAccountDriver {
    
	public static void main(String[] args) 
	{
		// 1 savings account details  ( 1, laila , 2000 ) 
		SavingsAccount.setAccountDetails( 1 , "laila" , 2000 ) ;
		SavingsAccount.displayAccountDetails()  ; 
		// i need to deposit 500 
		SavingsAccount.deposit( 500  )  ; 
		SavingsAccount.displayAccountDetails()  ; 
		
		SavingsAccount.withdrawn( 2500  )  ; 
		SavingsAccount.displayAccountDetails()  ; 
	}
	
}
