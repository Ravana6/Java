package com.josh.java.training.collection.queue;

import java.util.PriorityQueue;

public class Driver {
public static void main(String[] args) {
		
		Company c = new Company()  ; 
		c.addEmp(new Employee(1, 2000, "A"));
		c.addEmp(new Employee(2, 1500, "B"));
		c.addEmp(new Employee(3, 3000, "C"));
		
		PriorityQueue<Employee> q = new PriorityQueue<Employee>() ; 
		
		System.out.println("No of employees :" +  c.emp.size());
		
		for( int i = 0 ; i < c.emp.size() ; i++ )
		{
			q.add(c.emp.get(i)) ; 
		}
		System.out.println("Size of q : " + q.size());
		c.paySalary(q);	
	}
}
