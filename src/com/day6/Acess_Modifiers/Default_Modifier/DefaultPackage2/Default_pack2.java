package com.day6.Acess_Modifiers.Default_Modifier.DefaultPackage2;

import  com.day6.Acess_Modifiers.Default_Modifier.DefaultPackage1.Default_pack1;
public class Default_pack2 extends Default_pack1 {
	
	 //accessing variable i from other package
	
		public static void main(String[] args) 
		{
			Default_pack2 obj = new Default_pack2()  ; 
//			System.out.println( "value of i = "+ obj . i ) ;  // CTE 
		}
	}
	/*
	i has default scope in class Default_pack1, cannot use outside package. 
	*/

