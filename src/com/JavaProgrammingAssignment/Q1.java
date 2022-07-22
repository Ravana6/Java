package com.JavaProgrammingAssignment;

import java.util.Random;

//An example of nested try statements.
//Demonstrate throw.
class Q1 {
static void demoproc() {
try {
throw new ArithmeticException();

} catch(Exception e) {
System.out.println("Caught inside demoproc.");
System.out.println(e);

//	System.out.println(e.getMessage( ));

throw new ArrayIndexOutOfBoundsException(); // rethrow the exception
}
}
public static void main(String args[]) {
try {
demoproc();
} catch(Exception e) {
System.out.println("Recaught: " + e);
}
}
}
