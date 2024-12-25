//package Classes;
//
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//public class Marks {
//		int grade;
//		int courseId;
//		String courseName;
//		
//		String studentName; 			// refernce to LinkedHashMap
//		int studentId;
//		
//		
//		LinkedHashMap <Integer, Integer> allMarks = new LinkedHashMap <Integer, Integer>();							//the list of student marks and student id
//		LinkedHashMap <Integer,	String> allCourse = new LinkedHashMap <Integer, String>();							//the lsit of all course name and student id
//		LinkedHashMap <Integer,	String> allStudentName = new LinkedHashMap <Integer, String>(); 					//the list of student Id and Name
//		Set <Map.Entry<Integer, String>> allCourseId = allCourse.entrySet();										//get all key values of allCourse 
//		
//		Marks(String studentName, int studentId){
//			this.studentId = studentId;
//			this.studentName = studentName;
//		}
//		
//		Marks(String studentName, int studentId, int grade){
//			this.studentId = studentId;
//			this.studentName = studentName;
//			this.grade = grade;
//		}
//		
//
//		public int getMark() {
////			for (Map.Entry<Integer, Integer> it1: allMarks) {
////				for (Map.Entry<Integer, String> it2: allCourse) {
//////					if(it1.getKey() == ;
////				}
////			}
//			
//			int key = 0;
//			
//			for(int i = 0; i < allMarks.size(); i++) {
//				if(allMarks.getOrDefault(studentId, allMarks.get(i)) != null) {
//					return allMarks.getOrDefault(studentId, allMarks.get(i));
//				}
//			}
////				for(int j = i; j < allCourse.size(); j++) {
////					if(allMarks.get(i) == allCourse.get(allMarks.get(j))) {
////						return allMarks;
////					}
////				}
//			return key;
//		}
//		
//		public void setMark(int grade) {
//			for(Map.Entry<Integer, String> it : allCourse.entrySet()){
//				if(studentId == it.getKey()) {
//					allMarks.put(studentId, grade);
//				}
//			}
//		}
//		
//		public void updateMark(int grade) {
//				
//		}
}
