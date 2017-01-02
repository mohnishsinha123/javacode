



import java.util.*;

 class NameComparator implements Comparator
 
 {
	 public int compare(Object Ob1, Object Ob2)
	 {
		 Student1 st1 = (Student1)Ob1;
		 Student1 st2 = (Student1)Ob2;
		 
		 return st1.Name.compareTo(st2.Name);
	 }
}
