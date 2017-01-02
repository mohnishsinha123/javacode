

// LinkedhashMaped will maintain Inpute as it is.
//it will have one null key and value.

import java.util.*;
public class LinkedHashMapMain 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer	, String> lhm= new LinkedHashMap<Integer, String>();//Method created to get Integer and String Element.
		LinkedHashMap<String, String> lhm1 = new LinkedHashMap<String, String>();// Method created to Get String and String Element.
		LinkedHashMap<Integer, Integer> lhm2 = new LinkedHashMap<Integer, Integer>();//Method Created to get Integer and Integer Element.
		
		lhm.put(1, " Mohnish ");
		lhm.put(7, " Milind ");
		lhm.put(5, " Mike ");
		lhm.put(4, " Rock ");
		
		lhm1.put("Mohnish ", "Sinha");
		lhm1.put("Milind ", "Kadhi");
		lhm1.put("Rock ", "and Roll");
		lhm1.put("Mike ", "Tayson");
		
		lhm2.put(null,1);
		lhm2.put(1,null);
		lhm2.put(2,3);
		lhm2.put(3,4);
				
		System.out.println("Calling Integer and String Element");
		for(Map.Entry m:lhm.entrySet())// it will gives you Set of Character or Number in Map
		{
			System.out.println(m.getKey()+ ""+ m.getValue());// it will gives you the Key and Value of map
			
		}
		
		System.out.println("calling String and String Element");
		for(Map.Entry m:lhm1.entrySet())
		{
			System.out.println(m.getKey()+ ""+ m.getValue());
		}
		
		System.out.println("calling Integer and Integer Element");
		for(Map.Entry m:lhm2.entrySet())
		{
			System.out.println(m.getKey()+ ""+ m.getValue());
		}

	}

}
