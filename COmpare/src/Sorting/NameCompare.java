/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author UCSCMH_NS159818
 */
import java.util.Comparator;
public class NameCompare implements Comparator
{
    public int compare (Object a, Object b)
    {
        Student x = (Student) a;
        Student y = (Student) b;
        return x.getName().compareTo(y.getName());
    }

    
}

