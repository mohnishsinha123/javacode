/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furnituredata;



/**
 *
 * @author UCSCMH_NS159818
 */
class chair extends Furniture
{
    private int numOf_legs;
    public void accept()
    {
        String color = "Brown";
        int width = 36;
        int height = 50;
        int numOfLegs = 4;
        
    }
    public void display()
    {
        System.out.println(" Display Value of Chair ");
        System.out.println(" color is " + " color ");
       System.out.println("width is " + width);
        System.out.println("Height is " + height);
        System.out.println("Number of legs is " + numOf_legs);
        System.out.println("");
        
        
    }
}
