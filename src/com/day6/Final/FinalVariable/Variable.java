package com.day6.Final.FinalVariable;

public class Variable {
	   //Blank final variable
	   final int BLANK_FINAL_VARIABLE;
	   
//	   final static  int BLANK_FINAL_STATIC // FOR final static variable always  we have to initialize 
	   
	   final static  int BLANK_FINAL_STATIC =90;
	   //we have to use constructor to initial the Blank final variable in global Variable OR CLASS Variable
	   Variable()
	   {
		   BLANK_FINAL_VARIABLE=30;
	   }
	   
	   void printLocalVariable()
	   {
		   final int  LOCAL_FINAL_VARIABLE;// is a final local int variable 
		   LOCAL_FINAL_VARIABLE=60;// first time possible 
		 
			System.out.println("Final  Local Variable = "+LOCAL_FINAL_VARIABLE) ; // 60 
			//LOCAL_FINAL_VARIABLE = 20  ; // CTE cannot re-initialize
	   }
	   public static void main(String[] args) {
		   
//		   System.out.println("Blank final variable = "+BLANK_FINAL_VARIABLE); //CTE  
		   
		   System.out.println("Blank final static variable = "+BLANK_FINAL_STATIC );
		   
		   //CREATE object for Variable class 
	   	Variable var=new Variable();
		System.out.println("Blank final variable = "+var.BLANK_FINAL_VARIABLE);
		var.printLocalVariable();
	}
}
