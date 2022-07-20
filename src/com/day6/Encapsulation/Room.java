package com.day6.Encapsulation;

class AC 
{
	private int min_temp=16;
	private int max_temp=28;
	private int current_temp;
	void ON()
	{
		current_temp=24;
		System.out.println("AC turned on enjoy the world");
	}
	void OFF()
	{
		current_temp=0;
		System.out.println("AC turned off ");
	}
		
		void decrease_temp()
		{
			if (current_temp>min_temp)
			{
				current_temp--;
				System.out.println("temp decreased by one");
			}
			else
			{
			System.out.println("temp alraedy in min");
			}
			
		}

		void increase_temp()
		{
			if (current_temp<max_temp)
			{
				current_temp++;
			System.out.println("temp increased by one");
			}
			else
			{
				System.out.println("temp alraedy in max");
			}
			
		}
		void checktemp()
		{
		System.out.println("temp  is "+this.current_temp);
		}
}




// fully enapsulated class 


public class Room {
	public static void main(String[] args) 
	{
		AC obj1=new AC();
		obj1.ON();// 24
		obj1.checktemp();//24
		obj1.decrease_temp();
		obj1.checktemp();//23
		obj1.increase_temp();
		obj1.checktemp();//28
		obj1.OFF();
		obj1.checktemp();//0


	}
}
