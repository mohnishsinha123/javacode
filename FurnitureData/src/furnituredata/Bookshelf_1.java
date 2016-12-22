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
class BookShelf extends Furniture
{
  private int numOf_shelves;
  public void accept()
  {
      color = "Black";
      width = 72;
      height = 84;
      numOf_shelves = 5;
  }
  public void display()
  {
      System.out.println("Display Value for Bookshelf");
      System.out.println("color is" + color);
      System.out.println("width is" + width);
      System.out.println("height is" + height);
      System.out.println("Number of Shelves is" + numOf_shelves);
      System.out.println("");
  }
}
