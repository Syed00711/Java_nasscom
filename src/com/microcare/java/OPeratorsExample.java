package com.microcare.java;

public class OPeratorsExample {
	
	public static void main(String[] args) {
		int i=5;
		int s=4;
		      //5      3
		int n= i++ + --s;
		//++i    i=1+i
		//i++    i=i+1;
		
		System.out.println(n);
		
		System.out.println(i);
		System.out.println(s);
		
		String s1="microcare";
		String s2="Microcare";
		//ternary oprator
		String s3= s1.equalsIgnoreCase(s2)?s1:s2;
		
		System.out.println(s3);
		
	}

}
