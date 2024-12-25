package Classes;

public class BasicInformation implements ViewPersonalInfo {

	@Override
	public void view(Object o) {
		
		if(o == (Student)o) {
			Student s1 = (Student)o;
			System.out.println("ID:" + s1.getId()+"\nLogin:"+s1.getLogin()+"\nSurname:"+s1.getLastName()+"\nName:"+s1.getName()+
					"\nFathername:"+s1.getFatherName()+"\nDate of birth:"+s1.dateofBirthday()+"\nEmail:"+s1.getEmail()+"\nLevel:"+s1.getDegree());
		}
		
		if(o == (Teacher)o) {
			Teacher s2 = (Teacher)o;
			System.out.println("ID:" + s2.getlecturerId()+"\nLogin:"+s2.getLogin()+"\nSurname:"+s2.getLastName()+"\nName:"+s2.getName()+
					"\nFathername:"+s2.getFatherName()+"\nDate of birth:"+s2.dateofBirthday()+"\nEmail:"+s2.getEmail()+"Type:"+s2.getType());
		}
		
		
	}

	


}
