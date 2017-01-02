

/* in Multi Try catch we have to perform different task at the Occurance
 * Exception. Let see the MultyTryCatch Example
 * Rule - at a time only one Exception is occured and at a time only one catch block is executed
 * All catch block must be ordered from most specificto most general
 * i.e. catch for Arithmetic Exception must be come before catch for Exception.
 */


public class MultyTryCatch 
{

	public static void main(String[] args) 
	{
		try{
			int b[]=new int[10];// Created Arithmetic Exception
					b[10]=25/0;// Created ArrayIndexOutofBound Exception
		}
		catch(ArithmeticException e){System.out.println("Arithmetic Exception Caught");}  
		catch(ArrayIndexOutOfBoundsException e){System.out.println("ArrayIndexBound Exception Caught");}  
		catch(Exception e){System.out.println("Caught Exception");}  
		  
		   System.out.println("All Exception Handled...");
		

	}

}
