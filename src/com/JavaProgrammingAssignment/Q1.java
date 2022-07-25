package com.JavaProgrammingAssignment;

import java.util.Random;

//An example of nested try statements.
//Demonstrate throw.
//class Q1 {
//static void demoproc() {
//throw new ArithmeticException();
//
//}
//public static void main(String args[]) {
//
//demoproc();
//}
//}
class Q1 {
static void throwOne() throws NoClassDefFoundError,NoSuchMethodException
{
System.out.println("Inside throwOne.");

throw new NoSuchMethodException();


}
public static void main(String args[]) {
	try {
		throwOne();
	}
	catch(NoSuchMethodException  e)
	{
		System.out.println("ArithmeticExcetion : "+e);
	}
	catch(ArithmeticException  e)
	{
		System.out.println("ArithmeticExcetion : "+e);
	}

}
}