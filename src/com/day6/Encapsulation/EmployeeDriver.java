package com.day6.Encapsulation;

public class EmployeeDriver {
	public static void main(String[] args) 
	{
		Employee e1 = new Employee()  ; 
		// user wants to print salary 
		System.out.println( e1.getSalary()  ) ; // possible..??? 
		// user want to assign 3000 as salary 
		e1.setSalary( -3000 )  ; // possible...?? 
		System.out.println( e1.getSalary()  ) ; // 2000.0 
	}
}
