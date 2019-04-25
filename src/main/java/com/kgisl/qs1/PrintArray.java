package com.kgisl.qs1;

import java.util.Arrays;

/**
 * PrintArray
 */
public class PrintArray {
public static void main(String[] args) {
    

    String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
    System.out.println(Arrays.deepToString(deepArray));
}
}