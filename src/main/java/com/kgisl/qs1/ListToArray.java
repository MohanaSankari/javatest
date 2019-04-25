package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ListToArray
 */
public class ListToArray {
public static void main(String[] args) {
    List<String> l=new ArrayList<String>();
    l.add("aaa");
    l.add("bbb");
    l.add("ccc");
    System.out.println(l);
    Object[] a=l.toArray();
    System.out.println(Arrays.toString(a));
}
    
}