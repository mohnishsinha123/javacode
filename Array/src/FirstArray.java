


import java.util.ArrayList;
import java.util.*;//Example of ListIterator Interface in Array
class FirstArray
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(9);
		al.add(3);
		al.add(4);
		
		System.out.println("Element at 4th position: " + al.get(3));
		
		ListIterator<Integer> itr = al.listIterator();
		
		System.out.println("Elements in forward Direction..");
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Elements in Backword Direction...");
		while (itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}

}
