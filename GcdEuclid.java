package com.app;
import java.util.Scanner;
public class GcdEuclid {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
		int n=sc.nextInt();
		while(n%m!=0)
		{
			int rem=n%m;
			n=m;
			m=rem;
		}
		System.out.println("gcd is"+m);
	}
}
