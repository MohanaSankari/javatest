package com.kgisl.qs1;

/**
 * Employee
 */
public class Employee1 {

    int empId;
  String name;
  String dept;
   float salary;
   Employee1(int empId,String name,String dept,float salary){
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
   /**
    * @param dept the dept to set
    */
   public void setDept(String dept) {
       this.dept = dept;
   }
   /**
    * @return the dept
    */
   public String getDept() {
       return dept;
   }
   public String toString(){
       return empId+","+name+","+dept+","+salary;
   }
}