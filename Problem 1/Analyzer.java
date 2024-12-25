package Problem1;
import java.util.Scanner;
public class Analyzer{
	public static void main(String[] args) {
		Data d=new Data();
		
		while(true) {
			System.out.print("Enter number(Q to quit): ");
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			if(s.equals("Q")) {
				System.out.print("Average:"+d.average()+"\n");
				System.out.print("Maximum:"+d.maximum()+"\n");
				System.exit(0);
				
			}
			
			else d.add(Integer.parseInt(s));
		}
	}
}
