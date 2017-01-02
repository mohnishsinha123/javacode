

//in this we will compare and sort element by Age

import java.util.*;
import java.util.Comparator;
import java.io.*;

class AgeComparator implements Comparator 

{
	public int compare(Object o1, Object o2)
	{
		Student1 s1= ( Student1)o1;
		Student1 s2 = (Student1)o2;
		
		if(s1.Age==s2.Age)
			return 0;
		else if (s1.Age > s2.Age)
			return 1;
		else
			return -1;
	}
}



