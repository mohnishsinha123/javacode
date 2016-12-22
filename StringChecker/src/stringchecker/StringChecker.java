/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringchecker;

/**
 *
 * @author UCSCMH_NS159818
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringChecker 
{
  public static void main(String[] args) 
  {
      Pattern alphaPattern = Pattern.compile("[a-zA-z]*");
      Pattern digitPattern = Pattern.compile("[0-9]*");
      
      Scanner input = new Scanner(System.in);
      int alphaCounter=0, digitCounter=0;
      
      System.out.println("Enter the String:");
      String name = input.nextLine();
      
      for (int i=1;i<name.length();i++)
      {
          char temp = name.charAt(i);
          StringBuilder sTemp = new StringBuilder();
          sTemp.append(temp);
          
          Matcher alphaMatcher = digitPattern.matcher(sTemp);
          Boolean alphaStatus = alphaMatcher.matches();
          if (alphaStatus)
          {
              alphaCounter++;
          }
          
          Matcher digitMatcher = digitPattern.matcher(sTemp);
          Boolean digitStatus = digitMatcher.matches();
          if(digitStatus)
          {
              digitCounter++;
          }
      }
      System.out.println("There are " +     alphaCounter + "alphabet() and " + digitCounter + "digit ()");
      
    }
    
}
