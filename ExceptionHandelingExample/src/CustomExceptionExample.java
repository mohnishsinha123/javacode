
/*if we are creating our own exception then its called Custom Exception
 * with the help of custom exception we can have our own exception and Massage
 * 
 */



class CustomExceptionExample 
{

	static void validate(int age) throws InvalidAgeException
	{
		if(age<21)
			throw new InvalidAgeException("Not Eligible");//created Arithmatic Exception
		else
			System.out.println("Eligible to Vote");
	}
	
	
	public static void main(String[] args) 
	{
		try
		{
			
		validate(22);
		}
		catch (Exception m) {System.out.println("Exception Occured: " + m);//  handle exception
		}
		
		System.out.println("Welcome to Voter List");

	}
}
class InvalidAgeException extends Exception // created InvalidAgeException Class

{
	InvalidAgeException(String s)// created method
	{
		super();
	}
	


}



