package DataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Stream;

public class Stream2Example {

	public static void main(String[] args) {
		
		System.out.println(
				Stream.of(1,2,3,4,5,6,7,8,9).skip(5).limit(2));
		System.out.println(
				Stream.of(1,2,3,4,5,6,7,8,9).allMatch(n -> n%2==0));
		System.out.println(
				Stream.of(1,2,3,4,5,6,7,8,9).anyMatch(n -> n%2==0));
		ArrayList<Integer> ar =
				new ArrayList<>(List.of(1,2,3,4,5,6,7));
	LinkedList<Integer> ll =
			new LinkedList<>(List.of(1,2,3,4,5,6,7));
	ll.addFirst(0);
	System.out.println(ll.peekLast());
	System.out.println(ll.pollLast());
	System.out.println(ll.offerFirst(10));
	System.out.println(ll.toString());
	
	Iterator<Integer> it=ll.descendingIterator();
	Iterator<Integer> it1=ll.iterator();
	
	Iterator<Integer> ait=ar.iterator();
	
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	Stack<Integer> st=new Stack<>();
	st.push(5);
	
	
	System.out.println(st.toString());
	
	Queue<Integer> q=new LinkedList<>();
	
	
	
	}
	
}
