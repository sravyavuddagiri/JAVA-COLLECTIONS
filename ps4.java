package com.app;
import java.util.Scanner;
public class ps4 {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=1;
		int h=n;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(m*m==n)
			{
				System.out.println("yes");
				break;
			}
			else if (m*m<n)
			{
				l=l+1;
			}
			else
			{
				h=h-1;
			}
				
		}
		if(l>h)
		System.out.println("no");
	}
}

	