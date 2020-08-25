package com.assignment.abstracts;

interface Shape2
	{
	 abstract void calArea();
	 abstract void displayArea();
	}
class Circle implements Shape2
{	 @Override
	 public void displayArea()
	 {
		 System.out.println("This is area of circle");
	 }
	 public void calArea(int r) 
	 {
		 System.out.println("Area of circle is: " +3.15f*r*r);
	 }
@Override
	public void calArea()
	{
		// TODO Auto-generated method stub
	}
}
public class Interface4
{
	public static void main(String args[])
	 {
		 Circle c= new Circle();
		 c.calArea(9);
		 c.displayArea();
		 Circle objref= new Circle();
	 }
}





