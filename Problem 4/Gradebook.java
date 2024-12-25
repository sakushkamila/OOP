package Problem4;
import java.util.Vector;
import Practice2.Student;
public class GradeBook{
 
 public String name;
 public String code;
 public String prereqCode;
 public int credit;
 
 public double Sum;
 public int Max;
 public int Min;
 public int cnt;
 
 
 private String[] grades = {"00-09:","10-19:","20-29:","30-39:","40-49:","50-59:","60-69:","70-79:","80-89:","90-99:","100:"};
 Vector <Integer> students = new Vector<Integer>();
 
 //for Course object
 public GradeBook() { 
 }
 public GradeBook(String name,String code,String prereqCode,int credit) {
  this.name = name;
  this.code = code;
  this.prereqCode = prereqCode;
  this.credit = credit;
 }
 
    public String toString() {
     return code +" "+name+" with the prerequisite:"+prereqCode+" and number of credit:"+credit;
     }
    
    
    public String displayMessage() {
      return "Welcome to the gradebook for  " + toString();
     }
    public void adding(int value) {
      students.add(value);
      Sum+=value;
      cnt++;
      if(cnt==1) {
       Max = Integer.MIN_VALUE;
       Max = Math.max(value, Max);
       
       Min = Integer.MAX_VALUE;
       Min = Math.min(value, Min);
      }
      else {Max = Math.max(value, Max);
           Min = Math.min(value, Min);} 
 }
 
 public double average() {
        return Sum/cnt;
 } 
 public int max() {
  return Max;
 }
 
 public int min() {
  return Min;
 }  
 
 public void outputBarChart() {
    System.out.println("Grades distribution:");
    
    for(int i=0;i<students.size();i++) {
      grades[students.get(i)/10]+="*";
    }
    
    for(String x : grades) {
     System.out.println(x);
    }
   }
}
