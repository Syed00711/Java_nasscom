package com.microcare.java;

public class ForLoop {

	public static void main(String[] args) {
		
		
		for(int n=11;n>10;n=n+5) {
			/*for(int i=0;i<5;i++) {
				System.out.print("*");
			}*/
			
			if(n>200) {
				break;
			}
			System.out.println(n);
		}

	}

}
