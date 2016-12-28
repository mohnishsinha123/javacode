
/* Throws keyword is use to Declare an Exception
 * it give info to Programmer that there may occur Exception
 * it helps Programmer  to provide the Exception Handling code.
 *  If we are calling a method that declares an exception, 
 *  we must either caught or declare the exception.
 *  Throws is used with the method signature.
 */


import java.io.IOException;

public class ThrowsKeywordExample 
{

	void m()throws IOException
	{
		throw new IOException("Device Not Detected");//this is Checked Exception(IOException)
	}
	
	void n()throws IOException
	{
		m();
	}
	void l()
	{
		try
		{
			n();
		}
		catch (Exception e) {System.out.println("Exception Handled ");}
	}
	
	public static void main(String[] args) throws IOException //Declaring Exception
	{
		ThrowsKeywordExample obj= new ThrowsKeywordExample();
		obj.l();
		
		System.out.println("Normal Flow");

	}

}
