
/* try block is used to enclose the code which might throw as Exception
 * try block must use is method only
 * catch block is used to Handle the Exception.
 * it must be use after Try Block only.
 *here is the Simple Example of Try catch */

 

public class SimpleTryCatch 
{

	public static void main(String[] args) 
	{
try{
	int intr=12/0;
	}
catch(ArithmeticException ae)
{
	System.out.println(ae);
}
System.out.println("Exception Caught: ");
	}

}
