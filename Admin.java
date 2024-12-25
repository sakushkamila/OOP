package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Admin extends User implements SeeUserAction, ManageUser, Update{
		int UserId;
		Admin(String name, String surname, String fathername, String login, String password, String email, Date dateofBirthday, Gender g, int id){
			super();
			this.UserId = id;
			
		}
		ArrayList <Admin> admin = new ArrayList<>();  
	    LinkedList <String> allName = new LinkedList<String>();
		LinkedList <String> allSurname = new LinkedList<String>();
		LinkedList <Integer> allId = new LinkedList<Integer>();
				    
		public ArrayList <Admin> addNewUser(Object o) {              // add a new user in a data
				      if(!checkUser(o) && userRegistrationNotification(o)) {
				        Admin newUser = (Admin) o;
				        allName.add(newUser.name);
				        allSurname.add(newUser.surname);
				        allId.add(newUser.id);
				        admin.add(newUser);
				        System.out.println("A new user added");
				      }
				      else {
				        System.out.println("Such user exists in a data");
				      }
				      System.out.println();
				      return admin;
				    }
				    
				    public ArrayList <Admin> deleteUser(Object o) {                  // delete a user in a data
				      Admin deleteUser = (Admin) o;
				      
//				      for(int i = 0; i < admin.size(); i++) {
//				        Admin newName = admin.get(i);
//				        Admin newSurname = admin.get(i);
//				        Admin newId = admin.get(i);
//				        
//				        if(deleteUser.name == newName.name && deleteUser.surname == newSurname.surname && deleteUser.id == newId.id) {
//				          name=newName.name;
//				          surname=newSurname.surname;
//				          id=newId.id;
//				          break;
//				        }
//				        
//				      }
				      
				      if(checkUser(o)) {
				        Admin newUser = (Admin) o;
//				        allName.remove(name);
//				        allSurname.remove(surname);
//				        allId.remove(id);
				        admin.remove(newUser);
				        System.out.println("This user successfully deleted");
				      }
				      else {
				        System.out.println("This user does not exist in a data");
				      }
				      System.out.println();
				      return admin;
				    }
				    
				    public boolean checkUser(Object o) {                      //checker for a new person
				      if (this == o) return true;
				      if (o == null || getClass() != o.getClass()) return false;
				      
				      boolean boolName = false, boolSurname = false, boolId = false; 
				      Admin otherUser = (Admin) o;
				      
				        if(admin.size() != 0) {                        // Check if this person exists
				          for(int j = 0; j < admin.size(); j++) {              // Check cloning
//				              Admin newName = admin.get(j);
//				              Admin newSurname = admin.get(j);
//				              Admin newId = admin.get(j);
				              
//				              if(deleteUser.name == newName.name && deleteUser.surname == newSurname.surname && deleteUser.id == newId.id) {
//				                name=newName.name;
//				                surname=newSurname.surname;
//				                id=newId.id;
//				                break;
//				              }
				              
//				            if(allName.get(j) == otherUser.name) {
//				              newName = true;
//				            }
//				            if(allSurname.get(j) == otherUser.surname) {
//				              newSurname = true;
//				            }
//				            if(allId.get(j) == otherUser.id) {
//				              newId = true;
//				            }
				            if(admin.get(j) == otherUser) {
				              return true;
				            }
				          }
				        }
				        
				        return false;
				        
//				        if(newName == false && newSurname == false && newId == false) {
//				          return false;
//				        }
//				        else if(newName == true && newSurname == false && newId == false) {
//				          return false;
//				        }
//				        else if(newName == false && newSurname == true && newId == false) {
//				          return false;
//				        }
//				        else {
//				          return true;
//				        }
				    }                                        //end of the checking
]
				public ArrayList <Admin> showUserList() {                         // method to show all users
				        System.out.println("Name:"+ "\t Surname:" + "\t Id:");
				        for(int i = 0; i < admin.size(); i++) {
				          Admin newName = admin.get(i);
				          Admin newSurname = admin.get(i);
				          Admin newId = admin.get(i);
				          System.out.println(newName.name+"\t  "+ newSurname.surname +"\t\t " + newId.id) ;
				        }
				        System.out.println();
				        return admin;
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
				public boolean userRegistrationNotification(Object o) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public boolean findUserById(int id) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public void showUserAction() {
					// TODO Auto-generated method stub
					
				}
			
			
			
			
			
		
}
