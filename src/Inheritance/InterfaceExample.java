package Inheritance;

public interface InterfaceExample {
	
	public static int valid() {
		return 5;
	}
	
	default void process(){
		methods();
	}
	
	private void methods() {
		
	}
	
	public  String check(String a,String b);

}
