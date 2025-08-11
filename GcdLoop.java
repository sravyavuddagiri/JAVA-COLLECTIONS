package com.app;
import java.util.*;
public class GcdLoop {
       public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int min=Math.min(m, n);
		for(int i=min;i>=1;i--)
		{
			if(m%i==0 && n%i==0)
			{
				int gcd=i;
				System.out.println(gcd);
				break;
	
			}
		}
		
		
	}
}
