package com.day6.Acess_Modifiers.Default_Modifier.DefaultPackage1;

public class Default_pack1a {
	public static void main(String[] args) 
	{
		//we can use default in same package without import
		Default_pack1 obj= new Default_pack1()  ; 
		obj.i=30;
		System.out.println("value of  i = "+ obj . i  ) ; 
	}
}
