/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

/**
 *
 * @author UCSCMH_NS159818
 */
public class Addition
{
	public int add1(int sag1, int Gan2, int Moh3)
	{ 
            return sag1 + Moh3;
        } 
	public double ad2(double sag1, double Gan2, double Moh3)
	{
            return(double) sag1 + Gan2 + Moh3;
        }
        public int add3(int sag1, int Gan2, int Moh3)
        {
            return sag1 + Gan2 + Moh3;
        }

   	public static void main(String args[])
	{
	int m=24, s=23, g=18;
	double v= 5.7 , r=3.8,q=4.9; 
        int a=10, b=15,c=245;
	Addition obj= new Addition();
	
	System.out.println("The adition of three integer numbers is:"+obj.add1(m,s,g));
        
        System.out.println("The adition of two fractional numbers is:"+obj.ad2(v,r,q));
        
            System.out.println("The Addition of three integer number is:"+ obj.add3(a, b, c));

	}
}

    
    

