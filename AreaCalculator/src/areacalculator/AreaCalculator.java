/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalculator;

/**
 *
 * Chap 5 Exercise 2
 */
public class AreaCalculator 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Square sobj = new Square(48.5);
       sobj.calArea();
        System.out.println("The Area of Square is " + sobj.disArea());

        Rectangle robj = new Rectangle(12.5, 8);
        robj.calArea();
        System.out.println("The Area of Rectangle is " + robj.disArea());
        
        Circle cobj = new Circle(7.9);
        cobj.calArea();
        System.out.println("The Area of Circle is " + cobj.disArea());

        Triangle tobj = new Triangle(12, 20);
        tobj.calArea();
        System.out.println("The Area of Triangle is " + tobj.disArea());
        
        
    }
    
}
