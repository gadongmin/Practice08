package com.javaex.ex05;

public class Sub {

	private int a;
	private int b;

	public Sub() {}
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a - b;
	}
}
