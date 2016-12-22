/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author UCSCMH_NS159818
 */
public class Object 

{

    public static void main(String[] args) 
    {
       ObjectCounter obj = new ObjectCounter();
        System.out.println("Total number of objects: " + ObjectCounter.counter);

        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        System.out.println("Total number of objects :" + ObjectCounter.counter);// TODO code application logic here
    }
    
}
