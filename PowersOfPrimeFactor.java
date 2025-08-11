package com.app;
import java.util.ArrayList;
import java.util.Scanner;
public class PowersOfPrimeFactor {
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	ArrayList<Integer> al=new ArrayList<>();
            int n=sc.nextInt();
            int c=0;
            int s=0;
            while(n%2==0)
            {
                c=c+1;
            	 n=n/2;
            }
            s=s+c;
            for(int i=3;i*i<=n;i=i+2)
            {
            	c=0;
            	while(n%i==0)
            	{
            		c=c+1;
            		n=n/i;
            	}
            	s=s+c;
            }
            if(n>1)
            {
            	s=s+1;
            }
            System.out.println(s);
		}
}
