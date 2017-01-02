
abstract class Car 
{
	
	abstract void run();
	
	void forward()
	{
		System.out.println("Forward Step");
	}
}

class Wolks extends Car
{
	void run()
	{
		System.out.println("Forwording Safely");
	}
}

