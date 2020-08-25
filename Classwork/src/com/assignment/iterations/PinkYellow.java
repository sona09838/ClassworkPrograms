 package com.assignment.iterations;

public class PinkYellow {

	public static void main(String[] args) 
	{
		int c1=0,c2=0,c3=0;
		
		for(int i=33;i<=999;i=i+1)
		{
if(i%3==0)
{
	c1++;
	System.out.println("Pink");
	}
else if(i%5==0)
{
	c2++;
	System.out.println("YEllow");
	
}
else if(i%3==0||i%5==0)
	{	
	c3++;
	System.out.println("yellowpink");
	}
System.out.println("Pink: "+c1+"Yellow:"+c2+"Pink and Yellow"+c3);
		}
	}
}
