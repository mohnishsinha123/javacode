import java.io.FileInputStream;
import java.io.FileOutputStream;

/* FIleInputStream and FIleOutputStream Example
 * 
 */



 public class FileIOStreamExample 
 {

	public static void main(String[] args) 
	{
		
		//FileInputStream Example
		try
		{
			FileInputStream fis= new FileInputStream("D:\\BFGF.txt");
			int i = 0;
			char c;
			byte[] bt= new byte [35];
			while ((i=fis.read())!=-1)//it will read all characters from file
			{
				System.out.print((char)i);// this will read the data in Byte from file
			}
			
			
			System.out.print("");
			FileInputStream fis1 = new FileInputStream("D:\\BFGF.txt");
			int avl = fis1.available();//it will read number of Byte fromInput Stream
			
			System.out.println("");
			System.out.println("***Reading No of Byte in Input Stream***");
			System.out.println("");
			System.out.println("No of Byte :-" + avl);
			System.out.println("");
			FileInputStream fis2 = new FileInputStream("D:\\BFGF.txt");
			
			int i1 = fis2.read(bt, 0, 35);
			
			
			
			
			fis.close();
		
		}
		catch (Exception e) {System.out.println(e);// TODO: handle exception
		}
		
		// FileOutputStream Example
		
		
		try
		{
			FileOutputStream fos= new FileOutputStream("D:\\BFGF Lyrics.html");
			 
			String str = new String("Welcome to Mehak Enterprise Beyond Thoughts");
			
			byte b[] = str.getBytes();
			
			fos.write(b);// it will write Data in file i.e. Mehak Enterprise.txt
			
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
		
	}
 }
 
		
 