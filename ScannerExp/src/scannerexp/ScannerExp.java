/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerexp;
import java.util.Scanner;
/**
 *
 * @author UCSCMH_NS159818
 */
public class ScannerExp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
           
        System.out.println("Enter Your Name");
        String name = sc.next();
        
        System.out.println("Enter you Age");
        int age = sc.nextInt();
        
        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();
      
        System.out.println("Name :" + name + "Age :" + age + "Salary :" + salary);
        sc.close();
            
    }
    
}
