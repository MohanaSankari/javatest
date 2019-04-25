package com.kgisl.qs1;

import java.util.Scanner;

/**
 * Game
 */
public class Game {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=s.nextInt();
      if(n<100){
        for(int i=0;i<3;i++){
            n=n*2;
            System.out.println(n);
        }
      }
      
      else if(n>100){
        for(int i=0;i<3;i++){
            n=n/2;
            System.out.println(n);
        }
      }
    }
}