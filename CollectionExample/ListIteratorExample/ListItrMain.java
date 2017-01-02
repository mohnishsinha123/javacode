

// in ListIterator we will see Traversing Element in Forward and Backword Direction

import java.util.*;
public class ListItrMain // created Class ListItr
{

	public static void main(String[] args)
	{


		ArrayList al= new ArrayList();// Created Method which create List without Integer or String
		
		al.add("Mohnish");//Added Element
		al.add("Milind");
		al.add("Mike");
		al.add("Rock");	
		
			
		System.out.println("Element of 2nd Position: " + al.get(1));// Printing Particular Element through Get method
		
		ListIterator<String> itr = al.listIterator();
		
		System.out.println("Traversing Element in Forward Direction...");
		System.out.println("Replace of 1st position: " + al.set(0, "MJ"));// Replacing Element through Set method
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

		


