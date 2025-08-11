package com.app;
public class GcdArray1 {
	static int gcd(int arr,int res)
	{
		while(arr%res!=0)
		{
			int r=arr%res;
			arr=res;
			res=r;
		}
		return res;
	}
	public static void main(String[] args)
	{
		int[] arr= {2,4,6,8};
		int val;
		int a=arr[0];
		int b=arr[1];
		while(b%a!=0)
		{
		    val=b%a;
			b=a;
			a=val;
		}
		int res=a;
		for(int i=1;i<arr.length-1;i++)
		{
			res=gcd(arr[i+1],res);
			gcd(arr[i+1],res);
		}
		System.out.println(res);
	}
}
