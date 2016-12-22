/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;


/**
 *
 * @author UCSCMH_NS159818
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
public class sortting 
{

    /**
     * @param args the command line arguments
     */
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
