package com.app;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
public class LinkedHashMap4 {
       public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {4,4,5,3,4,7,7,7};
		LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			  if(!hm.containsKey(arr[i]))
			  {
				  hm.put(arr[i], 1);
			  }
			  else
			  {
				  hm.put(arr[i], hm.get(arr[i])+1);
			  }
		}
		Set<Integer> s1=hm.keySet();
		for(int x:s1)
		{
			System.out.println(x+" "+hm.get(x));
				
		}
	}
}
