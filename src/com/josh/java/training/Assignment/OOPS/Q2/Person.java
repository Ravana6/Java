package com.josh.java.training.Assignment.OOPS.Q2;

public class Person {
 String name;
 String addres;
public Person(String name, String addres) {
	super();
	this.name = name;
	this.addres = addres;
}
public String getName() {
	return name;
}
public String getAddres() {
	return addres;
}
public void setAddres(String addres) {
	this.addres = addres;
}
@Override
public String toString() {
	return "Person [name=" + name + ", addres=" + addres + "]";
}
  
}
