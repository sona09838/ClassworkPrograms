package com.assignment.constructor;

public class Rectangle {
	int  l,w;

	Rectangle(int l,int w)
	{
		this.l=l;
	    this.w=w;
	}
	void rectanglearea()
	{
		int area=l*w;
		System.out.println("The area of rectangle is :"+area);
	}
	void reactangleperimeter()
	{
		int perimeter=2*(l+w);
		System.out.println("The area of perimeter is :"+perimeter);
	}
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle(12,12);
		r.rectanglearea();
		r.reactangleperimeter();
	}

}
