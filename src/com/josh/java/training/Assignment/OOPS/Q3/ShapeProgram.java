package com.josh.java.training.Assignment.OOPS.Q3;

public class ShapeProgram {
  
	public static void main(String[] args) {
		
		//create new Shape object with no -argument
		Shape square=new Shape();
		
		//using COLOR METHOD TO get color
		System.out.println("color of the square = "+square.COLOR());
		
		//using FILLED METHOD to see shape is filled or not filled 
		String resultOfFilled=(square.FILLED())?"filled":"Not filled";
		System.out.println("shape is "+resultOfFilled);
		
		
		//setting  different color to square using setColor
		square.setColor("blue");
		System.out.println("color of the square = "+square.COLOR());
		
		
		System.out.println(square.toString());
	}
}
