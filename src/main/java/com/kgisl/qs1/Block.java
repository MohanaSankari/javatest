package com.kgisl.qs1;

/**
 * Block
 */
public class Block {
  Block(){
      System.out.println("Parent Constructor Block");
  }
  static{
      System.out.println("Parent Static block");

  }
  {
      System.out.println("Parent Normal Block");
  }
}
  