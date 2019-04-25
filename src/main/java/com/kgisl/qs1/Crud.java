package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * EmployeeSort
 */
public class Crud {
 static List<Employee1> e=Arrays.asList(new Employee1(20,"ccc","dep1",15000),
                                    new Employee1(18,"bbb","dep3",20000),
                                    new Employee1(38,"aaa","dep3",10000),
                                    new Employee1(39,"ddd","dep4",10000));
 // static Employee a[]=new Employee[3];
 
    public static void main(String[] args) {
   
       selectOption();
    }
    
  private static void selectOption() {
    System.out.println("Enter the Options");
    System.out.println("1.Display\n 2.Remove\n 3.Update");
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Options");
    int option=s.nextInt();
    switch(option){
      case 1:
          display();
          selectOption();
      case 2:
           removes();
           selectOption();
      // case 4:
      //       update();
      //       selectOption();
      // case 4:
      //       update();
      //       selectOption();

    }
  }
  
  public static void display() {
    //for(Employee var:a)
   System.out.println(e);
  }
//   public static void update() {
//     System.out.println("Update");
//     System.out.println("enter Name to update");
//     Scanner s1=new Scanner(System.in);
//     String updateName=s1.next();
//     for(int i=0;i<a.length;i++){
//       if(updateName.equals(a[i])){
//           a[i]=updateName;
//           break;
//       }
//   }
//   }

  public static void removes() {
    System.out.println("Remove");
   
  }
}
  

 

  


  