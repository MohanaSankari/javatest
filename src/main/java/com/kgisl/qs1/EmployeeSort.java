package com.kgisl.qs1;

import java.util.Arrays;
import java.util.List;


/**
 * EmployeeSort
 */
public class EmployeeSort {
public static void main(String[] args) {
    

    List<Employee> e=Arrays.asList(new Employee(20,"ccc",15000),
                                    new Employee(18,"bbb",20000),
                                    new Employee(38,"aaa",10000));

    e.stream().map(x->x.getEmpId()).sorted().forEach(System.out::println);
    e.stream().map(x->x.getName()).sorted().forEach(System.out::println);   
    e.stream().map(x->x.getSalary()).sorted().forEach(System.out::println);
}
}