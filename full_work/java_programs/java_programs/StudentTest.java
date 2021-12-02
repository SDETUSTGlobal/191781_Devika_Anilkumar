import java.io.*;
public class StudentTest {

   public static void main(String args[]) {
      /* Create two objects using constructor */
    Student1 empOne = new Student1("James Smith");
     Student1 empTwo = new Student1("Mary Anne");
	 Student1 empThree = new Student1("Devika");

      // Invoking methods for each object created
      empOne.empAge(20);
      empOne.empMarks(70);
     
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empMarks(78);
      
      empTwo.printEmployee();
	  
	   empThree.empAge(19);
      empThree.empMarks(88);
     
      empThree.printEmployee();
   }
}