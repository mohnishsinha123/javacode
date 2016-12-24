

import java.util.*;
public class TestArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>(); // creating new ArrayList
		al.add("Mohnish");// Adding Object In ArrayList
		al.add("Milind");
		al.add("Mike");
		
		
		Iterator itr= al.iterator(); // getting Iterator from ArrayList to Traverse Element
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Iterating element by Using ForEachLoop 
		for(String obj:al)
			System.out.println(obj);
		
	}

}
