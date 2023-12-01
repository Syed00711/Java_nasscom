package DataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		ArrayList<Integer> a = 
				new ArrayList<>(List.of(1,2,4,5,2,1,6,4,4));
		
		ArrayList<Integer> ab = 
				new ArrayList<>(List.of(10,20,40,50,02,51,46,34,34));
		
		ArrayList<ArrayList<Integer>> a2 =new ArrayList<>();
		
		a2.add(ab);
		a2.add(a);
		System.out.println(a2.stream()
				.flatMap(aa -> a.stream())
				.collect(Collectors.toList()));
		
		System.out.println(a2);
//System.out.println(a.stream().distinct().count());\
		List<Integer>a1=a.stream().filter(e -> e%2==0).collect(Collectors.toList());
System.out.println(a1.toString());

     System.out.println(a.parallelStream().map(e -> e*e).filter(x -> x>10).collect(Collectors.toList()));
	}

}
