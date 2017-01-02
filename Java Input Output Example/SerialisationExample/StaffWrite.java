
import java.io.*;

public class StaffWrite 
{

	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("D:\\Staff.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Staff obj= new Staff();
			obj.setstId("S101");
			obj.setStname("Sagar");
			obj.setSalary(15000);
			
			oos.writeObject(fos);
			
			System.out.println("Object Written");
		}
		catch (Exception e) 
		{
			System.out.println("Exception  Arised");
		}
		
	}
}

