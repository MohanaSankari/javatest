package com.kgisl.qs1;
class Child extends Block{

    Child(){
        System.out.println("Child constructor Block");
    }
    static{
        System.out.println("Child static block");
    }
    {
        System.out.println("Child Normal Block");
    }
      public static void main(String[] args) {
          new Child();
      }
  }