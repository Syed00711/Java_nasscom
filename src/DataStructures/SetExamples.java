package DataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		Set<Integer> ss=new HashSet<>();
		
		ss.add(null);
		ss.add(1);
		ss.add(2);
		ss.add(1);
		
		System.out.println(ss.toString());
LinkedHashSet<Integer> ls =new LinkedHashSet<>();
SortedSet<Integer> s1=new TreeSet<>();
s1.add(5);
s1.add(1);
s1.add(3);
s1.add(2);
s1.add(4);
SortedSet<Integer> s3=s1.subSet(2, 4);
SortedSet<Integer> s4=s1.tailSet(2);
System.out.println(s4.toString());
System.out.println(s1.first());
System.out.println(s3.toString());
System.out.println(s1.toString());

SortedSet<String> s2=new TreeSet<>();
s2.add("$xynz");
s2.add("XAAaafasdfas");
s2.add("125xasbnchd");
s2.add("aaaaaaxxxxx");
s2.add("aaaafasdfas");
s2.add("");


System.out.println(s2.toString());

		

	}

}
