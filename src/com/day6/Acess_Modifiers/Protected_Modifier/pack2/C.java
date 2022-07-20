package com.day6.Acess_Modifiers.Protected_Modifier.pack2; 

 import com.day6.Acess_Modifiers.Protected_Modifier.pack1.*;
public class C {
	
		public static void main(String[] args) 
		{  
//			we can not access the variable i because it is protected access modifier
			A obj = new A() ;  
//			System.out.println( obj . i )  ;  // CTE 
		}
	}

