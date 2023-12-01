package com.microcare.test;

import java.util.Scanner;

public class RandomExample {

	public static void main(String[] args) {
		int num =(int)(Math.random() * 10000);
		System.out.println(num);
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Guess The number:");
		do {
			
			int i=sc.nextInt();
			if(i<num) {
				System.out.println("Re-enter a greater num than:"+i);
			}
			else if(i> num) {
				System.out.println("re-enter a less number:"+i);
			}
			else {
				System.out.println("correct!!!!!"+num);
				break;
			}
			
		}while(true);*/

	}

}
