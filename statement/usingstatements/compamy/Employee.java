package com.josh.java.training.jdbc.statement.usingstatements.compamy;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private Long id;
	private String name;
	private double salary;
	private String email;
	private LocalDateTime createdDate;

}