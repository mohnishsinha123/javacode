

//In this example, we have created the constructor of Student class that have two parameters. 
//We can have any number of parameters in the constructor.

public class ParamCon
{
	int id;
	String name;
	private static ParamCon p1;
	private static ParamCon p2;
	
	public ParamCon(int i, String n) 
	{
		id=i;
		name = n;
	}
	void display()
	{
		System.out.println(id+""+name);
	}

	public static void main(String[] args) 
	{
		setP1(new ParamCon(1, "mo"));
		setP2(new ParamCon(2, "Mi"));
		
		
	}
	public static ParamCon getP2() {
		return p2;
	}
	public static void setP2(ParamCon p2) {
		ParamCon.p2 = p2;
	}
	public static ParamCon getP1() {
		return p1;
	}
	public static void setP1(ParamCon p1) {
		ParamCon.p1 = p1;
	}
	

}
