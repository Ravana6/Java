package com.JavaProgrammingAssignment;

public class HillPattern {
  
	public static void HillPatternA(int row)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row*2-1;j++)
			{
				if(i+j>=row-1&& j-i<=row-1)
//				System.out.print(""+i+""+j+" ");
				System.out.print("* ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
	
	public static void HillPatternB(int row)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row*2-1;j++)
			{
				if((i==j) || ( i+j<=row*2-2))
				System.out.print(""+i+""+j+" ");
//				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void HillPatternC(int row)
	{
		for(int i=0;i<row*2-1;i++)
		{
			for(int j=0;j<row*2-1;j++)
			{
//                 if(i+j>=row-1&&i+j<=row*2+3 || j-i<=row-1&&i-j>=row-1)
//				i+j>=row-1
//				j-i<=row-1
				
//				i+j<=row*2+3
				if(i-j<=row-1&&j-i<=row-1 &&i+j>=row-1 &&i+j<=row*2+3)
//                 {
//                		System.out.print(""+i+""+j+" ");
                 System.out.print(" *");
//                 }
			
                 else
                	 System.out.print("");

			
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
//		HillPatternA(6);
//		System.out.println("============");
//		HillPatternB(6);
		HillPatternC(6);
	}
}
