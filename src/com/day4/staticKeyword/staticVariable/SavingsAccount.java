package com.day4.staticKeyword.staticVariable;

public class SavingsAccount {
   
	// properties 
		static int accNo  ; 
		static String name  ; 
		static double balance ;
		
		//  create a method to set the properties 
		public static  void  setAccountDetails( int accNo, String name  , double balance   ) 
		{
			SavingsAccount.accNo  = accNo ; 
			SavingsAccount.name = name  ; 
			SavingsAccount.balance = balance  ; 
		}
			
		// a method to display the account properties 
		static  void displayAccountDetails()  
		{
			System.out.println("===============================") ;
			System.out.println("Account Number : " + accNo) ;
			System.out.println("Customer Name :" + name ) ;
			System.out.println("Account Balance :" + balance ) ;
			System.out.println("===============================") ;
		}
		
		// create a method for deposit 
		static void deposit( double amount ) 
		{  
			if(amount>0) {
				balance += amount  ; 
				System.out.println("Amount added successfuly");
			}
			else
			{
				System.out.println("Amount should be greater than 0");
			}
			
			
		}
		
		static void withdrawn( double amount ) 
		{ 
			if(amount<=balance)
			{
				balance -= amount  ; 
				System.out.println("Amount withdrawn successfuly");
			}
			else
			{
				System.err.println("insufficient fund ");
			}
			
		}
		
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
