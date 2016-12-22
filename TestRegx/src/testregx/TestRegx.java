/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testregx;

/**
 *
 * @author UCSCMH_NS159818
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


 public class TestRegx {

 public static void main (String [] args) {
 Scanner sc = new Scanner (System.in);
 String input;

 System.out.print ("Enter the string: ");
 input = sc.next ();
 Pattern myPattern = Pattern.compile(" [abc] at");
 Matcher myMatcher = myPattern.matcher(input);
 boolean  myBoolen  = myMatcher.matches();
 if (myBoolen) {
      System.out.println ("Expression is Matched");
    } else {
      System.out.println ("Expression Not Matched");
    }
  }

}
