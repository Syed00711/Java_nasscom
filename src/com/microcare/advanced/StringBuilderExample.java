package com.microcare.advanced;

public class StringBuilderExample {

	public static void main(String[] args) {
		//StringBuilder sb =new StringBuilder("Test=======");
		StringBuffer sb =new StringBuffer();
		sb.append(10).append(" ");
		sb.append("hello").append(" ");
		sb.append(false).append(" ");
		System.out.println(sb.toString());
StringBuilder sb1 =new StringBuilder("miccare");
System.out.println(sb1=sb1.insert(3, "rojsdkjfskjdfksj", 0, 2));

//System.out.println(sb1.insert(8, "academy"));
System.out.println(sb1.reverse());
System.out.println(sb1.replace(3, 5, "ab"));
System.out.println(sb1.delete(2, 5));

		
		
		

	}

}
