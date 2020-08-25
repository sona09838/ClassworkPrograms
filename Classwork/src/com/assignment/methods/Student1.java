package com.assignment.methods;

public class Student1 {int rollno;
String name;
long contactno;
int totalmarks;

void inputdata(int rn,String nm,Long mo_no,int tm)
{
	  rollno=rn;
	  name=nm;
	  contactno=mo_no;
	  totalmarks = tm;
}

	void Display()
{
		System.out.println("Student roll no :"+rollno);
		System.out.println("student name: "+name);
		System.out.println("Student contactno :"+contactno);
		
		System.out.println("Total marks: "+totalmarks);
}
public static void main(String[] args) 
{
	Student1 S=new Student1();
	S.inputdata(1,"sonali",9527414818l,3214);
	S.Display();
	
	
}

}



