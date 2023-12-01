package DataStructures;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExamples {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq =new PriorityQueue<>((a,b)->a.compareTo(b));

pq.add(1);
pq.add(3);
pq.add(4);
pq.add(2);
pq.add(5);
pq.add(0);
System.out.println(pq.toString());

ArrayDeque<Character> ad=new ArrayDeque<>();
ad.add('d');
ad.add('z');
ad.add('a');
ad.addFirst('y');
ad.addLast('0');
ad.removeFirst();
ad.removeFirst();
ad.removeFirst();
System.out.println(ad.toString());
	}

}
