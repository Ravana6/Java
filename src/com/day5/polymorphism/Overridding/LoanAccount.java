package com.day5.polymorphism.Overridding;


class Account
{
	public int accno  ; 
	public String name  ; 

	public Account() 
	{
	}

	// display feature 
	public void displayAccountDetails() 
	{
		System.out.println( "Account Holder Name : " + name ) ;
		System.out.println(" Account NUmber : " +  accno )  ;
	}

	public Account( int accno  , String name  ) 
	{
		this.accno  = accno  ; 
		this.name  = name  ; 
	}
}


     
	public class  LoanAccount extends Account 
	{
		int loan_id ; 
		double loan_amnt  ; 

		public LoanAccount ()  
		{
		}

		
		public LoanAccount( int accno  , String name  , int loan_id, 
			double loan_amnt )  
		{
			super( accno , name )  ; 
			this.loan_id = loan_id  ; 
			this.loan_amnt = loan_amnt ; 
		}

		// override displayAccountDetails 
		@Override
		public void displayAccountDetails()  // Overriding method 
		{
			// old design 
			super . displayAccountDetails()  ;  // Parent class  Desgin 
			// as well provide new design  // extra instruction 
			System.out.println("Loan ID : " + loan_id ) ; 
			System.out.println("Loan Amount : " + loan_amnt ) ;
		}

	
	
	
	public static void main(String[] args) 
	{
		Account a1 = new Account( 101 , "Smitha" ) ;
		// can we display details of account 
		a1.displayAccountDetails()  ; 
		// ==================================== 
		System.out.println("=============================================") ;
		Account a2 = new LoanAccount(102 , "Latha" , 1 , 200000)  ; 
		// can we display details of LoanAccount 
		a2.displayAccountDetails()  ; 
	}
}
