package com.Controlstatement;

public class NestedLoop {
     
	public static void usingWhileAndFor(int n)
	{
		int count = 1  ; 
		while ( count <= 2  )
		{
			for (int i = 1 ;  i <= n ; i++ )
			{
				System.out.print( i ) ;
				if (i != n )
				{
					System.out.print( ", ")  ;
				}
			} // end of for 
			System.out.println() ; 
			count++ ; 
		}// end of while 
	}

	
	public static void usingFor(int n) 
	{
		for (int i = 0  ; i < n  ; i++  )
		{
			char ch = 'a'  ; 
			for (int j = 0 ;  j < n ;  j++ )
			{
				if (i % 2 == 0 )
				{
					System.out.print(  (j+1) + " ")  ; 
				}
				else
					System.out.print(  ch++ + " ")  ; 
			}
			System.out.println() ; 
		}
	}
	
	
	public static void main(String[] args) {
		usingFor(5);
		System.out.println("======================");
		usingWhileAndFor(6);
	}

}

