package Classes;

import java.util.ArrayList;
import java.util.Date;


public class Manager extends Employee {
	ManagerType type;
	

	Manager() {
		// TODO Auto-generated constructor stub
	}
	
	Manager(String name, String surname, String login, String password, String email, double salary, String ID){
		super(name,surname,login,password,email,salary,ID);
	}


	Manager(String name, String surname, String login, String password, String email, double salary, String iD) {
		// TODO Auto-generated constructor stub
	}

	public void addNewManager(Manager1 m) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Manager1 newManager = (Manager1) m ;
				if(!checkUser(m)) {
					Database.manager.add(newManager);
					System.out.println("A new manager added");
				}
				else {
					System.out.println("Such manager exists in a data");
				}
	}
	
	public boolean checkUser(Object o) {											//checker for a new person
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Manager1 otherUser = (Manager1) o;
		
			if(Database.manager.size() != 0) {												// Check if this person exists
				for(int j = 0; j < Database.manager.size(); j++) {							// Check cloning
					if(Database.manager.get(j) == otherUser) {
						return true;
					}
				}
			}
			
			return false;
  
	}
	
    }
	
   
