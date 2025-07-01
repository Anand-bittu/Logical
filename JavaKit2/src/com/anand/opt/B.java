package com.anand.opt;

public class B  extends A {

	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		B b2=(B)a1;
	}
}
