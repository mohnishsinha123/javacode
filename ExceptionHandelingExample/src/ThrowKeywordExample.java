
/*Throw Keyword is use to Explicitly throw an Exception
 * we can throw checked or Unchecked Exception through Throw Keyword
 * it is mainly use to throw custom exception.
 *let see simple Arithmetic example
 *
 */



public class ThrowKeywordExample 
{

	static void validate(int age)
	{
		if(age<21)
			throw new ArithmeticException("Age not Valid");//created Arithmatic Exception
		else
			System.out.println("Elogible to Vote");
	}
	
	
	public static void main(String[] args) 
	{
		validate(20);
		System.out.println("Welcome to Voter List");

	}

}
