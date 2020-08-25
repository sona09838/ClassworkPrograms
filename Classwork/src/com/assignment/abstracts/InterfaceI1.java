package com.assignment.abstracts;

public interface InterfaceI1 
		{
		public void Display();
		public	void calarea();
		}
//@ override
 class Demo1 implements InterfaceI1 
{
	 //@override
	public void Dispaly()
	{
		System.out.println("Display");
	}
	public	void calarea(int pi,int a)
	{
		System.out.println("calarea"+3.14*a*a);	
	}
	

	public static void main(String[] args)
	{
	
	 Demo1 objreff;
	 Demo1 demo1obj=new Demo1();
	 InterfaceI1 objref;
	 demo1obj.Dispaly();
	 demo1obj.calarea();

	}

}
