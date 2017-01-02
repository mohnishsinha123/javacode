
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
public class Sort 
{
	public static void main(String[] args) 
	{
		Student s1= new Student("Mohnish", 90);
		Student s2 = new Student("Milind",85);
		Student s3 = new Student("Zaid", 99);
		Student s4 = new Student("Rock", 70);
		System.out.println();
		ArrayList<Student> Obj= new ArrayList<>();// Created Array List
		Obj.add(s4);// Added Student
		Obj.add(s1);
		Obj.add(s2);
		Obj.add(s3);
		
		
		System.out.println("Student Details Are:");
		
		ListIterator<Student> li = Obj.listIterator();
		while (li.hasNext())
		{
			System.out.println(li.next());
		}
		Collections.sort(Obj);
		System.out.println("Mark Wise Sort");
		
		ListIterator<Student> li1 = Obj.listIterator();
		while (li1.hasNext())
		{
			System.out.println(li1.next());
		}
		//Collections.sort(Obj.new NameCompare());
		System.out.println("Name Wise Sort");
		
		ListIterator<Student> li2 = Obj.listIterator();
		while (li2.hasNext())
		{
			System.out.println(li2.next());
		}
		ListIterator<Student> li3 = Obj.listIterator();
		while (li2.hasNext())
		{
			System.out.println(li3.next());
		}
	}

}
