package com.kgisl.qs1;

import java.util.Scanner;

/**
 * Conversion
 */
public class Conversion {
   
    static double m=10.00 ;
    static double k=10.00 ;
    public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    // System.out.println(" Enter the miles");
    // float m=s.nextFloat();
    // System.out.println(" Enter the kilometer");
    // float k=s.nextFloat();
   // Conversion e=new Conversion();
      selectOption();
       
    }

    public static void selectOption() {
        
        System.out.println("Type a letter to select a conversion table ");
        Scanner s=new Scanner(System.in);
        int option=s.nextInt();
        switch(option){
            case 1:
              mtokm();
              selectOption();
            case 2:
              kmtom();
              selectOption();
              break;  
        }
    }

    public static void kmtom() {
        System.out.println("km to miles is=" + k / 1.6);
    }

    public static void mtokm() {
       
        System.out.println("mile to km is=" + m * 1.6);
    }
    
}