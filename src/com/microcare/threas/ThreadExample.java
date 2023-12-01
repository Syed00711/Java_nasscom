package com.microcare.threas;

import java.time.LocalDateTime;

public class ThreadExample implements Runnable{
	
	public  void show() {
		System.out.println("Start"+Thread.currentThread().getName()+"==="+LocalDateTime.now());
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Running"+Thread.currentThread().getName()+"==="+LocalDateTime.now());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end"+Thread.currentThread().getName()+"==="+LocalDateTime.now());
		
	}
	
	public void run() {
		 show();
		
	}

	public static void main(String[] args) {
	
		for(int i=0;i<5;i++) {
			Thread th =new Thread(new ThreadExample());
			
			th.start();
		}
	
		
	}

}
