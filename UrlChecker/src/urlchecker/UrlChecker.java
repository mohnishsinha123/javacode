/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlchecker;

/**
 *
 * @author UCSCMH_NS159818
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UrlChecker {

 public static void main (String [] args) 
 {
   Pattern MyPattern = Pattern.compile("^((https?|ftp)://|(www|ftp)\\.)[a-z0-9-]+(\\.[a-z0-9-]+[a-z]+)+([/?].*)?$");
      
   Scanner input = new Scanner(System.in);
     System.out.println("Enter the Url to be checked:");
     
     String name = input.nextLine();
      Matcher Mymatcher = MyPattern.matcher(name);
      Boolean Myboolen = Mymatcher.matches ();
      if (Myboolen == true) {
          System.out.println ("Url is correct");
       } else {
          System.out.println ("Url is incorrect");
     }
  }
}
