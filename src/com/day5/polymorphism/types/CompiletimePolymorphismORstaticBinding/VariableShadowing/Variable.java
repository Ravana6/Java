package com.day5.polymorphism.types.CompiletimePolymorphismORstaticBinding.VariableShadowing;

class Bank
{
	double home_loan_intrest = 6.2  ; 
}

class SBI extends Bank 
{

}

class ICICI extends Bank
{
	double home_loan_intrest = 7.2  ; 
}
public class Variable {
	public static void main(String[] args) 
	{
		Bank b1 , b2  ; 
		b1 = new ICICI()  ; 
		b2 = new SBI()  ; 
		System.out.println(  "ICICI : " + b1.home_loan_intrest ) ; // 6.2      //FROM BANK
		System.out.println( "ICICI : " +  ((ICICI)b1) . home_loan_intrest ) ;  // from ICIC
		System.out.println(  "SBI : " + b2.home_loan_intrest ) ;  // 6.2    //FROM BANK because SBI extends Bank 
	}
}
