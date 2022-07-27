package com.josh.java.training.Assignment.OOPS.Q2;

public class Staff extends Person {
 
	String school;
	double pay;
	public Staff(String name, String addres, String school, double pay) {
		super(name, addres);
		this.school = school;
		this.pay = pay;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
//	@Override
//	public String toString() {
//		return "Staff [school=" + school + ", pay=" + pay + "]";
//	}
	@Override
	public String toString() {
		return "Staff [Person [ name=" + name + ", addres=" + addres +"]"+" + school = "+school+",  + pay = "+pay+"]";
	}

	 
	
	
}
