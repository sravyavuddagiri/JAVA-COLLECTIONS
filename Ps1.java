package com.app;
import java.util.Scanner;
public class Ps1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
		double x=Math.sqrt(n);
		int a=(int) Math.floor(x);
		int b=(int) Math.ceil(x);
		if(a==b)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
