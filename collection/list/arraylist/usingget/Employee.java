package com.josh.java.training.collection.list.arraylist.usingget;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private int eid;
	private String name;
	private double salary;

	@Override
	public String toString() {
		return "( " + eid + ", " + name + ", " + salary + ")";
	}
}
