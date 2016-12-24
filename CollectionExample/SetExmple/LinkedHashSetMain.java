


/*linkedHashSet Example*/
import java.util.*;
public class LinkedHashSetMain 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();//to Store String Element
		LinkedHashSet<Integer> lhs1= new LinkedHashSet<>();//to store Integer Element
				//LinkedHashSet method Created
		lhs.add("Mohnish");
		lhs.add("Milind");
		lhs.add("Mike");
		lhs.add("Rock");
		
		lhs1.add(15);
		lhs1.add(19);
		lhs1.add(17);
		lhs1.add(18);
		
		
		
		Iterator<String> itr=lhs.iterator();//Iterator is Compulsory to use in Collection to get Proper Output
		Iterator<Integer> itr1=lhs1.iterator();
		
		
		System.out.println("Strinig Element");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("Integer Element");
		while(itr1.hasNext())
		{
		System.out.println(itr1.next());
		}		
	}

}
