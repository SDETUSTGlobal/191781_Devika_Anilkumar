import java.io.*;
public class Student1 {
   String name;
   int age;
   int marks;
   
   public Student1(String name) {
      this.name = name;
   }

  
   public void empAge(int empAge) {
      age = empAge;
   }

   
   public void empMarks(int m) {
      marks = m;
   }

   
   

   
   public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Marks:" + marks );
     
   }
}