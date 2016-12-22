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
public class Shape implements Area
{

    @Override
    public void area(int a, int b) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void area(double l) {
        System.out.println("ARea of Shape" + (3.14*l*l)); //To change body of generated methods, choose Tools | Templates.
    }
   
}
