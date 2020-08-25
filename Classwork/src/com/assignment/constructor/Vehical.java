package com.assignment.constructor;

public class Vehical {
	String color;
	int wheelcnt;
	int gearcnt;
	Vehical()
	{
		System.out.println("This is default constructor");
	}
	
	Vehical(String color,int wheelcnt,int gearcnt)
	{ this();
	this.color=color;
	this.wheelcnt=wheelcnt;
	this.gearcnt=gearcnt;
	}
	
void Display()
	{
	System.out.println("This color is :"+color);
	System.out.println("This wheel is :"+wheelcnt);
	System.out.println("This gear is :"+gearcnt);
	}
	public static void main(String[]args)
	{
		Vehical v=new Vehical("pink",101,10);
		v.Display();
				
	}
}
	