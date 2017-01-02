


import java.lang.*;
import java.util.Comparator;

 public class StudentClass implements Comparable<StudentClass> 
 {
	 int rollno;
	 String name;
	 int marks;
	 
	 public StudentClass(int rn, String nm, int mk) 
	 {
		this.rollno= rn;
		this.name = nm;
		this.marks = mk;
		
	}
	 
	 public int compareTo(StudentClass sc)
	 {
		 if(marks==sc.marks)
			 return 0;
		 else if(marks>sc.marks)
			 return 1;
		 else
			 return -1;
	 }
	 public String toString()
	 {
		 return rollno + ""+name+""+marks;
	 }
 }
 
		
	 
 
 

