/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author UCSCMH_NS159818
 */
public class Prime 
{

    public static void main(String args[])
	{
		int input, i,j, half, flag = 0;
                
		input=50;
                System.out.println("The Prime Numbers from 1 to"+input+"are:");
                for(i=1; i<=input;i++)
		
		{	flag=0;
			half= i /2;
                for(j=2;j<=half;j++)
			{ 
				if (i%j==0)
				{
				flag=1;
				break;
				}
			}
                        if (flag==0)
                        {
                            System.out.println(i);
                        }
                }
		
	}
}

    

