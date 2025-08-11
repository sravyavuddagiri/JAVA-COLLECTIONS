package com.app;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class PrimeFactHashMap {
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
			HashMap<Integer,Integer> hm=new HashMap<>();
			int n=sc.nextInt();
			int c=0;
			if(n%2==0)
			{
				while(n%2==0)
				{
					c++;
					n=n/2;
				}
			}
			if(!hm.containsKey(2))
			{
				hm.put(2,c);
			}
			for(int i=3;i*i<=n;i=i+2)
			{
			    c=0;
				while(n%i==0)
				{
					n=n/i;
                    c++;
					if(!hm.containsKey(i))
					{
						hm.put(i,1);
					}
					else
					{
						hm.put(i,hm.get(i)+1);
					}
				}
			}
			if(n>1)
			{
				hm.put(n,1);
			}
			Set<Integer> s1=hm.keySet();
			for(int x:s1)
			{
				System.out.println(x+" "+hm.get(x));
			}
		}
}
