

/*try block within try block is known as Nested try Block.
 * when part of one block arives and error and entire block itself cause another error 
 * then we are using nested try block
 */


public class NestedTryExample 
{

	public static void main(String[] args)
	{
		try{
			try{
				System.out.println("Dividing");//created Arithmetic Exception
				int b= 25/0;
				
			}
			catch (ArithmeticException ae) {System.out.println(ae);}// handled Excepetion
			
			try{
				int a[]=new int [5];//created ArrayIndexOutOfBound Exception
				a[5]=4;
			}
			catch (ArrayIndexOutOfBoundsException ae) {System.out.println(ae);}// handled Exception
			
			System.out.println("Other Statement");
			
		}
		catch (Exception e) {System.out.println("handeled");}
		
		System.out.println("Normal Flow");
	}
}
