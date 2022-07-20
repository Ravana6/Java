package com.day6.Acess_Modifiers.Default_Modifier.DefaultPackage1;

public class Default_pack1 {
	public  Default_pack1() 
	{

	}

	int i  ;   // default access / package scope 
    
	void defaultMethod()
	{
		System.out.println("Default Method");
	}
	public static void main(String[] args) 
	{
		Default_pack1 obj = new Default_pack1()  ; 
		System.out.println( "value of  i = "+obj . i )  ; 
	}
}
 		