/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author UCSCMH_NS159818
 */
public class Rectangle {

    double length;
    double breadth;
    
    
    public Rectangle (double len, double  brd)
    {
        length=len;
        breadth=brd;
    }
    
    public boolean equals (Object obj)
        {
            Rectangle rec = (Rectangle) obj;
            
            if (this.length==rec.length && this.breadth==rec.breadth)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
    public static void main(String[]args)
    {
     Rectangle obj1= new Rectangle(12.01, 24.8);
     Rectangle obj2 = new Rectangle(12.5,24.8);
     if(obj1.equals(obj2))
     {
         System.out.println("obj1 and obj2 are equal");
     }
     else 
     {
         System.out.println("obj1 and obj2 are  not equal");
         
     }
    }
    
    
}
