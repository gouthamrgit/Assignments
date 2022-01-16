package com.Assignment1.Assign;

class A{
	public int num=23;
	void display() {
		System.out.println("Public");
	}
}
class B{
	private int num1=23;
	void display1() {
		System.out.println("Private");
	}
	
}
class C{
	protected int num2=23;
	void display2() {
		System.out.println("Protected");
	}
	
}
class D{
	int num3=23;
	void display3() {
		System.out.println("Default");
	}
	
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.display();
		B b=new B();
		b.display1();
		C c=new C();
		c.display2();
		D d=new D();
		d.display3();
		
	}

}
