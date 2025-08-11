package com.app;
import java.util.Scanner;
public class Ps3 {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int y=(int)Math.sqrt(n);
		if(y*y==n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
