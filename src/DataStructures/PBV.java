package DataStructures;

public class PBV {

	public static void main(String[] args) {
		int a=5;
		int b=a;
		changereference(b);
		System.out.println(b);
		System.out.println(a);

	}
	
	static void changereference(int c) {
		System.out.println(c);
		c=10;
		int d=11;
		c=d;
		c=15;
	}

}
