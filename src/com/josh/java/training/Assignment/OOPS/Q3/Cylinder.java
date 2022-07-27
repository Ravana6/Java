package com.josh.java.training.Assignment.OOPS.Q3;

public class Cylinder extends Circle {
 double height;

public Cylinder() {

}

public Cylinder(double radius) {
	super(radius);

}
 
public Cylinder(double radius, double height) {
	super(radius);
	this.height = height;
}

public Cylinder(double radius, double height,String color) {
	super(radius);
	this.color=color;
	this.height = height;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public double getVolume()
{ 
	return Math.PI*this.radius*this.radius*this.height;
}


}
