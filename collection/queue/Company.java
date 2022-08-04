package com.josh.java.training.collection.queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Company {
	ArrayList<Employee> emp = new ArrayList<>();

	public void addEmp(Employee e) {
		emp.add(e);
	}

	public void paySalary(PriorityQueue<Employee> q) {

		Employee e = q.poll();
		while (e != null) {

			System.out.println("Paying salary for the Employee :");
			System.out.println("Name : " + e.getName());
			System.out.println("Salary :" + e.getSalary());
			System.out.println("=================================");
			e = q.poll();
		}
	}
}
