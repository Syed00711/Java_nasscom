package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseExample {

	public static void main(String[] args) {
		List<String> ar2 =List.of("abc","def","ghi","xyz");
		List<String> ar = Arrays.asList("123","456","789","589");
		System.out.println(ar2.toString());
		ArrayList<String> ar3 =new ArrayList<>(ar2);
		
		Collections.reverse(ar3);
		
		System.out.println(ar3.toString());
		
		
		ListIterator lt=ar.listIterator();
		
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
		
		
		for(String s: ar2) {
			System.out.println(s);
		}
		ar2.forEach(name -> {});
	}

}
