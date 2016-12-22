/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgame;

/**
 *
 * @author UCSCMH_NS159818
 */
abstract class GameConsole 
{
 int score;
 void displayScore()
 {
     System.out.println("Your Score is 10");
     
 }
 
 abstract void computeScore();
 
 
}
