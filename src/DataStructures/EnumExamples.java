package DataStructures;

import java.lang.reflect.Array;
import java.util.Arrays;

enum COLOR{
	RED,BLUE,GREEN,YELLOW
}
public class EnumExamples {

	public static void main(String[] args) {
		System.out.println(Arrays.asList(COLOR.values()));
		checkColor(COLOR.YELLOW);
	}
	
	static void checkColor(COLOR c){
		switch(c) {
		case RED:
			System.out.println("This is a RED color");
			break;
		default:
			System.out.println("THIS is not red");
		}
	}

}
