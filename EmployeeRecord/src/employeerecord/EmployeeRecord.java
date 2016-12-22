/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeerecord;

/**
 *
 * @author UCSCMH_NS159818
 */
public class EmployeeRecord 
    {
        String EmployeeDetails[][] = new String [1][7];
        
        public void storeData()
        {
            EmployeeDetails[0][0]= "Emp ID: S101";
            EmployeeDetails [0][1]= "Sagar Arde";
            EmployeeDetails [0][2]= "Admin";
            EmployeeDetails [0][3]= "Senior Executive";
            EmployeeDetails[0][4]= "28/12/2015";
            EmployeeDetails[0][5]= "28/05/1995";
            EmployeeDetails[0][6]= "Unmarried";
        }
        public void displayData()
        {
            System.out.println("EmployeeDetails:");
            for (int i = 0; i< EmployeeDetails.length; i++)
            {
                for (int j = 0; j<EmployeeDetails[i].length; j++) 
                {
                    System.out.println(EmployeeDetails[i][j] );
                    
                    
                }
            }
        }
        public static void main(String[] args) 
        {
            EmployeeRecord obj = new EmployeeRecord();
            obj.storeData();
            obj.displayData();
        }
        
        
    }

