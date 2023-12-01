package com.microcare.threas;

import java.time.LocalDateTime;

public class ThreadExample1 {
	
	public static void show() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		for(int i=0;i<5;i++) {
			ThreadExample1 te=new ThreadExample1();
			te.show();
		}
		System.out.println(LocalDateTime.now());
	}

}
