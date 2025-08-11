package com.app;
import java.util.LinkedList;
public class ForLoop {
     public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i)+"");
		}
	}
}
