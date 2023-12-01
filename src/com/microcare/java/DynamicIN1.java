package com.microcare.java;

import java.util.Scanner;

public class DynamicIN1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int k=sc.nextInt();
		
		for(int i=1;i<=k;i++) {
			for(int n=1;n<=i;n++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
