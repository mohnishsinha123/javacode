import java.util.Scanner;

/*if we are creating our own exception then its called Custom Exception
 * with the help of custom exception we can have our own exception and Massage
 * User Define Exception we are using her in this example
 */



class CustomExceptionExample 
{

	static void validate(int age) throws InvalidAgeException
	{
		if(age<21)
			throw new InvalidAgeException("Not Eligible");//created Custom Exception
		else
			System.out.println("Eligible to Vote");
	}
	
	
	public static void main(String[] args) 
	{
		int age;
		Scanner scan = new Scanner(System.in);// User Input Method we are using here
		System.out.println("Enter Age");
		age=scan.nextInt();
		try
		{
			
		validate(15);
		}
		catch (Exception m) {System.out.println("Exception Occured: " + m);//  handle exception
		
		}
		int age1;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the Valid Age");
		age1=scan1.nextInt();
		
		System.out.println("Welcome to Voter List");

	}
}
class InvalidAgeException extends Exception // created InvalidAgeException Class

{
	InvalidAgeException(String s)// created method using super keyword
	{
		super("Invalid Age");
	}
	

}
class InvalidNameException extends Exception // Created InvalidName Exception Class
{
	public InvalidNameException( String s1) 
	{
		super("Invalid Name");// TODO Auto-generated constructor stub
	}
}



