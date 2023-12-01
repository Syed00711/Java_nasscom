package DataStructures;

import java.util.ArrayList;

public class Linear {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<>();
		//fixed size 10,duplicate,sequential
		al.add(10);
		al.add(20);
		al.add(35);
		al.add(10);
		System.out.println(al.size());
		System.out.println(al.get(3));
		System.out.println(al.toString());

	}

}
