package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {
		String [] s= {"abc","def","ghi","xyz"};
	
		ArrayList<String> ar =new ArrayList<>(List.of(s));
		System.out.println(ar.toString());
		ArrayList<String> ar1 =
				new  ArrayList<>(List.of("123","456","789"));
		System.out.println(ar1.toString());
		ar.add("more 1");
		System.out.println(ar.toString());
		// e..... elem
		
		ar.addAll(ar1);
		System.out.println(ar.toString());
		
		ar.add(2,"insert");
		ar.add("ghi");
		System.out.println(ar.toString());
		List ar2=ar.subList(0, 6);
		ar.removeAll(ar1);
		System.out.println(ar.toString());
		
		
		
		/*for(int i=0;i < ar.size();i++) {
			System.out.println(ar.get(i));
			
		}*/
		//ar.forEach(System.out::println);
		ArrayList<String> ar3 =new ArrayList<>();
		ar.forEach(e ->{
		if(e.length()<=3) {
			
			ar3.add(e);
		}
		});
		System.out.println(ar3.toString());
		//ArrayList<String> newar=(ArrayList)ar.clone();
		
		//System.out.println(newar.toString());
	}

}
