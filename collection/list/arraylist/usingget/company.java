package com.josh.java.training.collection.list.arraylist.usingget;

import java.util.LinkedList;
import java.util.List;

public class company {

	public static void main(String[] args) {

		List<Employee> company1 = new LinkedList<Employee>();

		company1.add(new Employee(1000, "laila", 10000.0));
		company1.add(new Employee(1001, "Sheela", 20000.0));

		// displaying the detail of the employee

		// to get index in for each loop we have to use indexOf() method
		System.out.println(company1);

		for (Employee employeeDetail : company1)
			System.out.println("Employee  Detail " + employeeDetail);

		// display salary of first employee

		// 1 way

		/*
		 * storing the object and using the method
		 */
		System.out.println("==================");

		System.out.println("1 way");
		Employee e = company1.get(0);
		System.out.println("This employee object " + e);
		System.out.println("using employee method = " + e.getSalary());

		// ============================================
		System.out.println("directly ");
		System.out.println(company1.get(0).getSalary());
		// salary of second employee

		System.out.println(company1.get(1).getSalary());

		// ======================================================
		System.out.println("==================Using Loop==========================");
		for (int i = 0; i < company1.size(); i++) {

			Employee e1 = company1.get(i);
			System.out.println(e1.getSalary());
		}

	}
}
