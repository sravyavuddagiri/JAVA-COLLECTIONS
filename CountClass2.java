package com.app;
import java.util.Scanner;
public class CountClass2 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		count=count+1;
		System.out.println(count);
	}
}
