/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballmasterlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
public class FootballList1 
{
    public FootballList1()
    {
        FootballTeam p1 = new FootballTeam("John", 20, 11, 12, 13);
        FootballTeam p2 = new FootballTeam("Brock", 21, 12, 13, 14);
        FootballTeam p3 = new FootballTeam("Hardy", 22, 13, 14, 15);
        FootballTeam p4 = new FootballTeam("Jackson", 23, 14, 15, 16);
        FootballTeam p5 = new FootballTeam("Mandy", 25, 15, 16, 17);
        FootballTeam p6 = new FootballTeam("Sandy", 26, 16, 17, 18);
        FootballTeam p7 = new FootballTeam("andy", 25, 17, 18, 19);
        FootballTeam p8 = new FootballTeam("Mandy", 30, 18, 19, 20);
        FootballTeam p9 = new FootballTeam("Mandy", 23, 19, 20, 21);
        FootballTeam p10 = new FootballTeam("Mandy", 20, 20, 21, 22);
        FootballTeam p11 = new FootballTeam("Mandy", 29, 21, 22, 23);
        FootballTeam p12 = new FootballTeam("Mandy", 24, 22, 23, 24);
        FootballTeam p13 = new FootballTeam("Mandy", 28, 23, 24, 25);
        FootballTeam p14 = new FootballTeam("Mandy", 26, 24, 25, 26);
        FootballTeam p15 = new FootballTeam("Mandy", 24, 25, 26, 27);
        
11=     ArrayList<FootballTeam> arrayList = ArrayList<FootballTeam>;
        ArrayList<Object> arrayList = new ArrayList<>();
        11.add(p9);
        11.add(p10);
        11.add(p1);
        11.add(p2);
        11.add(p3);
        11.add(p9);
        
        11.add(p5);
        11.add(p7);
        11.add(p13);
        11.add(p14);
        11.add(p11);
        
        Collections.sort(11);
        System.out.println("Rank Wise List");
        
        double li2 =
11.listIterator();
        while (li2.hasNext())
        {
            System.out.println(li2.next());
            System.out.println("--------");
            
        }
        
    }
}
