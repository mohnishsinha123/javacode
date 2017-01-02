

/* Comparable Interface Contain Only One Method
/it will sort only one Type ie. integer or String..
 * CompareTo method()
 * same like Sorting we can sort element of:
 * String Object, Wrapper Class Object and User Defined Class object.
 */

import java.util.*;
import java.io.*;

public class ComparableMain 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(new Student(1, " Mohnish ", 24));
		al.add(new Student(2, " Milind ", 29));
		al.add(new Student(3, " Rohan ", 22));
		
		Collections.sort(al);// to get details in Sorted Manner we are using this.
		for (Student st:al)
		{
			System.out.println(st.rollno+""+st.name+""+st.age);
		}
	}
}

	
	



	
	


	
		
	
