package com.microcare.java;

public class ConditionalStatments {

	public static void main(String[] args) {
		char n = 's';
		
		final char n1='a';
		final char n2='h';
		final char n3='x';
		final char n4='c';
		final char n5='j';
		final char n6='w';
		
		
		switch(n) {
		   case 'd' :
		       System.out.println("Monday");
		       break;
		   case n2 :
		       System.out.println("Tuesday");
		       break;
		   case n3 :
		       System.out.println("Wednesday");
		       break;
		   case n4 :
		       System.out.println("Thursday");
		       break;
		   case n5:
		       System.out.println("Friday");
		       break;
		   case n6 :
		       System.out.println("Saturday");
		       break;
		   default :
		     //  System.out.println("Sunday");
		}
		int i=18;
		//== != > < => =<
		if(n=='z') {
			System.out.println("value of n is:"+n);
		}
		else if(i<10){
			System.out.println("the value of n is t");
		}
		else if(n!='s') {
			System.out.println("the value of n is s");
		}
		else {
			System.out.println("this is just else");
		}
		
		
		
		


	}

}
