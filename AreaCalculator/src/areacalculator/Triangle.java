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
class Triangle extends Area
{
 public Triangle(double bas, double  high)
 {
     sim1 = bas;
     sim2 =  high;
 }
 void calArea()
 {
     result = sim1 * sim2 / 2 ;
 }
}
