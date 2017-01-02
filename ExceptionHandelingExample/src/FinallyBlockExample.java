

/* To use an Important Code we use Finally Block
 * It always Executed whether exception is handeled or Not.
 * it follow Try or Catch Block.
 * 
 * if we dont handled the exception , before terminationg Program
 * JVM Execute Finally Block(if any)
 * let see the Example of FinallyBlock without Exception 
 */

public class FinallyBlockExample
{

	public static void main(String[] args) 
	{
		try
		{
			int intr=15/5;
			System.out.println("Example of FinallyBlock without Exception");
			System.out.println("");
			System.out.println(intr);
		}
		
			catch (NullPointerException e) {System.out.println(e);}//created exception
			
			finally {System.out.println("Finally Block Always Executed");}
			System.out.println("rest of Code...");
			
		
			
		/*try
		{
			int intr1 = 15/0;
			System.out.println("Example of FinallyBlock where Exception occurs and Not handled");
			
			System.out.println(intr1);
			
		}
		catch (NullPointerException e) {System.out.println(e);}//created exception
		
		
		System.out.println("rest of Code...");
		
		
		try
		{
			int intr2 = 15/0;
			System.out.println("Finally Block where Exception occurs and Handled");
			System.out.println(intr2);
		}
		catch (ArithmeticException ae) {System.out.println(ae);}
		finally {System.out.println("Finally Block Always Executed");}
		System.out.println("rest of Code...");*/
	}
	
}


		
		
	

