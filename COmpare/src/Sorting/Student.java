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
public class Student implements Comparable
{
 private String name;
 private int marks;


 public Student (String nm, int mk)
 {
    this.name = nm;
    this.marks = mk;
 }
 public int getMarks()
 {
     return marks;
 }
 public String getName()
 {
     return name;
 }
 public void setName(String name)
 {
     this.name = name;
     
 }
 public int compareTo(Object obj)
 {
     Student s = (Student) obj;
     
     if (this.marks > s.getMarks())
     {
         return 1;
     }
     else if 
             (this.marks < s.getMarks())
     {
         return -1;
      }
     else
     {
      return 0;
     }
 }
 public String toString()
 {
     StringBuffer buffer = new StringBuffer();
     buffer.append(" Name : " + name + "\n" );
     buffer.append("Marks : " + marks + "\n" );
     return buffer.toString();
 }
   //* @Override
   //* public int compareTo(Object o) {
      //*  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
}
