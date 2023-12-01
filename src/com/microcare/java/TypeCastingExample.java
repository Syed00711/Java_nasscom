package com.microcare.java;

public class TypeCastingExample {

	public static void main(String[] args) {
		int i=150;
		
		//explicit typecasting
		
		byte b=(byte)i;
		
		//implicit typecasting
		long l=i;
		
		float f1=34.554f;
		//implicit typecasting
		float f=i;
		
		//explicit typecasting
		int i2 =(int)f1;
		
		System.out.println(i2);
		
		

	}

}
