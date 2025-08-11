package com.app;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;
public class TreeMap2 {
       public static void main(String[] args) {
		int[] arr= {4,4,5,3,4,7,7,7};
		TreeMap<Integer,Integer> ts=new TreeMap<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			  if(!ts.containsKey(arr[i]))
			  {
				  ts.put(arr[i], 1);
			  }
			  else
			  {
				  ts.put(arr[i], ts.get(arr[i])+1);
			  }
		}
		Set<Integer> s1=ts.keySet();
		for(int x:s1)
		{
			System.out.println(x+" "+ts.get(x));
				
		}
	}
}
