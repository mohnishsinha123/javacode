

//*in this TreeSet we will see how to navigate Interface with SortedSet interface
//it maintain Ascending order Default


import java.util.*;
public class TreeSetmain 
{

	public static void main(String[] args) 
	{
		
		TreeSet ts= new TreeSet();  // it will store String type element
		TreeSet ts1= new TreeSet();// It will store Integer Type Element
		
		ts.add("Mohnish");
		ts.add("Milind");
		ts.add("Mike");
		
		
		ts1.add(5);
		ts1.add(4);
		ts1.add(2);
		
		Iterator itr=ts.iterator();
		Iterator itr2=ts.iterator();
		Iterator itr1=ts1.iterator();
		
		
		System.out.println("Calling String type Element in Ascending Order");
		
		while (itr.hasNext()) 
		{
			
			System.out.println(itr.next());
			
		}
		
		
		System.out.println("Calling Integer type Element in Ascending Order");
		while (itr1.hasNext())
		{
			
			System.out.println(itr1.next());
		}

	}

}
