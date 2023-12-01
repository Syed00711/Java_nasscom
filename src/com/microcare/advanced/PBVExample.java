package com.microcare.advanced;

public class PBVExample {

	public static void main(String[] args) throws InterruptedException {
		DogExample a=new DogExample("Tom");
		DogExample e=new DogExample("E");
		DogExample b=a;
		System.out.println(b.getName());
		a.setName("TOM1");
		System.out.println(b.getName());
		checkObject(new DogExample("E"));
		b=null;
		System.gc();
		Thread.sleep(90000000);
	}
	
	
	static void checkObject(DogExample c) {
		System.out.println(c.getName());
		DogExample d =new DogExample("D");
		c=d;
		c.setName("C");
	}

}
