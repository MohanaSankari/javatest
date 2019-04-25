package com.kgisl.qs1;

import java.util.Scanner;

/**
 * Bill
 */
public class Bill {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Customer IDNO ");
        int id=s.nextInt();
        System.out.println("Enter Customer Name ");
        String name=s.next();
        System.out.println("Enter the Unit Consumed ");
        double unit=s.nextFloat();
        System.out.println("Amount Charged");
        if(unit<200){
            double amont=unit*1.20;
            System.out.println(amont);
            
        }
        else if(unit>200 && unit<400){
            double amont=unit*1.50;
            System.out.println(amont);
            
        }
        else if(unit>400 && unit<600){
            double amont=unit*1.80;
            System.out.println(amont);
        }
        // else if(unit>600){
        //     double amont=unit*2.00;
        //     System.out.println(amont);
        // }
        
        if(unit>600){

            double amont=unit*2.00;
            System.out.println(amont);
            double a=amont*0.15;
            System.out.println("Surcharge Charged="+a);
            double net=a+amont;
            System.out.println("Net Amount ="+net);

        }
    }
}