package Classes;

import java.util.ArrayList;

public class Course {
	
	public String courseName;
	public String courseID;
	public Integer credits;
	public String prerequisite;
	public String info;
	public int enrollment;
	public int capacity;
	boolean registrationStatus;
	public ArrayList<Course> studentCourses;
	public  ArrayList<String> studentID;
	public String Teacher;
    
	Course(){
		
	}
	
	Course(String coursename, String courseID, String t, Integer credits, String prereq, String info){
		this.courseName = coursename;
		this.courseID = courseID;
		this.Teacher = t;
		this.credits = credits;
		this.prerequisite = prereq;
		this.info = info;
	}
	
	public String getCoursename() {
		return courseName;
	}
	
	public String getCourseID() {
		return courseID;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public String getPrereq() {
		return prerequisite;
	}
	
	public String getInfo() {
		return info;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getEnrollment() {
		return enrollment;
	}
	
	public  ArrayList<String> getStudents() {
		return studentID;
	}

	public void setStudents(ArrayList<String> students) {
		this.studentID = students;
	}
	
	public ArrayList<Course> getStudentCourses() {
		return studentCourses;
	}
	public void setStudentCourses(ArrayList<Course> studentCourses) {
		this.studentCourses = studentCourses;
	}
	
	public void AddStudent(String ID) {
		
		try {
		for (String c : studentID) {
			if(!c.equals(ID)) {
				studentID.add(ID);
				registrationStatus = true;
				enrollment++;
				System.out.println("Successfully be registred!");
			}
		}}
		
		catch (Exception e) {	
		
		if (enrollment > capacity) {
			registrationStatus = false;
			System.out.println("Sorry this course is full.");}
		}}
	
	public void RemoveStudent(String ID) {
         studentID.remove(ID);
			enrollment--;
	}
	
	public String toString() {
		
		return "CourseName:" + getCoursename()+ "\nCourseID:" + getCourseID() + "\nCredits number:" + getCredits()+
				"\nPrerequisite:" + getPrereq() + "\nCourse Info:" + getInfo() + "\nMax number of students:"+getCapacity();
	}
	
	
	
	
}
