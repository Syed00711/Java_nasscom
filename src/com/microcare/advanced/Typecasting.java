package com.microcare.advanced;

public class Typecasting {

	public static void main(String[] args) {
		A a =new A();
		a.i=10;
		
		B b =new B();
		b.i=15;
		b.j=20;
		
		a=b;
		System.out.println(a.i);

	}

}

class A{
int i;	
}

class B extends A{
	int j;
}
