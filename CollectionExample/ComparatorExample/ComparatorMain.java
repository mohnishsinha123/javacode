

/* in Comparator Interface contains 2 method
 * 1.compare(Object obj1,obj2,obj3...and so on.
 * 2.equals(Object element).
 * comparator interface provide Multiple sequence of Sorting.
 * 
 */

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
public class ComparatorMain 

{

	public static void main(String[] args) 
	{
		//ArrayList al1 = new ArrayList();// without Geneic
		
		ArrayList<Student1> al1 = new ArrayList<Student1>();// With generic
		al1.add(new Student1(100, " Mohnish ", 24));
		al1.add(new Student1(101, " Milind ", 29));
		al1.add(new Student1(102, " Rohan ", 22));
		
		System.out.println(" Sort by Name...");
		
		Collections.sort(al1, new NameComparator());
		
		System.out.println(" Normal Method Using While and Iterator ");// without Generic
		
		Iterator itr = al1.iterator();
		while (itr.hasNext())
		{
			Student1 st1= (Student1)itr.next();			
			System.out.println(st1.RollNo+""+st1.Name+""+st1.Age);
		}
			
		System.out.println(" Using for Loop(Inhance Loop) ");// with Generic
		for(Student1 st1:al1)
		{
			//Student1 st1= (Student1)itr.next();
			
		System.out.println(st1.RollNo+""+st1.Name+""+st1.Age);
		}
		
		System.out.println(" Sort by Age...");
		
		Collections.sort(al1, new AgeComparator());
		
		System.out.println(" Normal Method using While and Iterator ");
		
		Iterator itr1= al1.iterator();
		while(itr1.hasNext())
		{
			Student1 st1= (Student1)itr1.next();
			System.out.println(st1.RollNo+""+st1.Name+""+st1.Age);
		}
			
		System.out.println("Using for Loop(Inhance Loop)");
		for(Student1 s1:al1)
		
		{
			//Student1 st1= (Student1)itr1.next();
			System.out.println(s1.RollNo+""+s1.Name+""+s1.Age);
		}
		

	}

}
