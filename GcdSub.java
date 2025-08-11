package com.app;
import java.util.Scanner;
public class GcdSub {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		while((m-n)!=0)
		{
			if(m>n)
			{
				m=m-n;
			}
			else
			{
				n=n-m;
			}
		}
		System.out.println("gcd is"+m);
	}
}
