package com.oopsConcepts.constructor.no_argConstructor;

public class Company {
   
	public static void main(String[] args) 
	{
		// 1 employee, eid 1001 
		Employee e1  = new Employee()  ; 
		e1 . eid = 1001  ; 
		System.out.println("E1.eid :" + e1.eid ) ; // 1001
		
		// another employee, eid 1002 ; 
		Employee e2 = new Employee()  ; 
		e2.eid = 1002  ; 
		
		// print eid of first employee 
		System.out.println("Employee Id 1 = "+ e1.eid) ;
		// print eid 2nd employee 
		System.out.println("Employee Id 2 ="+ e2.eid) ;
	
	}
}
