package com.josh.java.training.javafeatures.methodreferences.defaultconstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceForConstructor {

	 public static void main(String[] args) {

	        List<BigDecimal> list = Arrays.asList(
	                BigDecimal.valueOf(9.99),
	                BigDecimal.valueOf(2.99),
	                BigDecimal.valueOf(8.99));

	        // lambda
	        // List<Invoice> invoices = fakeInvoice(list, (price) -> new Invoice(price));

	        // method reference
	        List<Invoice> invoices = fakeInvoice(list, Invoice::new);

	        invoices.forEach(System.out::println);
	    }

	    static List<Invoice> fakeInvoice(List<BigDecimal> list, Function<BigDecimal, Invoice> func) {
	        List<Invoice> result = new ArrayList<>();

	        for (BigDecimal amount : list) {
	            result.add(func.apply(amount));
	        }
	        return result;
	    }

}