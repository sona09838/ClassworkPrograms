package com.assignment.conditional;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			{
			
			float units,bill;
			
		    Scanner s= new Scanner(System.in);
		    System.out.println("Enter units: ");
			units=s.nextFloat();
			

			
			if (units<=50)
			{
				bill=units-50*0.5f;
				System.out.println("The total bill is"+bill);
			}
			if (units>50 && units<=100)
			{
				bill=units-100*0.75f;
				System.out.println("The total bill is"+bill);
			}
			if (units>100 && units<=200)
			{
				bill=units-150*1.20f;
				System.out.println("The total bill is"+bill);
			}

			if (units>250 && units<=250)
			{
			bill=units-200*1.50f+(0.20f);
			System.out.println("The total bill is"+bill);
			}
		}
	}

}
