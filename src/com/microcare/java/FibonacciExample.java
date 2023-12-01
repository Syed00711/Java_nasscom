package com.microcare.java;

import java.util.Scanner;

public class FibonacciExample {

	public static void main(String[] args) {
		while(true) {
		int i=0;
		int n=1;
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		System.out.println(i);
		System.out.println(n);
		
		for(int j=2;j<k;j++) {
			int p=i+n;
			System.out.println(p);
			i=n;
			n=p;
		}
		System.out.println("===========================");
		}

	}

}
