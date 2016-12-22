/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furnituredata;

/**
 *
 * Chap 5 Exercise 1
 */
public class FurnitureDemo {
     public static void main(String[] args) 
    {
    BookShelf b1 = new Bookshelf();
    b1.accept();
    b1.display();
    
    chair c1 = new chair();
    c1.accept();
    c1.display();
    
}

    private static class Bookshelf extends BookShelf 
    {

        public Bookshelf() 
        {
        }
    }
}
