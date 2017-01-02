
import java.io.*;

public class Staff implements Serializable
{
	String stid;
	String stname;
	int salary;
	
	public Staff()
	{
		this.stid= stid;
		this.stname= stname;
		this.salary= salary;
	}

	public void setstId(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getStid() {
		return stid;
	}

	public void setStid(String stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
		

}
