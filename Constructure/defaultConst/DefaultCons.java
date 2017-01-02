

//Example of default constructor that displays the default values

public class DefaultCons 
{

			int id;
			String name;
			
			void display()
			{
				System.out.println(id + ""+ name);
			}
			
			public static void main(String[] args) 
			{
				DefaultCons c1= new DefaultCons();
				DefaultCons c2 = new DefaultCons();
				
				c1.display();
				c2.display();// TODO Auto-generated method stub

			}

	}

