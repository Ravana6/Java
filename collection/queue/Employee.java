package com.josh.java.training.collection.queue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee> {

	public int compareTo(Employee e) {
		if (this.salary == e.salary)
			return 0;
		else if (this.salary > e.salary)
			return 1;
		else
			return -1;
	}

	private int eid;
	private double salary;
	private String name;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", name=" + name + "]";
	}

}