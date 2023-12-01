package Inheritance;

import com.microcare.advanced.Access2;

public class A {
public int a;
static {
	 System.out.println("static A class");
}

public A() {
	a=10;
	System.out.println("A default constructor");
}

public A(int a) {
	System.out.println("A clas param constructor");
	this.a=a;
}
//override
public int a() {
	AbstractionExample ac =new Access2();
	
	return a;
}
///inheritence
public int a(int c) {
	System.out.println("A class");
	return c;
}

//override
public String a(String s) {
	System.out.println("A class");
	return s;
}
}
