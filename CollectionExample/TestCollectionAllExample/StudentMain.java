
import java.util.*;
import java.io.*;
import java.lang.*;
public class StudentMain {

	public static void main(String[] args)
	
	{	
		/*StudentClass s1= new StudentClass(1, " Mohnish ", 80);// created user Define Class objects
		StudentClass s2 = new StudentClass(2, " Milind ", 95);
		StudentClass s3 = new StudentClass(3, " Rohan ", 90);*/
		
		ArrayList<StudentClass> al= new ArrayList<StudentClass>();//created Array List of StudentClass Type
				
		al.add(new StudentClass(1, " Mohnish ", 95));
		al.add(new StudentClass(2, " Milind ", 97));
		al.add(new StudentClass(3, " Rohan ", 90));
				
		System.out.println("  List of Student Before Sorting ");
		System.out.println("");
		
		Iterator itr= al.iterator();
		while(itr.hasNext())
		{
			StudentClass sc1=(StudentClass)itr.next();
			System.out.println(sc1.rollno+""+sc1.name+""+sc1.marks);
		}
		
		System.out.println("");
		/* comparing STudentClass on the Basis of Marks
		 * 
		 */
		System.out.println("List of Student after sorting using their mark is: ");
		System.out.println("");
		
		Collections.sort(al);
		for(StudentClass sc:al)
		{
			System.out.println("The Rollno is:" + sc.rollno+" The Name is:"+sc.name+" Marks is:"+sc.marks);
		}
		System.out.println("");
		System.out.println("The List of Student After Sorting using their name is:");
		System.out.println("");
		
		Collections.sort(al, new StudentComparator());
		Iterator itr1 = al.iterator();
		while(itr1.hasNext())
		{
			StudentClass sc= (StudentClass)itr1.next();
			System.out.println(" The Roll No Is:"+ sc.rollno+""+"The name of Studen is:"+sc.name+""
			+"The Marks of Student is:"+sc.marks);
		}
		
	}
	
}
/*StudentClass s4 = new StudentClass(4, " Mike ", 99);	
		//StudentClass s5 = new StudentClass(5, " Rock ", 95);
		
		//ArrayList<StudentClass> al1 = new ArrayList<StudentClass>();//created ArrayList
		
		//LinkedList<StudentClass> al2 = new LinkedList<StudentClass>();// created linkedList
		
		//al.add(s4);
		
		
		//Iterator<StudentClass> itr1 =  al2.iterator();
		//while(itr1.hasNext())
		//{
			//System.out.println("arraylist:" + al);
			//System.out.println("linkedlist:" + al2);
		//}
		
		//al1.add(s4);
		//al1.add(s5);
		
		//System.out.println("Add Collection Method");
		//al.add(s4);
		
		//System.out.println("AddAll Method");
		//al.addAll(al1);
				
		
		al.remove(s3);
		System.out.println("Remove Method Used");
		
		
		System.out.println("using Iterator and While");
		Iterator<StudentClass> itr=  al.iterator();
		
		while(itr.hasNext())
		{
			StudentClass s=(StudentClass)itr.next();
			System.out.println(s.rollno+""+s.name+""+s.marks);
		}
		
		System.out.println("Using fo-Each Loop");
		
		for(StudentClass ob1:al)
		{
			System.out.println(ob1);
		}
		
			
		System.out.println("Sort by Marks");
		
		//Collections.sort(al, new ComparatorClass();
		Iterator itr3 =al.iterator();
		while(itr3.hasNext())
		{
			StudentClass sc = (StudentClass)itr3.next();
			
			System.out.println(sc.rollno+""+sc.name+""+sc.marks);
		}
		
	}

}*/

	
	

