package Problem4;
import java.util.Scanner;

import Practice2.Student;
public class GradeBookTest { 
 public static void main(String[] args) {
     
      GradeBook Course = new GradeBook("Object-Oriented Programming and Desingn","CSCI 2106","CSCI 1203",5);
      System.out.println( Course.displayMessage());
      
      Student THEbest = new Student("A",100,111);
      Student outsider = new Student("Z",0,999);
   
            GradeBook g = new GradeBook();
      
            System.out.println("Please,input grades and enter S to stop and see results:");
            while(true) {
             System.out.print("Student:");
             Scanner input = new Scanner(System.in);
             String s = input.next();
             
             if(s.equals("S")) {
                 System.out.println("Class average is " + g.average());
                 
                 if(g.min()==0)
                    System.out.println("Lowest grade is " + g.min()+" "+outsider);
                 else 
                System.out.println("Lowest grade is " + g.min()+" (id:unknown)");
                 
                 
                 if(g.max()==100)
                  System.out.println("Highest grade is  " + g.max()+" "+THEbest);
                else 
                System.out.println("Highest grade is " + g.max()+" (id:unknown)");
                g.outputBarChart();
                System.exit(0);
             }
             else {
              g.adding(Integer.parseInt(s));
             }
            }
}
}
