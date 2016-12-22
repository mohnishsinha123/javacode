/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author UCSCMH_NS159818
 */
public class Exception 
{
    
    
    public static void main(String[] args) 
    {
       int flag = 0;
    EmployeeDetails obj = new EmployeeDetails();
    do 
    {
        flag =0;
        {
            try {
                obj.showMenu();
            }catch(SlectionException Obja){
                System.out.println("Exception Caught :" + Obja);
            }
        }
    }while (flag !=1);
    }
    
}
