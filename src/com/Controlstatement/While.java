package com.Controlstatement;
 
import java.util.Scanner;
public class While {
	public static void printAscii(int from ,int to) 
	{    
	
			  if(from<to)
			   {
				   while (from <= to )
					{
						System.out.println("Decimal Value -->"+from + " : "  + " Character -->"+ (char)from ) ;
						from++ ; 
					}
				
			  }
			   else  {
				   System.out.println("Enter greater value for to");
			   }

	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value from which value to print Ascii");
		int from=sc.nextInt();
		System.out.println("Enter the value to stop the print  of Ascii");
		int to=sc.nextInt();
	
		printAscii(from, to);
		sc.close();
	}
}
