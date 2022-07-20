package com.day5.polymorphism.Overloading.MethodOverloading;

public class Smallest {
  public static int smallest(int number1,int number2)
  {
	  return number1<number2 ? number1 : number2;
  }
  
  public static int smallest(int number1,int number2,int number3)
  {
	  return number1<number2 ? (number1<number3?number1:number3) : (number2<number3?number2:number3);
  }
  
  public static int smallest(int number1,int number2,int number3,int number4)
  {
	  if(number1<number2 && number1<number3&&number1<number4)
		  return number1;
	  else if(number2<number3 && number2<number4)
		  return number2;
	  else if(number3<number4)
		  return number3;
	  return number4;
  }
  public static void main(String[] args) {
	  System.out.println("number "+smallest(-2,2)+"  is smallest");
	  System.out.println("number "+smallest(1,0,1)+"  is smallest");
	System.out.println("number "+smallest(1, 20, 2, 0)+"  is smallest");
}
}
