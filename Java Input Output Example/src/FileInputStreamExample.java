
/* file Input Stream class contain input byte from a file
 * its used for reading Byte-oriented data i.e.
 * Images, Audio, Video etc
 * to read character stream data we used fileReader class.
 *   
 */


import java.util.*;
import java.io.*;
import java.io.FileInputStream;

public class FileInputStreamExample

{

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis= new FileInputStream("D:\\Announcement.txt");
			int avl = fis.available();
//It is used to return the estimated number of bytes that can be read from the input stream. 

			System.out.println("");
			System.out.println("No.Of Byte: "+avl);
			
			byte buf[]= new byte[avl];
			fis.read(buf, buf.length, 0);
			
			String str = new String(buf);
				
			System.out.println("The Content of File :" + str);
			fis.close();
		
		}
		catch (Exception e) {System.out.println(e);// TODO: handle exception
		}

	}

}
