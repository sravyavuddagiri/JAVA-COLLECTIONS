package com.app;
import java.util.Scanner;
public class Ps2 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i*i<=n)
		{
			if(i*i==n)
			{
				System.out.println("yes");
				break;
			}
			i++;
		}
		if(i*i>n)
		System.out.println("no");
	}
}
