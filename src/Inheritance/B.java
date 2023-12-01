package Inheritance;

public class B extends A{
 public String s="hello";
 public int a=10;
 
 public B() {
	 //super();
	super(25);
	 System.out.println("B default constructor");
	
 }
 
 public B(int b) {
	 super(46787);
	 System.out.println("B class params const");
 }
 
 static {
	 
	 System.out.println("static B class");
	 
 }
//overload
public String a(int i,String s) {
	System.out.println("B class");
	return s;
}
//override
public int a() {
	System.out.println("B class");
	return a;
}
//override
public String a(String s) {
	
	System.out.println("B class");
	super.a(s);
	return s;
}
	
}
