package com.josh.java.training.Assignment.OOPS.Q2;

public class Student extends Person {
 
	String program;
	int year;
	double fee;

	public Student(String name, String addres, String program, int year, double fee) {
		super(name, addres);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [Person [name=+ "+name +"," +" addres =" + addres + "],program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	
	
}