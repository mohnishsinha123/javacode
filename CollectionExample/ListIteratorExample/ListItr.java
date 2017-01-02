

import java.util.*;
public class ListItr 

{
	public static void Main(String[]args)
	{
		ArrayList<String> al= new ArrayList<String>();// Created Method which allow only String Type Element
		
		al.add("Mohnish");
		al.add("Milind");
		al.add("Mike");
		al.add("Rock");
		
		System.out.println("Element of 2nd Position: " + al.get(2));// Use get method to get Particular Element
		ListIterator<String> itr = al.listIterator();
		
		System.out.println("Traversing Element in Forward Direction...");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Element in Backword Direction...");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		
		
	}
		
}

