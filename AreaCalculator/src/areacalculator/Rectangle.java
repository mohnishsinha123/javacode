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
 class Rectangle extends Area
 {
     public Rectangle(double ln, double br)
     {
         sim1 = ln;
         sim2 = br;
     }
    void calArea()
    {
        result = sim1 * sim2;
    }
}
