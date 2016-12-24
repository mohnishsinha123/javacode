
//HashMap will call directly to Key through we can get Value . 
//through this the Duplication can not be Happen in Code
// hash map Contain Unique Element.
// hasMap Default give Value in Sorted manner.
// start with HashMap Example

import java.util.*;
public class HashMapMain
{

	public static void main(String[] args) 
	{
		HashMap<Integer	, String> hm= new HashMap<Integer, String>();//Method created to get Integer and String Element.
		HashMap<String, String> hm1 = new HashMap<String, String>();// Method created to Get String and String Element.
		
		hm.put(1, " Mohnish ");
		hm.put(7, " Milind ");
		hm.put(5, " Mike ");
		hm.put(4, " Rock ");
		
		hm1.put("Mohnish ", "Sinha");
		hm1.put("Milind ", "Kadhi");
		hm1.put("Rock ", "and Roll");
		hm1.put("Mike ", "Tayson");
		
		System.out.println("Calling Integer and String Element");
		for(Map.Entry m:hm.entrySet())// it will gives you Set of Character or Number in Map
		{
			System.out.println(m.getKey()+ ""+ m.getValue());// it will gives you the Key and Value of map
			
		}
		
		System.out.println("calling String and String Element");
		for(Map.Entry m:hm1.entrySet())
		{
			System.out.println(m.getKey()+ ""+ m.getValue());
		}

	}

}
