/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterndemo;

/**
 *
 * @author MRuser
 */
public interface Employee {  
    public  int getId();  
    public String getName();
    public String getDept();
    public double getSalary();  
       public void print();  
    public void add(Employee employee);  
       public void remove(Employee employee);  
       public Employee getChild(int i);  

    public void print(Employee manager1);
}// End of the Employee interface.  