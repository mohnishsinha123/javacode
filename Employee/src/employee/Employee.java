/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author UCSCMH_NS159818
 */
public class Employee 
{

    int Emp_ID;
    String Emp_Name;
    
    public Employee(int Emp_ID,String Emp_Name)
    {
        this.Emp_ID= Emp_ID;
        this.Emp_Name= Emp_Name;
    }
}
class Manager extends Employee // Inheritant 
{
   String Position;
        public Manager(int Emp_ID, String Position, String Emp_Name)
        {
            super(Emp_ID,Emp_Name);
            this.Position = Position;
            
        }
        
    public static void main(String[] args) 
    {
        Employee V= new Employee(02,"Vikas Shinde");
        Employee S= new Employee(01,"Sarita Kendre");
        Manager G = new Manager(001, "Properitor ", "Ganesh Lohkare");
        Manager M = new Manager(002, "Manager", "Mohnish Sinha");
        Manager SA = new Manager(003, "Engineer", "Sagar Arde");
        
        System.out.println(S.Emp_ID);System.out.println(S.Emp_Name);
        System.out.println(V.Emp_ID);System.out.println(V.Emp_Name);
        System.out.println(G.Position);
        System.out.println(G.Emp_Name);System.out.println(G.Emp_ID);
        System.out.println(M.Position);
        System.out.println(M.Emp_Name);System.out.println(M.Emp_ID);
        System.out.println(SA.Position);
        System.out.println(SA.Emp_Name);System.out.println(SA.Emp_ID);
        
       
    }
        
        
}
    

