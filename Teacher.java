package Classes;

import java.util.ArrayList;
import java.util.Vector;

public class Teacher extends Employee {
	   String lecturerId;
       Teachers type;
       Faculty faculty;
       AcademicDegree degree;
       Vector <Course> course = new Vector <Course>();
       
       Teacher (){
       }
       
       Teacher(String name, String surname, String login, String password, String email, double salary, String lecturerId){
    	   this.lecturerId = lecturerId;
       }
       
       public Teachers getType() {
    	   return type;
       }
       
       public String getlecturerId() {
    	   return lecturerId;
       }

       public void addNewTeacher(Teacher t) {
   		// TODO Auto-generated method stub
   		Teacher newTeacher = (Teacher) t ;
   		if(!checkUser(t)) {
   			Database.teacher.add(newTeacher);
   			Database.employee.add(newTeacher);
   			System.out.println("A new student added");
   		}
   		else {
   			System.out.println("Such student exists in a data");
   		}
	   	}
	   	
	   	public boolean checkUser(Object o) {											//checker for a new person
	   		if (this == o) return true;
	   		if (o == null || getClass() != o.getClass()) return false;
	   		
	   		Teacher otherUser = (Teacher) o;
	   		
	   			if(Database.teacher.size() != 0) {												// Check if this person exists
	   				for(int j = 0; j < Database.teacher.size(); j++) {							// Check cloning
	   					if(Database.teacher.get(j) == otherUser) {
	   						return true;
	   					}
	   				}
	   			}
	   			return false;
	   	}
       
       
}
