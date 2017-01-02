//hashTable may Not have One Null key or value
//it is Synchronized.
// output will be in Desending order

//let start with Code

import java.util.*;
public class HashTableMain 
{

	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht= new Hashtable<Integer, String>();//created method to get Integer and String Type Element
		Hashtable<Integer, Integer> ht1= new Hashtable<Integer, Integer>();//method to get Integer and Integer Type Element
		
		ht.put(7, " Mohnish");
		ht.put(9, " Milind");
		ht.put(2, " Mike");
		ht.put(6, " Rohan");
		
		
		ht1.put(1, 5);
		ht1.put(4, 6);
		ht1.put(7, 9);
		
		System.out.println("Calling Integer and String Element");
		for(Map.Entry m:ht.entrySet())
		{
			System.out.println(m.getKey()+""+ m.getValue());
		}
		
		System.out.println("Calling Integer and Integer Element");
		for(Map.Entry m1:ht1.entrySet())
		{
			System.out.println(m1.getKey()+""+ m1.getValue());
		}
		
		
		

	}

}
