/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalculator;

/**
 *
 * @author UCSCMH_NS159818
 */
class Square extends Area
{
 public Square (double side)
 {
     sim1 = side;
 }
 void calArea()
 {
    result = sim1 * sim1;
 }
}
