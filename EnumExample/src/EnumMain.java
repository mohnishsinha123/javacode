

// Enum Example call by Method

public class EnumMain 
{
	enum Days{Monday,Tuesday, Saturday}
	
	enum Days1{Monday, Tuesday, Saturday}
	public static void main(String[] args) 
		{
		for (Days d : Days.values())
			//System.out.println("Calling Enum By method");// here we are calling by Method which is .values
		
			System.out.println(d);
		
		//EnumInsideClass d1= .Saturday; // here we are calling enum Inside class
		
		System.out.println("Enum Inside Class");
		Days1 d1 = Days1.Monday;
		System.out.println(d1);
		//System.out.println(d1);
		
		
		Days d2= Days.Monday; // here we are calling enum Outside class
		System.out.println("Enum Outside Class");
		System.out.println(d2);	
		
		//for(Days3 d3 :Days3.values())
		
			//System.out.println(d3+""+d3.values());
		
		
		}
}


	
