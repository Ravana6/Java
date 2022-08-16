package com.josh.java.training.javafeatures.methodreferences.instancemethod;
import java.util.Arrays;
import java.util.List;

public class InstanceMethod {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee("karthik",23, 120000),new Employee("ramesh",5, 100000));

        // anonymous class
        /*list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return provider.compareBySalary(o1, o2);
            }
        });*/

        ComparatorProvider provider = new ComparatorProvider();

        // lambda
        // list.sort((o1, o2) -> provider.compareBySalary(o1, o2));

        // method reference
        list.sort(provider::compareBySalary);

//        list.forEach(x -> System.out.println(x));
        
        //method reference
        list.forEach( System.out::println);

    }

}