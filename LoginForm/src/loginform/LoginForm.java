/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

/**
 *
 * @author UCSCMH_NS159818
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LoginForm 
{

  @SuppressWarnings("empty-statement")
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);
      String email, password;
      Pattern MyPattern, MyPattern1;
      Matcher MyMatcher, MyMatcher1;
      Boolean MyBoolean, MyBoolean1;
      int flag = 0, flag1 = 0;
      
      MyPattern  = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
      MyPattern1 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$");
      
      do 
      {
          flag = 0;
          System.out.println("Enter the email -id : ");
          email = sc.nextLine();
          
          MyMatcher = MyPattern.matcher(email);
          MyBoolean = MyMatcher.matches();
          
          if (MyBoolean == true)
          do 
          {
              flag = 0;
              System.out.println("Enter the Password : ");
              password = sc.nextLine();
              
              MyMatcher1 = MyPattern1.matcher(password);
              MyBoolean1 = MyMatcher1.matches();
              
          if (MyBoolean1 == true)
            {
              System.out.println("\nYou have Entered a valid email id and password\n");
              
            }
          else 
                {
              System.out.println("\nPassword is Incorrect\n");
              flag = 1;
               }
          while (flag ==1);
          {
              System.out.println("\nEmail id Is Incorrect\n");
              flag =1;
            }
                    