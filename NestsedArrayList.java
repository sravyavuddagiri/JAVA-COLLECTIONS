package com.app;
import java.util.ArrayList;
import java.util.Scanner;
public class NestsedArrayList {
       public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<ArrayList<Integer>> al=new ArrayList<>(3);
		int c=0;
		if(n%2==0)
		{
			ArrayList<Integer>  arr=new ArrayList<>();
			while(n%2==0)
			{
				c++;
				n=n/2;
			}
			arr.add(2);
			arr.add(c);
			al.add(arr);
		}
		for(int i=3;i*i<=n;i=i+2)
		{
			int s=0;
			ArrayList<Integer> pair=new ArrayList<>();
			while(n%i==0)
			{
				s++;
				n=n/i;
			}
			pair.add(i);
			pair.add(s);
			al.add(pair);
		}
		if (n > 1) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(n);
            pair.add(1);
            al.add(pair);
        }
		System.out.println(al);
	}
}
