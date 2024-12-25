package Problem2;
class DrivingLicense {
	//static and final modifiers
	final int age;
	private int uin=0;
	String name="";
	String surname="";
	Category type;
	static int numofAttempt=0;
	
    //initialization block
	{
		name="Kamila";
		surname="Sakush";
		age=18;
		numofAttempt=1;
		
	}
	
	//this keyword (2 usages)
		public DrivingLicense() {
			numofAttempt++;
		}
		public  DrivingLicense(int uin) {
	        this();
			this.uin=uin;
		}
		
	//overloading	
		public int Results(int theory,int practice) {
			return theory+practice;
		}
		
		public double Results(double theory,double practice) {
		    return theory+practice;}
		
	//read-only 	
		public int getUIN() {
			return uin;
		}
		
		public void setUIN(int uin) {
			this.uin = uin;
		}
		
		public void setType(Category type) {
			this.type=type;
		}
		
		public String toString() {
			return ("The Driving License"+"\n"+"Name:"+this.name+"\n"+"Surname:"+this.surname+"\n"+"Age:"+this.age+"\n"+"UIN:"+this.getUIN()+"\n"+"Results:");
		}
		
	
}

