package com.microcare.java;

public class StringExample {

	public static void main(String[] args) {
		
		String s ="MicrocarE-aca:demy-class-java";
		String s2 = " this is a java class 8";
		
		String s6="java";
		String s7 ="   JA    VA   ";
		
		//convert staring to char[]
        //loop each char and compare with char M
		//upper equals to upper
		//print
		
		
		
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s.indexOf("o"));
		System.out.println(s.indexOf("y"));
		System.out.println(s2.indexOf("java"));
		
		System.out.println(s2.indexOf("is"));
		String[] s3=s.split(":");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
	//	System.out.println(s3[2]);
	//	System.out.println(s3[3]);
		String[] s4 =s2.split(" ");
		System.out.println(s4.length);
		
		System.out.println(s2.charAt(20));
		System.out.println(s.concat(" ").concat(s2));
		System.out.println(s+" "+s2);
		
		System.out.println(s6.equals(s7));
		System.out.println(s6.equalsIgnoreCase(s7));
		System.out.println(s6==s7);
		System.out.println(s7.trim().trim());
		System.out.println(s7.stripLeading());
		System.out.println(s7.stripTrailing());
		System.out.println(s7.replace("J", "AAAAAAAAA").replace("A", "BBBBBBBB"));
		System.out.println(s2.startsWith(" "));
		
		System.out.println(s2.endsWith("      "));
		
		System.out.println();
		
		String s9="         ";
		
		String s10="0123456789";
		
		System.out.println(s9.isEmpty());
		System.out.println(s9.isBlank());
		System.out.println(s6.lastIndexOf("a"));
		System.out.println(s.substring(8));
		System.out.println(s10.substring(5,9));

	}

}
