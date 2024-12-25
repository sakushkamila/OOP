package Classes;

import java.io.IOException;

public interface StudentInterface extends ViewPersonalInfo {
	
	public void studentViewAllCourses();
	public void registerToCourse () throws IOException;
	public void withdrawFromCourse() throws IOException;
	public void viewAllRegisteredCourses();


}
