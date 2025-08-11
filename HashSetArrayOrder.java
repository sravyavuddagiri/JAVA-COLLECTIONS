package com.app;
import java.util.LinkedHashSet;
public class HashSetArrayOrder {
         public static void main(String[] args) {
        	 int[] arr= {4,4,5,3,4,7,7,7,1,1};
        	 LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        	 for(int i=0;i<arr.length;i++)
        	 {
        		 hs.add(arr[i]);
        	 }
        	 for(int x:hs)
        	 {
        		 System.out.println(x+"");
        	 }	 
		}
}
