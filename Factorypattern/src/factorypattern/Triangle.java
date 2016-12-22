/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author UCSCMH_NS159818
 */
public class Triangle implements Area
{
    public void area (int a, int b)
    {
        System.out.println("ARea of Triangle" + (3.14*a*b));
    }
    public void area (double l)
    {
        
    }
}
