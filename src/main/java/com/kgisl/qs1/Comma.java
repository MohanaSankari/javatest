package com.kgisl.qs1;

import java.util.Arrays;

/**
 * Comma
 */
public class Comma {

    public static void main(String[] args) {
        String commaSeparated = "item1 , item2 , item3";
        String[] a=commaSeparated.split(",");
        System.out.println(Arrays.toString(a));
    }
}