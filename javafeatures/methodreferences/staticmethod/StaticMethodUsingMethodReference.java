package com.josh.java.training.javafeatures.methodreferences.staticmethod;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StaticMethodUsingMethodReference {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C");

        // anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String x) {
                SimplePrinter.print(x);
            }
        });

        // lambda expression
        System.out.println("\nusing lambda expression");
        list.forEach(x -> SimplePrinter.print(x));

        // method reference
		/*
		 * This example converts a list of Strings into a list of Integers, method
		 * reference to a static method Integer::parseInt.
		 */
        System.out.println("using method reference");
        list.forEach(SimplePrinter::print);

    }

}

class SimplePrinter {
    public static void print(String str) {
        System.out.println(str);
    }
}