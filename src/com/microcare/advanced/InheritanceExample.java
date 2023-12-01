package com.microcare.advanced;

public class InheritanceExample {
public static void main(String[] args) {
	Circle cc=new Circle(10);
	Circle cc1=new Circle(15);
	System.out.println(cc.getArea());
	System.out.println(cc.getPerimeter());
	System.out.println(cc.toString());
	System.out.println(cc1.getArea());
	System.out.println(cc1.getPerimeter());
    System.out.println(cc1.toString());
}
}
