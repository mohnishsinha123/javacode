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
public abstract class Furniture 
{
   protected String color;
   protected int width;
   protected int height;
   public abstract void accept();
   public abstract void display();
}

