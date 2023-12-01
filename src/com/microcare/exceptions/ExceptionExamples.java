package com.microcare.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionExamples {

	public static void main(String[] args)  {
		Scanner sc =new Scanner(System.in);
		int[] i =new int[5];
		
		
		
		while(true) {
			
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {		
			
		int c=a/b;
		CheckExcep(b);
		System.out.println(c);
		}catch(ArithmeticException ae) {
		ae.printStackTrace();	
		}
		finally {
			System.out.println("Finally!!!!!!!");
		}
}

	}
	
	
	public static void CheckExcep(int b)   {
		if(b<10) {
			throw new UserDefinedException("B cannot be less than 10");
		}
		
		
		
	}
	

}
