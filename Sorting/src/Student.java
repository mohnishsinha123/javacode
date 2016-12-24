
public class Student implements Comparable<Object>
{

	private String name; // we use Private in this due to Security Purpose
	private int marks;
	
	public Student (String nm, int mk)
	{
		this.name= nm;
		this.marks= mk;
	}
	public int getMarks()
	{
		return marks;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public int compareTo(Object obj)
	{
		Student s = (Student) obj;
		if(this.marks>s.getMarks())
		{
			return 1;
		}
		else if (this.marks<s.getMarks())
		{
			return -1;
		}
		else{return 0;}
	}
	public String toString()
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("Name : " + name+"\n");
		buffer.append("Marks : " + marks+"\n");
		return buffer.toString();
	}


	}


