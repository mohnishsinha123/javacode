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
 class Circle extends Area
 {
  double pie = 3.14;
  public Circle (double rad)
  {
      sim1 = rad;
  }
     void calArea()
     {
         result = pie * sim1 * sim1;
     }
}
