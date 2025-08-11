package com.app;
import java.util.ArrayList;
import java.util.Scanner;
public class UniquePf {
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	ArrayList<Integer> al=new ArrayList<>();
            int n=sc.nextInt();
            while(n%2==0)
            {
            	if(!al.contains(2))
                   al.add(2);
            	 n=n/2;
            }
            
            for(int i=3;i*i<=n;i=i+2)
            {
            	while(n%i==0)
            	{
            		if(!al.contains(i))
            		   al.add(i);
            		n=n/i;
            	}
            }
            for(int i=0;i<al.size();i++)
            {
            	System.out.println(al.get(i)+"");
            }
		}
}
