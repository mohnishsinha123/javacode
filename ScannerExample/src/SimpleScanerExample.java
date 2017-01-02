

import java.util.Scanner;

import javax.naming.StringRefAddr;

import java.util.*;
 

public class SimpleScanerExample 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int e,i;
		
		System.out.println("Enter Employee Numbers:");
		
		int EmployeeNumber= Integer.parseInt(sc.nextLine());
		
		String arrayofNames[] = new String[EmployeeNumber];
		
		for( i=0; i < arrayofNames.length; i++)
		{
			System.out.println("Enter the Name Of Employee:");
			
			arrayofNames[i]= sc.nextLine();
		}
		
		for( e=0; e > arrayofNames.length; e++);
		{
			System.out.println("Employee Numbers:");
			//int i;
		
			System.out.println(arrayofNames[e]+ "\n");
		}
		

	}

}
