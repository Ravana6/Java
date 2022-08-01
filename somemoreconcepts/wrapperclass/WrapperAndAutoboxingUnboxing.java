package com.josh.java.training.somemoreconcepts.wrapperclass;

public class WrapperAndAutoboxingUnboxing {

	public static void main(String[] args) {
		/*
		 * Create a wrapper variable /non primitive called wrapperVariable of type
		 * Integer and assign it the value 30:
		 */
		Integer wrapperVariable = 30;
		System.out.println("wrapper Variable = " + wrapperVariable + "\n");

		/*
		 * Create a primitive variable called primitiveVariable of type int and assign
		 * it the value 60:
		 */
		int primitiveVariable = 60;
		System.out.println("primitive Variable =  " + primitiveVariable + "\n");

		// Converting a primitive type to WrapperAndAutoboxingUnboxing object explicitly
		System.out.println("Converting a primitive type to WrapperAndAutoboxingUnboxing object  explicitly");
		Integer WapperVariableExplicitly = Integer.valueOf(primitiveVariable);
		System.out.println("converted Wapper Variable Explicitly = " + WapperVariableExplicitly + "\n");

		// Converting a primitive type to WrapperAndAutoboxingUnboxing object implicitly
		/* Auto boxing */
		System.out.println("Converting a primitive type to WrapperAndAutoboxingUnboxing object  implicitly");
		Integer WapperVariableImplicitly = primitiveVariable; // directly assigning primitive variable
		System.out.println("converted Wapper Variable Implicitly = " + WapperVariableImplicitly + "\n");

		// Converting a WrapperAndAutoboxingUnboxing object to primitive type explicitly
		System.out.println("Converting a WrapperAndAutoboxingUnboxing object to primitive type explicitly");
		int primitiveVariableExplicitly = wrapperVariable.intValue();
		System.out.println("converted Primitive Variable Explicitly =" + primitiveVariableExplicitly + "\n");

		// Converting a WrapperAndAutoboxingUnboxing object to primitive type implicitly
		/* Auto Unboxing */
		System.out.println("Converting a WrapperAndAutoboxingUnboxing object to primitive type implicitly");
		int primitiveVariableImplicitly = wrapperVariable;// directly assigning WrapperAndAutoboxingUnboxing object
		System.out.println("converted Primitive Variable Explicitly =" + primitiveVariableImplicitly + "\n");

		/*
		 * WrapperAndAutoboxingUnboxing class objects allow null values while primitive
		 * data type doesn’t allow it.
		 */

		Integer nullValue = null;
		System.out.println("Wapper object can be assing to " + nullValue + "\n");

//		int nullValue1=null;
		System.out.println("primitive type cannot be null \n");

		/*
		 * Wrapper object override the toString() ,hashCode() we cannot use toString()
		 * ,hashCode() for primitive type
		 */

		/*
		 * char character1 = 'a' ; 
		 *System.out.println( ch.hashCode() ); // CTE
		 */

		Character character2 = 'k';
		System.out.println("hashCode() for character2 " + character2);

	}

}
