/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persondetails;

/**
 *
 * @author UCSCMH_NS159818
 */
 class PersonDetails 
{
    String firstName;
    String lastName;
    int age;
    
    public void getDetails(String name1, String name2, int ag)
    {
        firstName = name1;
        lastName = name2;
        age = ag;
    }
    void showDetails()
    {
        System.out.println("The Student Details are:");
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name:" + lastName);
        System.out.println("Age :" + age);
        
    }
}
 class StudentDetails extends PersonDetails
{
    String stream;
    int studentID;
    
    public void getDetails(String name1, String name2, int ag, String strm, int id)
    {
        super.getDetails(name1, name2, ag);
        stream= strm;
        studentID= id;
        super.showDetails();
       // System.out.println("The Student Details are:");
        System.out.println("stream"+ stream);
        System.out.println("studentID"+ studentID);
        
    }
     
}
public class EmployeeDetails extends PersonDetails
{
    double salary;
    String desg;
    String dept;
      
    public void getDetails(String name1, String name2, int ag, double sal, String des, String dep)
    {
        super.getDetails(name1, name2, ag);
        salary = sal;
        desg= des;
        dept = dep;
        
    }
    @Override
    public void showDetails()
    {
        System.out.println("\nThe Employee Details are:\n");
        System.out.println("First Name : " + super.firstName);
        System.out.println("Last Name:" + super.lastName);
        System.out.println("Age :" + super.age);
        System.out.println("Department: " + dept);
        System.out.println("Designation : " + desg);
        System.out.println("Salary: " + salary);
    }
   
}

 class MainDetails
{
  public static void main(String[] args) 
    {
      StudentDetails sobj = new StudentDetails();
      sobj.getDetails("Vikas", "Shinde", 21, "Commerce", 17);
    
      
      EmployeeDetails eobj = new EmployeeDetails();
      eobj.getDetails("Sarita", "Kendre", 22, 6500, "Executive", "Admin");
      eobj.showDetails();
      
        
    }
    
}
