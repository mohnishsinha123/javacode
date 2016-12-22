/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overiding;


class Employee 
{
    private int EmployeeId;
    private String EmployeeName;
    
    public Employee(int Id, String Name) 
    {
        this.EmployeeId=Id;
        this.EmployeeName=Name;
    }
        public String getDetails()
        {
            return "empid:" + EmployeeId
                    + "empname:" + EmployeeName;
        }
}
    class Manager extends Employee
    {
        private String deptName;
    public Manager(int id, String name, String dept)
        {
        super(id,name);
        this.deptName=dept;
        }
    @Override
    public String getDetails()
        {
        return super.getDetails()+ "Department:"+deptName;
        }
    }
    public class OverRiding 
    {
        public static void main(String[]args) 
        {
            Employee e= new Employee(7,"Sagar Arde");
            Employee e1= new Employee(8,"Sarita Kendre"); 
            Employee e2= new Employee(9,"Vikas Shinde"); 
            Manager m = new Manager(2,"Mohnish Sinha","Information Technology");
            System.out.println(e.getDetails());
            System.out.println(e1.getDetails());
            System.out.println(e2.getDetails());
            System.out.println(m.getDetails()); 
         Employee m1;
         m1 = new Manager (07,"Mohnish","overiding");
         System.out.println(m1.getDetails());
        }
        
    }
