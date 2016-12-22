/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author UCSCMH_NS159818
 */
public  class Rectangle extends Area
{
    @Override
    public void area(int l, int b)
    {
        System.out.println("The area of Rectangle is:"+(l*b));
    }
}