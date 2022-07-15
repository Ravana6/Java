package com.Type.operators;

public class relationalOperators {
	
       public static void main(String[] args) {
		  

    	   
    	       int intNumber1,intNumber2;
    		  double doubleNumber1;
    		  float floatNumber1;
    		  char character1;
    		  boolean boolean1,boolean2;
    		  String str1,str2;
    		  
    		  
    	  
    		  intNumber1=69;
    		  intNumber2=96;
    		  doubleNumber1=69.01;
    	
    		  floatNumber1=69.01f;

    		  character1='a';
    
    		  boolean1=true;
    		  boolean2=false;
    		  str1="Hello";
    		  str2=" world";
    		  
//       	   equality
    		  System.out.println("equality");
    		  System.out.println("---------------------------------");
    		  System.out.println("if both LHS and RHS literal is having same value it return \"true\"");
    		  System.out.println("if both LHS and RHS literal is having different value it return \"false\"");
    		  System.out.println("int "+intNumber1+" == "+"int "+intNumber2+"--->" +(intNumber1==intNumber2) );
    		  System.out.println("int "+intNumber1+" == "+" double "+doubleNumber1+" = "+(intNumber1==doubleNumber1));
    		  System.out.println("int "+intNumber1+" == "+" float "+floatNumber1+" = "+(intNumber1==floatNumber1));
    		  System.out.println("float "+floatNumber1+" =="+"double "+doubleNumber1+" = "+(floatNumber1==doubleNumber1)+"when it is decimal it is false for whole number it is true");
    		 System.out.println("int "+intNumber1+"== "+" boolean "+boolean2+" = "+"--- give error");
    		  System.out.println("char "+character1+" == "+"double "+doubleNumber1+" = "+(character1==doubleNumber1)+"---compare ascii value and give result");
    		  System.out.println("boolean "+boolean1+" == "+"boolean "+boolean2+" = "+(boolean1==boolean2));
    		  System.out.println("string "+str1+" == "+"string "+str2+" = "+(str1==str2)+"---compare string");
    		  System.out.println("======================================");
    		  
//    		inequality  
       		  System.out.println("inequality");
    		  System.out.println("---------------------------------");
    		  System.out.println("if both LHS and RHS literal is having same value it return \"false\"");
    		  System.out.println("if both LHS and RHS literal is having different value it return \"true\"");
    		  System.out.println("int "+intNumber1+" != "+"int "+intNumber2+"--->" +(intNumber1!=intNumber2) );
    		  System.out.println("int "+intNumber1+" != "+" double "+doubleNumber1+" = "+(intNumber1!=doubleNumber1));
    		  System.out.println("int "+intNumber1+" != "+" float "+floatNumber1+" = "+(intNumber1!=floatNumber1));
    		  System.out.println("int "+intNumber1+"!= "+" boolean "+boolean2+" = "+"--- give error");
    		  System.out.println("char "+character1+" != "+"double "+doubleNumber1+" = "+(character1!=doubleNumber1)+"---compare ascii value and give result");
    		  System.out.println("boolean "+boolean1+" != "+"boolean "+boolean2+" = "+(boolean1!=boolean2));
    		  System.out.println("string "+str1+" != "+"string "+str2+" = "+(str1!=str2)+"---compare string");
    		  System.out.println("======================================");
    		  
    		  
//    		  Less than or equal
    		  char lowerCase='a';
    		  char upperCase='A';
    		  System.out.println("Less than or equal");
    		  System.out.println("---------------------------------");
    		  System.out.println("lowerCase "+lowerCase+" <= upperCase "+upperCase+" ---"+(lowerCase<=upperCase));
    		  System.out.println("======================================");
    		  
//    		  greater than or equal
    		  char lowerCase1='a';
    		  char upperCase1='A';
    		  System.out.println("greater than or equal");
    		  System.out.println("---------------------------------");
    		  System.out.println("lowerCase "+lowerCase1+" >= upperCase "+upperCase1+" ---"+(lowerCase1>=upperCase1));
    		  System.out.println("======================================");
    		  
    		  
//    		  Less 
    		  char lowerCase2='a';
    		  char upperCase2='A';
    		  System.out.println("Less ");
    		  System.out.println("---------------------------------");
    		  System.out.println("lowerCase "+lowerCase2+" < upperCase "+upperCase2+" ---"+(lowerCase2<upperCase2));
    		  System.out.println("======================================");
    		  
//    		  greater than or equal
    		  char lowerCase3='a';
    		  char upperCase3='A';
    		  System.out.println("greater ");
    		  System.out.println("---------------------------------");
    		  System.out.println("lowerCase "+lowerCase3+" >= upperCase "+upperCase3+" ---"+(lowerCase3>=upperCase3));
    		  System.out.println("======================================");
    		  
	}
}
