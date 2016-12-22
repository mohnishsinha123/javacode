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
public class FactoryDemo 
{
 public  Area getFact(String Facttype)
 {
     if (Facttype==null)
     {
         return null;
     }
     if (Facttype.equalsIgnoreCase("Rectangle"))
     {
         return new Rectangle();
     }
     if (Facttype.equalsIgnoreCase("Triangle"))
     {
         return new Triangle();
     }
     if (Facttype.equalsIgnoreCase("Shape"))
     {
         return new Shape() ;
     }
     return null;
 }
}
