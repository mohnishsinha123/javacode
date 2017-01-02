


public class SingleTonDemoMain 
{
	
		private static SingleTonDemoMain obj=new SingleTonDemoMain();
		private SingleTonDemoMain()
		{}
		public static SingleTonDemoMain getSingleTonDemoMainInstance()
		{
		return obj;
		}
		
	

	public static void main(String[] args) 
	{
		System.out.println("Sharing Resources");
	}
}
		// TODO Auto-generated method stub


