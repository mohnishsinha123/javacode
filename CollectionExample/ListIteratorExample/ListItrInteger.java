


import java.util.*;
public class ListItrInteger 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();// created method Which Allow only Integer Type Element
		TreeSet a2 = new TreeSet<>();
		a2.add(4);
		a2.add(3);
		a2.add(7);
		
		
		al.add(4);
		al.add(2);
		al.add(3);
		al.add(1);
		
		System.out.println("Element of 2nd position:" + al.get(1));//using get Method to Get Particular Element
		ListIterator<Integer> itr=al.listIterator();
		
				
		System.out.println("Element in Forward Direction..");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Element in Backword Direction...");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

		
		Iterator i1 = a2.iterator();
		System.out.println("Elemnt in with Sorting");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
				

	}

}
