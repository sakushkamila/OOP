package Problem2;

public class DrivingLicenseTest {

	public static void main(String[] args) {
		
     DrivingLicense d= new DrivingLicense();
     d.setUIN(1001);
     d.type=Category.B1;
     int t=40;
     int p=100;
     
     
     System.out.println(d.toString()+d.Results(t,p)+" points\n"+"Category:"+d.type);
     
	}

}
