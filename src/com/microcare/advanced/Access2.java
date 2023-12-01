package com.microcare.advanced;

import Inheritance.A;
import Inheritance.AbstractionExample;
import Inheritance.B;
import Inheritance.C;
import Inheritance.D;
import Inheritance.InterfaceExample;

public  class Access2 extends AbstractionExample{
	
	public static void main(String[] args) {
		
		B b =new B(100);
		
		
		
		
		/*Account ac=new Account();
		ac.setBalance(6000);
		
		
		System.out.println("minimum balance==="+ac.getMinBalance());
		
		ac.setBalance(3000);
		System.out.println(ac.getBalance());
		
		InterfaceExample IE =new D();
		InterfaceExample IE1 =new C();
		System.out.println(IE.check(null, null));
		System.out.println(IE1.check(null, null));
		//ac.setBalance(3000);
		
		System.out.println(ConstExample.satcheck());
		
		ConstExample c1= new ConstExample();
		ConstExample c2= new ConstExample();
		ConstExample c3= new ConstExample();
		
		
		
	//System.out.println(c1.age+c1.name+c1.course+c1.extra);
		
		
		//ConstExample c2=new ConstExample(10,"Arun",".net");
	//System.out.println(c2.age+c2.name+c2.course+c2.extra);
		*/
	}

	@Override
	public void valid() {
		System.out.println("Abstract method valid");
		
	}

	@Override
	public int check1() {
		System.out.println("Abstract method check");
		return 0;
	}

}
