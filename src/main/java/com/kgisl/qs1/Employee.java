package com.kgisl.qs1;

/**
 * Employee
 */
public class Employee {

    int empId;
  String name;
   float salary;
   Employee(int empId,String name,float salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
   }
   /**
    * @return the empId
    */
   public int getEmpId() {
       return empId;
   }
   /**
    * @param empId the empId to set
    */
   public void setEmpId(int empId) {
       this.empId = empId;
   }
   /**
    * @return the name
    */
   public String getName() {
       return name;
   }
   /**
    * @param name the name to set
    */
   public void setName(String name) {
       this.name = name;
   }
   /**
    * @return the salary
    */
   public float getSalary() {
       return salary;
   }
   /**
    * @param salary the salary to set
    */
   public void setSalary(float salary) {
       this.salary = salary;
   }
   public String toString(){
       return empId+","+name+","+salary;
   }
}