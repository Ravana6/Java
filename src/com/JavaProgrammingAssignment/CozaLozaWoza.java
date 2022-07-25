package com.JavaProgrammingAssignment;



public class CozaLozaWoza {
  
	//method to print CozaLozaWoza
	public static void printCozaLozaWoza()
	{
		for(int i=1;i<=110;i++)
		{
			
//			 to print "CozaLoza " in place of multiples of 3 and 5
			 if(i%3==0&&i%5==0)
				System.out.print("CozaLoza ");
			 
//			 to print "CozaWoza " in place of multiples of 3 and 5
			 else  if(i%3==0&&i%7==0)
				System.out.print("CozaWoza ");
			
//			 to print "Coza" in place of multiples of 3
			 else if(i%3==0)
				System.out.print("Coza ");
			
//			 to print "Loza" in place of multiples of 5
			else if(i%5==0)
				System.out.print(" Loza ");
			
//			 to print "Woza" in place of multiples of 7
			else if(i%7==0)
				System.out.print("Woza ");
			

			
			else
				System.out.print(i+" ");
			
			//to print 11 onwards
			if(i%11==0)
			{
				System.out.println();
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		//calling printCozaLozaWoza method
		printCozaLozaWoza();
	}
}
