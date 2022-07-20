package com.day5.inheritance.SingleLevel;


 class Accounts
{
        int account_Number ;


      Accounts(int accountNumber ) {
  	                    this.account_Number = accountNumber ;
                }
}


        class Saving_Account extends Accounts
              {
                          double bal ;
                    
                       Saving_Account(int ano , double bal ) 
                       {
            	              super( ano ) ;
                              this.bal = bal ;
                        }
                }

public class Bank {
	public static void main(String[] args)
	{
		Accounts account1 = new Accounts(101) ;
		System.out.println("Account number : " + account1.account_Number);
		// account balance
		
	}
}
