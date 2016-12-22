

	public class Employee1 

	{
		int EmpId;
		String EmpName;
		String EmpDept;
		String City;
		int Salary;
		String Position;
		
		Employee1(int EmpId, String EmpName, String EmpDept, String Pos, String City,int Sal)
		{
			this.EmpId=EmpId;
			this.EmpName=EmpName;
			this.EmpDept=EmpDept;
			this.Position=Pos;
			this.City=City;
			this.Salary=Sal;
		}
		
		public String toString() 
		{//overriding toString() Method
			return EmpId + ""+EmpName+""+EmpDept+""+Position+""+ "" +City  +""+Salary;
		}
}
