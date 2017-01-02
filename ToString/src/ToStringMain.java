

public class ToStringMain
{

	public static void main(String[] args) 
	{
		ToString e1= new ToString(120, " Mike ", 25000);
		ToString e2 = new ToString(140, " Rose ", 45000);
		
		WithoutToString w1= new WithoutToString(21, "jhs", 2154);
		
				System.out.println(w1);

				System.out.println(e1);//it will compile e1.toString()
				System.out.println(e2);//it will compile e2.toString()
	}

}
