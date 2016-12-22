/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee1;

/**
 *
 * @author UCSCMH_NS159818
 */
public class Employee1 
{
    public int empID;
    public String empName;
    public String empDesg;
    public String empDept;
    
    public Employee1()
    {
        empID=2015;
        empName="Sagar Arde";
        empDesg="Manager";
        empDept="Account";
        
    }
    
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("The Employee1 Details are:\n");
        buffer.append("Employee1 ID : " + empID + "\n");
        buffer.append("Employee1 Name : " + empName + "\n");
        buffer.append("Employee1 Designation : " + empDesg + "\n");
        buffer.append("Employee1 Department : " + empDept + "\n");
        return buffer.toString();
      
    }
    public static void main(String[] args) 
    
    {
        Employee1 eobj = new Employee1();
        System.out.println(eobj);// TODO code application logic here
    }
    
}
