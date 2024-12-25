package Classes;
import java.util.*;
import java.io.*;
public class Database {

	protected static ArrayList<Student> students = new ArrayList<>();
	protected static ArrayList<News> news = new ArrayList<>();
	protected static ArrayList<Employee> employee = new ArrayList<>();
	protected static ArrayList<Teacher> teacher = new ArrayList <>();
	protected static ArrayList<Admin2> admin = new ArrayList <>();
	protected static ArrayList<Manager> manager = new ArrayList <>();
	protected static ArrayList<Course> courses = new ArrayList<>();
	protected static ArrayList<String> sms = new ArrayList<>();
	
	protected static HashMap <Student, Double> allGPA = new HashMap<>();
	protected static HashMap <Student, Integer> allGrade = new HashMap<>();
	protected static HashMap <Student, String> allLetterGrade = new HashMap<>();
	
	
	public static ArrayList<Student> getStudents() {
		return students;
	}
	public static void setStudents(ArrayList<Student> students) {
		Database.students = students;
	}
	public static ArrayList<News> getNews() {
		return news;
	}
	public static void setNews(ArrayList<News> news) {
		Database.news = news;
	}
	public static ArrayList<Teacher> getTeachers() {
		return teacher;
	}
	public static void setTeachers(ArrayList<Teacher> teachers) {
		Database.teacher = teachers;
	}
	public static ArrayList<Course> getCourses() {
		return courses;
	}
	public static void setCourses(ArrayList<Course> courses) {
		Database.courses = courses;
	}

	
	 private static void saveNews() {
	        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("news.txt"))) {
	            oot.writeObject(news);
	            oot.flush();
	        }
	        catch (IOException e) {
	            System.err.println("news.txt: IOException");
	        }
	    }
	 private static void saveCourses() {
	        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("courses.txt"))) {
	            oot.writeObject(courses);
	            oot.flush();
	        }
	        catch (IOException e) {
	            System.err.println("courses.txt: IOException");
	        }
	    }
	 
	 private static void loadCourses(){
	    	try {
	    		FileInputStream fis = new FileInputStream("courses.txt");
	    		ObjectInputStream oin = new ObjectInputStream(fis); 
	            courses = (ArrayList<Course>) oin.readObject();
	            oin.close();
	            fis.close();
	        }
	        catch (ClassNotFoundException e) {
	            courses = new ArrayList<>();
	            System.err.println("courses.txt: ClassNotFoundException");
	        }
	        catch (IOException e) {
	            courses = new ArrayList<>();
	            System.err.println("courses.txt: IOException");
	        }
	    }
	 private static void loadNews(){
	    	try {
	    		FileInputStream fis = new FileInputStream("news.txt");
	    		ObjectInputStream oin = new ObjectInputStream(fis); 
	            news = (ArrayList<News>) oin.readObject();
	            oin.close();
	            fis.close();
	        }
	        catch (ClassNotFoundException e) {
	            news = new ArrayList<>();
	            System.err.println("courses.txt: ClassNotFoundException");
	        }
	        catch (IOException e) {
	            news = new ArrayList<>();
	            System.err.println("courses.txt: IOException");
	        }
	    }
	 private static void saveStudents() {
	        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("students.txt"))) {
	            oot.writeObject(students);
	            oot.flush();
	        }
	        catch (IOException e) {
	            System.err.println("students.txt: IOException");
	        }
	    }
	 
	 private static void loadStudents(){
	    	try {
	    		FileInputStream fis = new FileInputStream("students.txt");
	    		ObjectInputStream oin = new ObjectInputStream(fis); 
	            students = (ArrayList<Student>) oin.readObject();
	            oin.close();
	            fis.close();
	        }
	        catch (ClassNotFoundException e) {
	            students = new ArrayList<>();
	            System.err.println("courses.txt: ClassNotFoundException");
	        }
	        catch (IOException e) {
	            students = new ArrayList<>();
	            System.err.println("courses.txt: IOException");
	        }
	    }
	 private static void saveEmployees() {
	        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("employees.txt"))) {
	            oot.writeObject(employees);
	            oot.flush();
	        }
	        catch (IOException e) {
	            System.err.println("students.txt: IOException");
	        }
	    }
	 
	 private static void loadEmployee(){
	    	try {
	    		FileInputStream fis = new FileInputStream("students.txt");
	    		ObjectInputStream oin = new ObjectInputStream(fis); 
	            employees = (ArrayList<Employee>) oin.readObject();
	            oin.close();
	            fis.close();
	        }
	        catch (ClassNotFoundException e) {
	           employees = new ArrayList<>();
	            System.err.println("courses.txt: ClassNotFoundException");
	        }
	        catch (IOException e) {
	            employees = new ArrayList<>();
	            System.err.println("courses.txt: IOException");
	        }
	    }
	 
	 private ArrayList<Employee>addEmployee(){
		for(Teacher t : teacher) {
			employee.add(t);
		}
		for()
		
		return employee;
	 }
	 
}
