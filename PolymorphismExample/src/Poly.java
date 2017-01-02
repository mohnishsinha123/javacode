
public class Poly //MultyPolymorphism Example
{
	void Display()
	{
		System.out.println("Eating");
	}
}
	class Multy extends Poly
	{
		void Display()
		{
			System.out.println("Barking");
		}
	}
	class Multy1 extends Multy
	{
		void Display()
		{
			System.out.println("running");
		}
	}
	class multy2 extends Multy1
	{
		void Display()
		{
			System.out.println("Sleeping");
		}
	}
	

