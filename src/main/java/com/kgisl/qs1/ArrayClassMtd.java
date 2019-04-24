package com.kgisl.qs1;

import java.util.Arrays;
import java.util.List;

/**
 * ArrayClassMtd
 */
public class ArrayClassMtd {

    public static void main(String[] args) {
        List<Employee> e=Arrays.asList(new Employee(20,"ccc",15000),
                                        new Employee(18,"bbb",20000),
                                         new Employee(38,"aaa",10000));

            Object[] s=e.toArray();
           //List<Employee> e2= Arrays.copyOf(s);
           
    }
}