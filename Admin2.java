package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import Admin.Admin;
import Admin.ManageUser;
import Admin.SeeUserAction;
import Admin.Update;

public class Admin2 extends Employee implements SeeUserAction, ManageUser, Update{
	String UserId;
	String sms;
	
	
	Admin2(String ID, String name, String surname, String fathername, String login, String password, double salary) {
	super();
	}
	
	Admin2(){
		
	}
   
	public static void userActionStudent(Student s) throws IOException, ParseException { // Transcript // News (o)// update password // student information // Attandance 
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("/n 1)Transcript /n 2)News /n 3)Update password /n 4)Student information /n 5)Attandance");
		int choice = Integer.parseInt(input.readLine());
		if(choice == 1) {
			
			
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			if(choice == 1) {
				userActionStudent(s);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
			
		}
		else if(choice == 2) {
			
			Database.getNews();
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			if(choice == 1) {
				userActionStudent(s);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
			
		}
		else if(choice == 3) {
			for(Student st : Database.students) {
				if(st == s) {
					System.out.println("Put new password:");
					String pass = (input.readLine());
					st.password = pass;
					System.out.println();
					System.out.println("New password successfully changed");
				}
			}
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			if(choice == 1) {
				userActionStudent(s);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
			
		}
		else if(choice == 4) {
			for(Student st : Database.students) {
				if(st == s) {
					System.out.println("/tStudent information");
					System.out.println("Name:" + st.name);
					System.out.println("Surname:" + st.surname);
					System.out.println("Course:" + st.courseName);
//					System.out.println("Average Gpa:" + st.getGPA);
				}
			}
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			if(choice == 1) {
				userActionStudent(s);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
			
		}
		else if(choice == 5) {
			
			
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			if(choice == 1) {
				userActionStudent(s);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
			
		}
	}
	
	public static void userActionEmployee(Employee e) throws IOException, ParseException {	// Student information // write sms // check Database // Show salary // employee information 
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("/n 1)Students information /n 2)News /n 3)Write sms /n 4)Check Database /n 5)Show salary /n 6)Employee information");
		int choice = Integer.parseInt(input.readLine());
		if(choice == 1) {
			
			showStudesntList();
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			if(choice == 1) {
				userActionEmployee(e);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
		}
		else if(choice == 2) {
			
			Database.getNews();
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			
			if(choice == 1) {
				userActionEmployee(e);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
			
		}
		else if(choice == 3) {
			
			
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			if(choice == 1) {
				userActionEmployee(e);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
		}
		else if(choice == 4) {
			
			
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			if(choice == 1) {
				userActionEmployee(e);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
		}
		else if(choice == 5) {
			
			for(Employee emp : Database.employee) {
				if(emp == e) {
					System.out.println("Your salary is:" + emp.salary);
				}
			}
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			if(choice == 1) {
				userActionEmployee(e);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
		}
		else if(choice == 6) {
			
			
			
			System.out.println();
			System.out.println("1)Back /n 2)Exit");
			choice = Integer.parseInt(input.readLine());
			if(choice == 1) {
				userActionEmployee(e);
			}
			else if(choice == 2) {
				System.out.println("Program shuts down");
			}
		}
	}
   
   public static void addStudent() throws IOException, ParseException {
	   BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	   
	   System.out.println("Enter student Name:");
	   String Name = input.readLine();
	   System.out.println("Enter student Surname:");
	   String Surname = input.readLine();
	   System.out.println("Enter student login:");
	   String login = input.readLine();
	   System.out.println("Enter student password:");
	   String password = input.readLine();
	   System.out.println("Enter student email:");
	   String email = input.readLine();
	   System.out.println("Enter student birth date:");
	   String Bday = input.readLine();
	   Date birthDay = new SimpleDateFormat("dd.MM.yyyy").parse(Bday);
	   System.out.println("Enter student ID:");
	   String ID = input.readLine();
	   System.out.println("Enter student year of study:");
	   int year = Integer.parseInt(input.readLine());
	   
	   Student s1 = new Student(ID,Name, Surname, login, password, email, birthDay,year);
	   Student newStudent = new Student();
	   
	   newStudent.addNewStudent(s1);
	   
	   userActionStudent(s1);
	   
   }
   
   
   public static void addTeacher() throws IOException, ParseException {
	   BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	   
	   System.out.println("Enter teacher Name:");
	   String Name = input.readLine();
	   System.out.println("Enter teacher Surname:");
	   String Surname = input.readLine();
	   System.out.println("Enter teacher login:");
	   String login = input.readLine();
	   System.out.println("Enter teacher password:");
	   String password = input.readLine();
	   System.out.println("Enter teacher email:");
	   String email = input.readLine();
	   System.out.println("Enter teacher birth date:");
	   String Bday = input.readLine();
	   Date birthDay = new SimpleDateFormat("dd.MM.yyyy").parse(Bday);
	   System.out.println("Enter teacher ID:");
	   String ID = input.readLine();
	   System.out.println("Enter teacher salary:");
	   double salary = Double.parseDouble(input.readLine());
	   
	   Teacher t1 = new Teacher (Name, Surname, login, password, email, salary, ID);
	   Teacher newTeacher = new Teacher();
	   
	   newTeacher.addNewTeacher(t1);
	   
	   userActionEmployee(t1);
	   
   }
   
   public static void addAdmin() throws IOException, ParseException {
	   BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	   
	   System.out.println("Enter teacher Name:");
	   String Name = input.readLine();
	   System.out.println("Enter admin Surname:");
	   String Surname = input.readLine();
	   System.out.println("Enter admin login:");
	   String login = input.readLine();
	   System.out.println("Enter admin password:");
	   String password = input.readLine();
	   System.out.println("Enter admin email:");
	   String email = input.readLine();
	   System.out.println("Enter admin birth date:");
	   String Bday = input.readLine();
	   Date birthDay = new SimpleDateFormat("dd.MM.yyyy").parse(Bday);
	   System.out.println("Enter admin ID:");
	   String ID = input.readLine();
	   System.out.println("Enter admin salary:");
	   double salary = Double.parseDouble(input.readLine());
	   
	   Admin2 ad1 = new Admin2 (ID,Name, Surname, login, password, email, salary);
	   Admin2 newAdmin = new Admin2();
	   
	   newAdmin.addNewAdmin(ad1);
	   
	   userActionEmployee(ad1);
	   
   }
   
//   public static void addManager() throws IOException, ParseException {
//	   BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//	   
//	   System.out.println("Enter manager Name:");
//	   String Name = input.readLine();
//	   System.out.println("Enter manager Surname:");
//	   String Surname = input.readLine();
//	   System.out.println("Enter manager login:");
//	   String login = input.readLine();
//	   System.out.println("Enter manager password:");
//	   String password = input.readLine();
//	   System.out.println("Enter manager email:");
//	   String email = input.readLine();
//	   System.out.println("Enter manager birth date (dd.MM.yyyy):");
//	   String Bday = input.readLine();
//	   Date birthDay = new SimpleDateFormat("dd.MM.yyyy").parse(Bday);
//	   System.out.println("Enter manager ID:");
//	   String ID = input.readLine();
//	   System.out.println("Enter manager salary:");
//	   double salary = Double.parseDouble(input.readLine());
//	   
//	   Manager m1 = new Manager (Name, Surname, login, password, email, salary, ID);
//	   Manager newManager = new Manager();
//	   
//	   newManager.addNewManager(m1);
   
//     userActionEmployee(m1)
//	   
//   }
   
   
   public static void addUser() throws IOException, ParseException {
	   BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("\n 1) Admin \n 2) Student  \n 3) Teacher  \n 4) Manager \n 5) Exit");
				int choice = Integer.parseInt(input.readLine());
				
				if(choice == 1){
					addAdmin();
				}
				else if(choice == 2){
					addStudent();
				}
				else if(choice == 3){
					addTeacher();
				}
//				else if (choice == 4) {
//					addManager();
//				}
				else if(choice == 5){
					System.out.println("Program shuts down");
				}
   }
   
   public ArrayList<Admin2> addNewAdmin(Admin2 ad) {
		// TODO Auto-generated method stub
		Admin2 newAdmin = (Admin2) ad ;
		if(!checkUser(ad)) {
			Database.admin.add(newAdmin);
			Database.employee.add(newAdmin);
			System.out.println("A new admin added");
		}
		else {
			System.out.println("Such admin exists in a data");
		}
		return Database.admin;
	}
	
	public boolean checkUser(Object o) {											//checker for a new person
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Admin2 otherUser = (Admin2) o;
		
			if(Database.admin.size() != 0) {												// Check if this person exists
				for(int j = 0; j < Database.admin.size(); j++) {							// Check cloning
					if(Database.admin.get(j) == otherUser) {
						return true;
					}
				}
			}
			
			return false;
  
	}
	
	public static void showStudesntList() { 												// method to show all students
		System.out.println("Name:"+ "\t Surname:" + "\t Id:");
		for(int i = 0; i < Database.students.size(); i++) {
			Student newName = Database.students.get(i);
			Student newSurname = Database.students.get(i);
			Student newId = Database.students.get(i);
			System.out.println(newName.name+"\t  "+ newSurname.surname +"\t\t " + newId.id) ;
		}
		System.out.println();
	}
	
	public void showTeacherList() { 												// method to show all teachers
		System.out.println("Name:"+ "\t Surname:" + "\t Id:");
		for(int i = 0; i < Database.teacher.size(); i++) {
			Teacher newName = Database.teacher.get(i);
			Teacher newSurname = Database.teacher.get(i);
			Teacher newId = Database.teacher.get(i);
			System.out.println(newName.name+"\t  "+ newSurname.surname +"\t\t " + newId.id) ;
		}
		System.out.println();
	}
	
	public void showManagerList() { 												// method to show managers
		System.out.println("Name:"+ "\t Surname:" + "\t Id:");
		for(int i = 0; i < Database.manager.size(); i++) {
			Manager newName = Database.manager.get(i);
			Manager newSurname = Database.manager.get(i);
			Manager newId = Database.manager.get(i);
			System.out.println(newName.name+"\t  "+ newSurname.surname +"\t\t " + newId.id) ;
		}
		System.out.println();
	}
	
	public void showAdminList() { 												// method to show all admins
		System.out.println("Name:"+ "\t Surname:" + "\t Id:");
		for(int i = 0; i < Database.admin.size(); i++) {
			Admin2 newName = Database.admin.get(i);
			Admin2 newSurname = Database.admin.get(i);
			Admin2 newId = Database.admin.get(i);
			System.out.println(newName.name+"\t  "+ newSurname.surname +"\t\t " + newId.id) ;
		}
		System.out.println();
	}
	
//	public void deleteUser(Object o) {									// delete a user in a data
//		Admin deleteUser = (Admin) o;
//		if(checkUser(o)) {
//			Admin newUser = (Admin) o;
//			admin.remove(newUser);
//			System.out.println("This user successfully deleted");
//		}
//		else {
//			System.out.println("This user does not exist in a data");
//		}
//		System.out.println();
//		return admin;
//	}
	
	public ArrayList<String> writeSms(String sms) {
		Database.employee.add(sms);
		return Database.sms;
		
	}

	@Override
	public HashMap<Integer, String> updateInfo(int key, String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<Integer, String> getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void viewUserInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewUserInfo(Object o) {
		// TODO Auto-generated method stub
		
		Admin userInfo = (Admin) o;
		
		for(Admin ad : admin) {
			if(ad.equals(userInfo)) {
				System.out.println("Name:" + userInfo.name);
				System.out.println("Surname:" + userInfo.surname);
				System.out.println("Id:" + userInfo.id);
				System.out.println();
				System.out.println("\tUser description");
				System.out.println(userInfo.userDescription);
			}
		}
		
	}

	@Override
	public boolean userRegistrationNotification(Object o) {
		// TODO Auto-generated method stub
		if(o != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean findStudentById(int id) {
		// TODO Auto-generated method stub
		for(int i = 0; i < Database.students.size(); i++) {
			Student st = Database.students.get(i);
			if (st.id == id) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void showUserAction() {
		// TODO Auto-generated method stub
		
	}
	
	
	
   
}


