package com.josh.java.training.javafeatures.lambdaexpressions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Developer {
  public Developer(String name, int salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
private String name;
  private int salary;
  private int age;
  
  
}
