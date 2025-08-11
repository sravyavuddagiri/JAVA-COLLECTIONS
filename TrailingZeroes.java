package com.app;
import java.util.Scanner;
public class TrailingZeroes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		if(n<=4)
		{
			System.out.println(0);

		}
		else
		{
			int i=5;
			while(n/i>=1)
			{
				count=count+n/i;
				i=5*i;
			}
			System.out.println(count);

		}
	}
}
