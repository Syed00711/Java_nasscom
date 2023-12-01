package com.microcare.advanced;

import com.microcare.test.AccessModifierTest;

public class TestClass {
	private static int i=0;
	public static void main(String[] args) {
		AccessModifierTest ac =new AccessModifierTest();
		
		System.out.println(ac.areaofcircle(5));
		System.out.println(ac.areaofcircle(4));
		System.out.println(ac.areaofcircle(2));
		System.out.println(ac.volofrectangle(9,5,2));
		System.out.println(ac.volofrectangle(1,1,1));
		
		
		
	}
	protected static int test(int p) {
		int n=0;
		System.out.println(i);
		test2(7);
		
		System.out.println(i+n);
		return n+i;
	}
	
	public static void test2(int p) {
		System.out.println(i);
		
	}

}
