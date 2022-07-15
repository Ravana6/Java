package com.Controlstatement;

public class IfElse {
 
		public static void main(String[] args) 
		{  
			
			String type="coffee";
			boolean isDiabetic  ;
			isDiabetic =true ;      
			System.out.println("Pour milk into kettle ");
			System.out.println("Boil ");
			if(type=="tea")
			System.out.println("add tea powder");
		    else
			System.out.println("add coffee powder");
			if (  ! isDiabetic )
			{
				System.out.println("add sugar ");
			}
			System.out.println("filter ");
			if(type=="coffee")
				System.out.println("pour into coffee cup ");
			else
			System.out.println("pour into tea cup ");
		}

	
}
