package com.app;
import java.util.Scanner;
public class Prime4 {
       public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean prime=true;
		if(n<=1)
		{
			System.out.println("not a prime");
		}
		for(int i=2;i*i<n;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
		}
		if(prime==true)
		{
			System.out.println("yes prime");
		}
		else
		{
			System.out.println("not a prime");
		}
	}
}
