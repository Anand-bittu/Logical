package com.anand.opt;

public class Cloneing implements Cloneable {
	static {
		System.out.println("Cloning Static");
	}
	{
		System.out.println("IB of Cloning");
	}
	public Cloneing() {
           System.out.println("0 parameter");
	}
	public Cloneing getCloning()throws CloneNotSupportedException {
		return (Cloneing)this.clone();
	}
	public static void main(String[] args)throws CloneNotSupportedException {
		Cloneing c1=new Cloneing();
		Cloneing c2=c1.getCloning();
		System.out.println(c1.hashCode()+" "+c2.hashCode());
		
	}
	
}
