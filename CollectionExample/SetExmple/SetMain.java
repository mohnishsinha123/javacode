

// in HashSet we will Store the Unique Element only.
// it can not contain Duplicate element.


import java.util.*;
public class SetMain 

{

	public static void main(String[] args)
	
	{
		HashSet<String> al = new HashSet<String>();//it will store String Type Element//Method Created
		HashSet<Integer> al1 = new HashSet<Integer>();//it will store Integer type Element//Method Created
		
		
		al.add("Leo");
		al.add("Mike");
		al.add("Rock");
		al.add("Milind");
		
		System.out.println("Remove 1:" + al.remove("Leo") );
		System.out.println("Add 1:" + al.add("Prince"));
		
		al1.add(1);
		al1.add(3);
		al1.add(4);
		al1.add(2);
		
		
	
		
		
		Iterator<String> itr=al.iterator();
		Iterator<Integer> itr1=al1.iterator();
		
		System.out.println("Calling String type Element in Ascending Order");
		
		while(itr.hasNext())
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
