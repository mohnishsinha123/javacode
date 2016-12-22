/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author 00109
 */
public class Overloading {

    /**
     * @param r
     */
    //2 method with same name same return type but with diff arguments
    
    public void area(int r)
    {
        System.out.println("area of circle is:" +(3.14*r*r));
        
    }
    public void area(int l,int b)
    {
        System.out.println("area of rectangle is:"+(l*b));
    }

    /**
     *
     * @param l
     * @param a
     * @param b
     */
    public void area(double l, int a,int b)
            
    {
        System.out.println("area of triangle is:"+(0.5*a*b));
    }
    public static void main(String[] args) 
    {
     Overloading o= new Overloading();
     
    o.area(20);
    o.area(10, 25);// TODO code application logic here
    o.area(5, 12, 20);
    }
    
}
