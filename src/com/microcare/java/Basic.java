package com.microcare.java;

import java.util.Calendar;

public class Basic {

	static int i=5;
	public static void main(String[] args) {
		//primitve data type
		byte b =5;
		short s =10;
		int i =15;
		long l =20;
		
		float f =21.4213f;
		double d =4123412;
		
		char c='@';
		boolean val =true;
		/*
		 * below are non-primitive data type
		 * exmaple code
		 * 
		 * 
		 * 
		 * */
		String text ="This is a string";
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(val);
		System.out.println(text);
		System.out.println(Calendar.getInstance().getTime());

	}

}
