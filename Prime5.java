package com.app;
import java.util.Scanner;
public class Prime5 {
       public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=1)
		{
			System.out.println("not prime");
			return;
		}
		if(n%2==0 || n%3==0)
		{
			System.out.println("not prime");
			return;
		}
		if(n==2 || n==3)
		{
			System.out.println("not prime");
			return;
		}
		for(int i=5;i*i<n;i=i+6)
		{
			if(n%i==0||n%(i+2)==0)
			{
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("yes prime");
		
	}
}
