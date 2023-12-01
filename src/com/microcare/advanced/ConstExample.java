package com.microcare.advanced;

public class ConstExample {
	
	int age;
	String name;
	String course;
	
	static int extra;
	
	static {
		System.out.println("static block");
		extra=5;
		
	}
	
	public static int satcheck() {
		
		return extra;
	}
	
	public void nonsat() {
		satcheck();
	}
	
	public ConstExample() {
		
		System.out.println("Default const");
		this.age=5;
		this.name="Rohit";
		this.course="Java";
		this.extra=10;
	}
	
	public ConstExample(int age,String name) {
		System.out.println("2 parameter const");
	}
	
	public ConstExample(int age,String name,String course) {
		System.out.println("3 parameter const");
		
		this.age=age;
		this.name=name;
		this.course=course;
	}

}
