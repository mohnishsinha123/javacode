/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

/**
 *
 * @author UCSCMH_NS159818
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Validation 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Boolean Myboolean, Myboolean1;
        String name, contactnumber;
        
        do {
            System.out.println("Enter the First Name :");
            name = input.nextLine();
            Pattern MyPattern = Pattern.compile("^[a-zA-z]+$");
            
            Matcher Mymatcher = MyPattern.matcher(name);
            Myboolean = Mymatcher.matches();
            if(Myboolean == false)
            {
                System.out.println("Please Enter the Correct Name: ");
                Myboolean = true;
            }
            else{
                Myboolean = false;
                }
            }
        while (Myboolean == true);
        do {
            System.out.println("Enter the Contact Number:");
            contactnumber = input.nextLine();
            Pattern MyPattern1 = Pattern.compile("(\\d-)?(\\d{2}-)?\\d{4}-\\d{4}");
            Matcher MyMatcher1 = MyPattern1.matcher(contactnumber);
            Myboolean1 = MyMatcher1.matches();
            
            if 
            (Myboolean1 ==false)
            {
                System.out.println("Please Enter the Correct Contact Number:");
                Myboolean1 = true;
            }
            else
            {
                Myboolean1 = false;
            }
            }
        while (Myboolean1 == true);
        System.out.println("---------------------");
        System.out.println("______________________");
        System.out.println("Name and Contact Number are Correct");
        
        System.out.println("---------------------");
        System.out.println("______________________");
        System.out.println("Name :" + name);
        System.out.println("Contact Number :" + contactnumber);
          
        }
        // TODO code application logic here
    }
    

