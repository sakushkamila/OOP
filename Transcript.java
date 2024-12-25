package Classes;

import java.awt.font.GlyphVector;
import java.util.HashMap;
import java.util.Vector;

import Classes.Database;
import Classes.Student;
import Marks.Semester;

public class Transcript extends Marks{
	
	Transcript(double grade) {
		super(grade);
		// TODO Auto-generated constructor stub
	}
	
	Transcript(){
		
	}
	
	Semester semester;
	
	public HashMap <Student, Double> getGPA(){
		if(Database.allGPA.size() != 0) {
			for(int i = 0; i < Database.allGPA.size(); i++) {
				Database.getKey()
			}
		}
		else {
			System.out.println("No GPA, List empty");
		}
		return Database.allGPA;
	}
	
	public int getAtt1() {
		
	}
	
	public int getAtt1() {
		
	}
}
