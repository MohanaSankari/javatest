package com.kgisl.qs1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Total
 */
public class Total {
public static void main(String[] args) {
    

    List<Employee1> e=Arrays.asList(new Employee1(20,"ccc","dep1",15000),
                                    new Employee1(18,"bbb","dep3",20000),
                                    new Employee1(38,"aaa","dep3",10000),
                                    new Employee1(39,"ddd","dep4",10000));
   // Predicate<Employee> p=t->t.
e.stream().map(x->x.getSalary()).reduce(0,Integer::sum);

}
}