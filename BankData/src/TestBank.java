
import java.util.Scanner;
public class TestBank 
{

	public static void main(String[] args) 
	{
		Bank b1 = new Bank(143 , "  Mohnish ", 7);
		SBIBank b2 = new SBIBank(" Mira Road ");
		AxisBank b3= new AxisBank(28422552);
		System.out.println("Bank Details:-  " +b1.getDetails());
		System.out.println("SBI Bank Details:"+""+b2.getDetails());
		System.out.println("Axis Bank Details:"+""+b3.getDetails());
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Account Number");
		int AccNo= sc.nextInt();
		
		System.out.println("Enter Account Holder Name");
		String AccHoldName = sc.next();
		
		System.out.println("Rate of Interest");
		int RateOfInterest = sc.nextInt();
		
		System.out.println("Data Matched");
		sc.close();*/
	}

}

 class Bank
{
	private int AccNo;
	private String AccName;
	private int RateOFInterest;
	
	public Bank(int AccNo, String AccName,int RateOfInterest)
	{
		this.AccNo=AccNo;
		this.AccName=AccName;
		this.RateOFInterest=RateOfInterest;
		
	}
	public String getDetails()
	{
		return AccNo + AccName + RateOFInterest;
	}
}
 class SBIBank extends Bank
 {
	 private String Branch;
	 
	 public SBIBank(String Branch)
	 {
		 super(143, " Mohnish ", 7);
		 this.Branch= Branch;
	 }
	
	 
 }
 
 class AxisBank extends Bank
 {
	 private int Contact;
	 
	 public AxisBank(int Contact)
	 {
		 super(420, " Mike ", 6);
		 this.Contact=Contact;
	 }
	 @Override
	 public String getDetails()
	 {
		 return super.getDetails()+Contact;
	 }

 }