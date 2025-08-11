package com.app;
import java.util.Scanner;
public class LcmGcd {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int oa=m;
        int ob=n;
        while(n%m!=0)
        {
        	int rem=n%m;
			n=m;
			m=rem;
        }
        int gcd=m;
        int lcm=(oa*ob)/gcd;
        System.out.println("lcm is"+lcm+"gcd is"+gcd);
        
      }
}
