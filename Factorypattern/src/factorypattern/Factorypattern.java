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
public class Factorypattern 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        FactoryDemo FactDemo = new FactoryDemo();
        Area a= FactDemo.getFact("Rectangle");
        a.area(15, 19);

        Area a1= FactDemo.getFact("Triangle");
        a1.area(8, 12);
         
        Area a2 =  FactDemo.getFact("shape");
        a2.area(12);
    }
    
}
