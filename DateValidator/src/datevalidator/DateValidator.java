/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datevalidator;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator 
{

   private final Pattern pattern;
   private Matcher matcher;
   private static final String DATE_PATTERN = 
           "(0?[1-9]|[12][0-9]|3[01])/(?[1-9]|1[12])/((19|20)\\d\\d)";
   
   public DateValidator(InputStream in)
   {
       pattern = Pattern.compile(DATE_PATTERN);
   }
   public boolean validate(final String date)
   {
       matcher = pattern.matcher(date);
       if (matcher.matches())
       {
           matcher.reset();
           if (matcher.find())
           {
               String day = matcher.group(1);
               String month = matcher.group(2);
               int year = Integer.parseInt(matcher.group(3));
               
               if (day.equals("31")
                       &&(month.equals("4")|| 
                       month.equals("6") || month.equals("9")
                       || month.equals("11")
                       || month.equals("04") || month.equals("06")
                       || month.equals("09")))
                       {
                           return false;
                           
                       }
               else if (month.equals("2") ||month.equals("02"))
               {
                  
                   if (year % 4 == 0)
                   {
                       return !(day.equals("30") || day.equals("31"));
                  
                       }
                   }
                   else
                   {
                       return false;
                    }
               }
               else
               {
                   return false;
               
               
               }
           }
       return false;
       
    
       }
       
   
   
public static void main(String[] args) 
    {
        DateValidator dv = new DateValidator(System.in);
       boolean status;
       do
       {
           Scanner sc = new Scanner(System.in);
           String dt;
           
           System.out.println("Enter the Date");
           dt = sc.next();
           
           status = dv.validate(dt);
           if(status)
           {
               System.out.println("Date is in COrrect Format");
           }
           else 
           {
               System.out.println("Date is not in Correct Format");
           }
           
        }
       while (status ==false);
    }
}

