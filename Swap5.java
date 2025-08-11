package com.app;
public class Swap5 {
	public static void main(String[] args) {
		int a=15;
		int b=50;
		a = (a + b) - (b = a);
		System.out.println(a);
		System.out.println(b);
	}
}
