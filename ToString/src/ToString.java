
//By overriding the toString() method of the Object class, 
//we can return values of the object, so we don't need to write much code.
	public class ToString 

	{
		int EmpId;
		String EmpName;
		int Salary;
	
		
		ToString(int EmpId, String EmpName, int Sal)
		{
			this.EmpId=EmpId;
			this.EmpName=EmpName;
			this.Salary=Sal;
		}
		
		public String toString() 
		{//overriding toString() Method
			return EmpId + ""+EmpName+""+""+Salary;
		}
}
