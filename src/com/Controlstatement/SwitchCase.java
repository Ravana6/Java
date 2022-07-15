package com.Controlstatement;
import java.util.Scanner;
public class SwitchCase {
 
	
//	note : we cannot use float,double,boolean,long for switch
	
	public static void main(String[] args) 
		{ 
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the day");
			String day ; 
			day =  sc.next() ;     // read the input 
			sc.close();
			String game1 = "Basket Ball" ;
			String game2 = "Cricket" ;
			String game3 = "Hockey" ;
			switch (   day   )
			{
			case "monday":   
			case "saturday":  System.out.println("play " + game1 )  ; 
									break ; 
			case "tuesday":
			case "thursday": System.out.println("paly " + game3 ) ; 
						break ; 
			case "wednesday":
			case "friday" :System.out.println("play " + game2 ) ; 
						break ; 
			default: System.out.println( "Invalid Entry " );
						break ; 
			}
		}

}
