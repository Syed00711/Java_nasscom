package DataStructures;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import Inheritance.MicrocareStudents;

public class WeakExample {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap<MicrocareStudents, MicrocareStudents> map = new WeakHashMap<>();
		MicrocareStudents m1=new MicrocareStudents(null, null, null, null, 1123, null, false, null);
		
		MicrocareStudents m2=new MicrocareStudents(null, null, null, null,341234, null, false, null);
		
		map.put(m1, m2);
		System.out.println(map.isEmpty());

		m1 = null;
		m2=null;
		System.gc();
Thread.sleep(10000);
		System.out.println(map.isEmpty());

	}

}
