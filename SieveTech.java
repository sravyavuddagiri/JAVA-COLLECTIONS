package com.app;
import java.util.Scanner;
public class SieveTech {
       public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
		boolean[] arr=new boolean[n+1];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=true;
		}
		arr[0]=false;
		arr[1]=false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(arr[i]==true)
			{
				for(int j=i*i;j<=n;j=j+i)
				{
					arr[j]=false;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==true)
			{
				System.out.println(i+"");
			}
		}
	}
}
