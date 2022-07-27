package com.josh.java.training.Assignment.OOPS.Q1;

public class AccountDriver {

	public static void main(String[] args) {
		Account accountHolder1=new Account("06","karthik" );  //creating account holder 1
		
		System.out.println("checking balanceaccount holder 1=  "+accountHolder1.getBalance());
		accountHolder1.credit(6000);
		accountHolder1.debit(7000);
		accountHolder1.debit(5000);
		System.out.println(accountHolder1);
		
		System.out.println("===================");
		
		Account account_Holder_2=new Account("05","suresh",5000); //creating account holder 2
		
		System.out.println("checking balance account holder 2 = "+account_Holder_2.getBalance());
		account_Holder_2.credit(6000);
		account_Holder_2.debit(7000);
		account_Holder_2.debit(5000);
		System.out.println(account_Holder_2.toString());
		
		System.out.println("===================");
		
		
	   //checking balance of account holder 1
		System.out.println("checking balance of account holder 1 ="+accountHolder1.getBalance());
		

		  //transferring  amount  from account holder 1 to account holder 2
		accountHolder1.transferTo(account_Holder_2, 500);
		
		
		
		
	
		
	}
}
