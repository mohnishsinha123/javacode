

import java.io.*;

public class StaffRead 
{

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream f1= new FileInputStream("d:\\Staff.txt");
			ObjectInputStream o1 = new ObjectInputStream(f1);
			
			Staff st=(Staff) o1.readObject();
			
			System.out.println(st);// TODO Auto-generated method stub
		}
		catch (Exception e) 
		{
			System.out.println("Exception e");
			// TODO: handle exception
		}

	}

}
