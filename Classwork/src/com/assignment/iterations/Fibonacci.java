package com.assignment.iterations;

public class Fibonacci {

	public static void main(String[] args) 
	{int num1=0,num2=1,count=10;
		// TODO Auto-generated method stub
	for(int i=2;i<count;i++)
	{
		System.out.print(num1+" ");
		int result=num1+num2;
		
		num1=num2;
		num2=result;
	}
	}

}
