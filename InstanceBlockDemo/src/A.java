

	public class A extends I1Main{  
		A(){  
		super();  
		System.out.println("child class constructor invoked");  
		}  
		  
		A(int a){  
		super();  
		System.out.println("child class constructor invoked "+a);  
		}  
		  
		{System.out.println("instance initializer block is invoked");}  
}
