import java.util.Comparator;

public class StudentComparator implements Comparator 
{

	
	public int compare(Object o1, Object o2) 
	{
		StudentClass s1=(StudentClass)o1;
		StudentClass s2 = (StudentClass)o2;
		
		if(s1.marks == s2.marks)
			return 0;
			else if(s1.marks >s2.marks)
				return 1;
			else
				return -1;
		
	}

}
