




import java.util.*;
import java.io.*;

public class FileOutputStreamExample 
{

	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos= new FileOutputStream("D:\\MehakEnterprise.html");
			 
			String str = new String("Welcome to Mehak Enterprise");
			
			byte b[] = str.getBytes();
			
			fos.write(b);
			
			//fos.write(str);
			//fos.
			 
			//for(int i = 0;
				//fos.write(str.charAt(i));
			//}
			//System.out.println("Content is Written in File");
				
			fos.close();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Arise:"+e);// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}

}
