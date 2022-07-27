package com.josh.java.training.Assignment.OOPS.Q3;

public class Main {
	
  public static void main(String[] args) {
	
	  //creating object for circle
	  Circle blueCircle =new Circle(3.3,"blue",true);
	  
	  //seeing radius of circle
	  System.out.println("Radius of circle = "+blueCircle.getRadius());
	  
	  //area of circle
	  System.out.println("area of circle = "+blueCircle.getArea());
	  
	  //perimeter of circle
	  System.out.println("perimeter of circle "+blueCircle.getPerimeter());
}
  
}
