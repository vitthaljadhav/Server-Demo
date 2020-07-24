package com.info.app;
interface I1{
	public static final String st="";
	
	public static void m1() {
		System.out.println("m1 static  in I1");
	}
	
	default void m2() {
		System.out.println("m2 non static  in  I1");
	}
}
abstract class OverLoadDemo  implements I1{
public static final String str="";
	
	public OverLoadDemo() {
		System.out.println("It is Abstarct Const");
	}

	public OverLoadDemo(int a, int b) {
		System.out.println(" a is :" + a + " B is :" + b);
	}
}

class OverLoadChild extends OverLoadDemo {
	public OverLoadChild() {
		super();
	}
	public OverLoadChild(int a, int b) {
		//super(a,b);
	}
}

public class Test {
	public static void main(String[] args) {
		OverLoadChild overLoadChild = new OverLoadChild();
		OverLoadChild overLoadChild1= new OverLoadChild(10,20);
		overLoadChild1.m2();
		I1.m1();
	}
}
