package com.app;
public class Swap6 {
      public static void main(String[] args) {
		int a=20;
		int b=30;
		a=a^b^(b=a);
		System.out.println(a);
		System.out.println(b);
	}
}
