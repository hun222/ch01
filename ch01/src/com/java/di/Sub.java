package com.java.di;

public class Sub {
	private String str;
	private float su;
	
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public void setSu(float su) {
		this.su = su;
	}

	public void disp() {
		System.out.println(str+","+su);
	}
	
	
}
