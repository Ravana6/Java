package com.josh.java.training.Assignment.OOPS.Q1;

public class Account {

		String id;
		String name;
		int balance;
		
		//account consturctor
		public Account(String id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		// one more account consturctor
		public Account(String id, String name, int balance) {
			super();
			this.id = id;
			this.name = name;
			this.balance = balance;
		}
		
		//get method for id
		public String getId() {
			return id;
		}
		//get method for name
		public String getName() {
			return name;
		}
		//get method for balance
		public int getBalance() {
			return balance;
		}

		
		// credit method
		int credit(int amount)
		{
			this.balance+=amount;
			System.out.println(amount+" rupees Credit succuessfully");
			System.out.println("current balance "+balance);
			System.out.println("-------------------------------");
			return this.balance;
		}
		
		// debit  method
		int debit(int amount)
		{
			if(amount<=this.balance)  //  checking for sufficient balance
			{
				this.balance-=amount;  //updating balance
				System.out.println(amount+" rupees debit succuessfully");
				System.out.println("current balance "+balance);
				System.out.println("-------------------------------");
				return this.balance;
			}
			else
			{
				System.out.println("Amount exceeded balance");
				System.out.println("You can withdraw upto "+balance);
				System.out.println("-------------------------------");
				return this.balance;
			}
		}
		
		void transferTo(Account another,int amount)
		{
			if(amount<=this.balance) //  checking for sufficient balance
			{
				another.balance+=balance;  //updating balance
				System.out.println("Rupees "+amount+" is transfer to "+another.name+" succuessfully");
				System.out.println("-------------------------------");
			}
			else
			{
				System.out.println("Rupees "+amount+" exceeded balance");
				System.out.println("You can transfer upto "+balance);
				System.out.println("-------------------------------");
				
			}
		}
	 
		//overriding the toString
		@Override
		public String toString() {
	
		return "Account [id = "+this.id+","+"name = "+name+","+"balance = "+this.balance+"]";
		}
		
}
