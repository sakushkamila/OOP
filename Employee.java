package Classes;

import java.util.Date;

public class Employee extends User implements Cloneable,Comparable<Employee>{
	
	protected static double salary;

	
	Employee(){}
	
	Employee(String ID, String name, String surname, String fathername,String login, String password, String email, Date date, double salary){
		super(name, surname, fathername, login, password, email, date);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Object clone() throws CloneNotSupportedException {
		Employee s = (Employee)super.clone();
		s.salary = (double)this.clone();
		
		return s;

	}
	
	@Override
	public int compareTo(Employee o) {
		if(o.salary > this.salary) return 1;
		if(o.salary < this.salary) return -1;

		return 0;
	}

}
