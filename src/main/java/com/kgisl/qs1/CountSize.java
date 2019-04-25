package com.kgisl.qs1;

import java.util.Scanner;

/**
 * CountSize
 */
public class CountSize {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String firstName=s.nextLine();
        String lastName=s.nextLine();
        System.out.println("Your first name has "+firstName.length()+"  characters");
        System.out.println("YourLastname has "+lastName.length()+" characters ");
        System.out.println("Enter Your Speed in mph: ");
        float speed=s.nextFloat();
        System.out.println("Enter Your distance in Miles:");
        float distance=s.nextFloat();
        float time=distance/speed;
//         At 58 mph, it will take 11.336206896551724 hours
//           to travel 657.5 miles.
    System.out.println("At "+speed+" mph"+", it will take"+time +" hours to travel "+distance+" miles");
        
    }
}