package com.day2.operators;

public class basicArithmeticOperators {  
	
   public static void main(String[] args) {
	  int intNumber1,intNumber2;
	  double doubleNumber1,doubleNumber2;
	  float floatNumber1,floatNumber2;
	  char character1,character2;
	  boolean boolean1,boolean2;
	  String str1,str2;
	  
	  intNumber1=96;
	  intNumber2=69;
	  intNumber1=96;
	  doubleNumber1=12.12;
	  doubleNumber1=12.12;
	  doubleNumber2=21.21;
	  floatNumber1=69.12f;
	  floatNumber2=96.21f;
	  character1='a';
	  character2='b';
	  boolean1=true;
	  boolean2=false;
	  str1="Hello";
	  str2=" world";
	  
	  //	+ is for addition.
	  System.out.println("int "+intNumber1+" + "+" int "+intNumber2+" = "+(intNumber1+intNumber2)+"--- give int");
	  System.out.println("========================");
	  
	 
	  System.out.println("int "+intNumber1+" + "+" double "+doubleNumber1+" = "+(intNumber1+doubleNumber1)+"--- give double");
	  System.out.println("========================");
	  
	  System.out.println("int "+intNumber1+" + "+" boolean "+boolean2+" = "+"--- give error");
	  System.out.println("========================");
	  
	
	  System.out.println("double "+doubleNumber1+" + "+"double "+doubleNumber2+" = "+(doubleNumber1+doubleNumber2)+"--- give double");
	  System.out.println("========================");
	  
	 
	  System.out.println("float "+floatNumber1+" +"+"float "+floatNumber2+" = "+(floatNumber1+floatNumber2)+"---give float");
	  System.out.println("========================");
	  
	 
	  System.out.println("char "+character1+" + "+"char "+character2+" = "+(character1+character2)+"---add ascii value");
	  System.out.println("========================");
	  
	  System.out.println("char "+character1+" + "+"double "+doubleNumber1+" = "+(character1+doubleNumber1)+"---add ascii value and give double");
	  System.out.println("========================");
	  
	  
	  
	  System.out.println("boolean "+boolean1+" + "+"boolean "+boolean2+" = "+"error");
	  System.out.println("========================");
	  
	 
	  System.out.println("string "+str1+" + "+"string "+str2+" = "+(str1+str2)+"---concat string");
	  System.out.println("========================");
	  
	  System.out.println("string "+str1+" + "+"int "+intNumber2+" = "+(str1+intNumber2)+"---concat string");
	  System.out.println("========================");
	  
	  System.out.println("string "+str1+" + "+"boolean "+boolean1+" = "+(str1+boolean1)+"---concat string");
	  System.out.println("========================");
	  
	  
	  
//	  – is for subtraction
	  
	  System.out.println("int "+intNumber1+" - "+" int "+intNumber2+" = "+(intNumber1-intNumber2)+"--- give int");
	  System.out.println("========================");
	  
	  System.out.println("int "+intNumber1+" - "+" double "+doubleNumber1+" = "+(intNumber1-doubleNumber1)+"--- give double");
	  System.out.println("========================");
	  
	 
	  System.out.println(" double "+doubleNumber1+" - "+"int "+intNumber1+" = "+(doubleNumber1-intNumber1)+"--- give double");
	  System.out.println("========================");
	  
	  
	  
	  System.out.println("char "+character1+" -"+"char "+character2+" = "+(character1-character2)+"--- ascii value");
	  System.out.println("========================");
	  
	  System.out.println("char "+character1+" - "+"double "+doubleNumber1+" = "+(character1-doubleNumber1)+"---add ascii value and give double");
	  System.out.println("========================");
	  
	  System.out.println("string "+str1+" - "+"string "+str2+" = "+" error CTE");
	  System.out.println("========================");
	  
	  System.out.println("string "+str1+" - "+"int "+intNumber1+" = "+" error CTE");
	  System.out.println("========================");
	  
//	  * is for multiplication.
	  
  System.out.println("float "+floatNumber1+" * "+"float "+floatNumber2+" = "+(floatNumber1*floatNumber2)+"---give float");
	  System.out.println("========================");
	  
	  System.out.println("char "+character1+" * "+"char "+character2+" = "+(character1*character2)+"--- ascii value");
	  System.out.println("========================");
	  
	  System.out.println("boolean "+boolean1+" * "+"boolean "+boolean2+" = "+"error");
	  System.out.println("========================");
	  
	  System.out.println("string "+str1+" * "+"string "+str2+" = "+"ERROR CTE");
	  System.out.println("========================");
	  
//	/ is for division.
      System.out.println("int "+intNumber1+" / "+" int "+intNumber2+" = "+(intNumber1/intNumber2)+"--- give int");
	  System.out.println("========================");
	  
	  System.out.println("char "+character1+" / "+"char "+character2+" = "+(character1/character2)+"--- ascii value");
	  System.out.println("========================");
	  
	  System.out.println("boolean "+boolean1+" / "+"boolean "+boolean2+" = "+"error");
	  System.out.println("========================");
     
	  System.out.println("string "+str1+" / "+"string "+str2+" = "+" error CTE");
	  System.out.println("========================");
	  
	
	  
	  
//	  % is for modulo.
	  
	  System.out.println("float "+floatNumber1+" % "+"float "+floatNumber2+" = "+(floatNumber1%floatNumber2)+"---give float");
	  System.out.println("========================");
	  
	  System.out.println("char "+character1+" %"+"char "+character2+" = "+(character1%character2)+"--- ascii value");
	  System.out.println("========================");
   }
}
