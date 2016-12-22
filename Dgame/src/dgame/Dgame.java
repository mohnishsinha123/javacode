/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgame;

/**
 *
 * Chap 5 Exercise 3
 */
public class Dgame 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Badminton obj1 = new Badminton();
     obj1.playGame();
     obj1.computeScore();
     obj1.displayScore();

    Basketball obj2 = new Basketball();
    obj2.playGame();
    obj2.computeScore();
    obj2.displayScore();// TODO code application logic here
    }
    
}
