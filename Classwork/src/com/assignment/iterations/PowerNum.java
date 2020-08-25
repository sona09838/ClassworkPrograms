package com.assignment.iterations;

import java.util.Scanner;

public class PowerNum {

	public static void main(String[] args) 
		
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your number");
			int num, num1;
			num=s.nextInt();
			num1=num*num;
			System.out.println("The power is:"+num1);
		}
	}
