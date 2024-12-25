package Problem3;

public class TemperatureTest {

	public static void main(String[] args) {
		
		Temperature t=new Temperature();
		
		t.setScale('F');
		t.setValue(78);
		
		Temperature t2=new Temperature(100);
		Temperature t3=new Temperature(88,'C');
			
		Temperature t4=new Temperature();
		double w=60.0;
		
		System.out.print(t.toString()+"\n");
		System.out.print(t2.toString()+"\n");
		System.out.print(t3.toString()+"\n");
        System.out.print("Temperature:"+t4.getCelcius(w, 'F')+" "+t4.getScale());
	}

}