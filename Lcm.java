package com.app;
import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
    	int lcm1=0;
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int max=Math.max(m, n);
		int y=Math.min(m,n);
		for(int i=max;i<=m*n;i=i+max)
		{
			if(i%y==0)
			{
				lcm1=i;
				break;
			}
		}
		System.out.println("lcm is"+lcm1);
	}
}
