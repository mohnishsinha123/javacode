import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* With Sorting we can Sort Element of String Object
 * Wrapper Class object
 * User-Defines Class object
 * Let see the Code Now
 */

public class SortingMain 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al= new ArrayList<String>();//Created method to get String Type Element Only
		ArrayList<Integer> al1 = new ArrayList<Integer>();// Integer Type Element
				
		al.add("Mohnish");
		al.add("Milind");
		al.add("Apple");
		al.add("Popaye");
		
		al1.add(1);
		al1.add(4);
		al1.add(3);
		al1.add(2);
		
		Collections.sort(al);
		Collections.sort(al1);
		
		Iterator<String> itr = al.iterator();
		System.out.println("Strinig Element");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterator<Integer> itr1 = al1.iterator();
		System.out.println("Integer Element");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
				
				

	}

}
