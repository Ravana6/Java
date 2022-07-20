package com.day3.Controlstatement;
import java.util.Scanner;
public class DoWhile {
 
	public static void countEvenNumber(int from,int to) 
	{
		
	
		int count  = 0  ; 
		do
		{
			if ( from % 2 == 0 )
			{
				// m is even 
				count++ ; 
			}
		from++  ; 
		}
		while ( from <= to  ); // if m becomes 31 stop 
		// outside loop 
		System.out.println("There are " + count + " even numbers " ) ;
	}
	
	     public static void main(String[] args) {
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.println("Enter the value for from ");
	    	 int from=sc.nextInt();
	       	 System.out.println("Enter the value for to ");
	    	 int to=sc.nextInt();
	    	 sc.close();
			countEvenNumber(from,to);
		}
	

	
	

	
	
}
