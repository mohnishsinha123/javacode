/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;


class area

{
    public void area(int l, int b)
    {
    
    }
}
    
class Triangle extends area
{
    @Override
    public void area(int l, int b)
    {
        System.out.println("The area of Triangle is:"+(0.5*l*b));
    }
}
    
class Rectangle extends area
{
      
            @Override
            public void area(int l, int b)
    {
        System.out.println("The area of Triangle is:"+(l*b));
    }
} 
class Square extends area
{
    @Override
    public void area(int A, int a)
    {
        System.out.println("The area of Square is:"+(A=a*a));
    }
}
class Circle extends area
{
    @Override
    public void area(int r, int h )
    {
        System.out.println("The area of Circle is:" + (r*r*h));
    }
}
class Cone extends area
{
    @Override
    public void area(int r, int h )
    {
        System.out.println("The area of Cone is:" + (1/3*r*r*h));
    }
}
    class Polymorphism
    {
    public static void main(String args[]) 
        {          
      Triangle t1;
      Rectangle r1;
      Square s1;
      Circle c1;
      Cone c2;
        
      t1 = new Triangle();
      r1 = new Rectangle();
      s1 = new Square();
      c1= new Circle();
      c2= new Cone();
      
      t1.area(10, 40);
      r1.area(20, 14);
      s1.area(12, 24);
      c1.area(10, 50);
      c2.area(19, 5);
        }
    
    }



