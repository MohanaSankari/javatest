package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * RemoveDup
 */
public class RemoveDup {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList(Arrays.asList(1, 3, 5, 1, 34, 5, 10));
        Object[] a = l.toArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j]) {
                    a[j]="";
                   
                }
                
                System.out.println(a[i]);
        }
    }

}