/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matchexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MatchExp 
{
    public static void main(String[] args) 
    {
        String Email = ("mohnish.sinha@gmail.com");
        
        Pattern p1 = Pattern.compile("(\\S+?)\\.(\\S+?)\\@(\\S+)");
        Matcher m1 = p1.matcher(Email);
        
        if (m1.find());
        {
            System.out.println("First :" + m1.group(1));
            System.out.println("Last :" + m1.group(2));
            System.out.println("Domain : " + m1.group(3));
            System.out.println("Everything Matched : " + m1.group(0));
        }
    }
    
}
