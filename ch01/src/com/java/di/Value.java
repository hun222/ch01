package com.java.di;

public class Value {
	private int x;
	private int y;
	
	public Value(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void print() {
		System.out.println(x+"\t"+y);
	}
}
