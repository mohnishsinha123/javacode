
 class FactoryPattern 
{

	public static void main(String[] args) 
	{
		FactoryDemo FactDemo = new FactoryDemo();
		Area a= FactDemo.getFact("Rectangle");
		a.area(10, 8);
		
		Area a1= FactDemo.getFact("Triangle");
		a1.area(5, 9);
	}

}
 class Rectangle implements Area
{
	public void area (int a, int b)
	{
		System.out.println("Area of Rectangle" +(a*b));
	}
	public void area (double l)
	{}
}

 class Triangle implements Area
{
	 public void area(int a, int b)
	{

		System.out.println("Area of Triangle "+ (3.14*a*b));
	}

	@Override
	public void area(double l) {
		// TODO Auto-generated method stub
		
	}
	
}
  class FactoryDemo 
 {
  public  Area getFact(String Facttype)
  {
      if (Facttype==null)
      {
          return null;
      }
      if (Facttype.equalsIgnoreCase("Rectangle"))
      {
          return new Rectangle();
      }
            
      if (Facttype.equalsIgnoreCase("Triangle"))
      {
          return new Triangle() ;
      }
      return null;
  }
 }


