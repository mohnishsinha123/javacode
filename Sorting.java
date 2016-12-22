
package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
public class sortting 
{

    
    public static void main(String[] args) 
    {
     Student s1 = new Student("Mohnish", 90);
     Student s2 = new Student("Ganesh", 88);
     Student s3 = new Student("Sagar", 85);

        ArrayList<Student> obj = new ArrayList<>();
        obj.add(s1);
        obj.add(s2);
        obj.add(s3);
        
        System.out.println("Student Details are :");
        
        ListIterator li = obj.listIterator();
        while (li.hasNext())
        {
            System.out.println(li.next());
        }
        Collections.sort(obj);
        System.out.println("Mark Wise Sort");
        
        ListIterator li2 = obj.listIterator();
        while (li2.hasNext())
        {
            System.out.println(li2.next());
        }
        Collections.sort(obj, new NameCompare());
        System.out.println("Name Wise Sort");
        
        ListIterator li3 = obj.listIterator();
        while (li3.hasNext())
        {
            System.out.println(li3.next());
        }
    }
}
public class Student implements Comparable
{
 private String name;
 private int marks;


 public Student (String nm, int mk)
 {
    this.name = nm;
    this.marks = mk;
 }
 public int getMarks()
 {
     return marks;
 }
 public String getName()
 {
     return name;
 }
 public void setName(String name)
 {
     this.name = name;
     
 }
 public int compareTo(Object obj)
 {
     Student s = (Student) obj;
     
     if (this.marks > s.getMarks())
     {
         return 1;
     }
     else if 
             (this.marks < s.getMarks())
     {
         return -1;
      }
     else
     {
      return 0;
     }
 }
 public String toString()
 {
     StringBuffer buffer = new StringBuffer();
     buffer.append(" Name : " + name + "\n" );
     buffer.append("Marks : " + marks + "\n" );
     return buffer.toString();
 }
       
}
import java.util.Comparator;
public class NameCompare implements Comparator
{
    public int compare (Object a, Object b)
    {
        Student x = (Student) a;
        Student y = (Student) b;
        return x.getName().compareTo(y.getName());
    }

    
}

