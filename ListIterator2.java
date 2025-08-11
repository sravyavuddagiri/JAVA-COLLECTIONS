package com.app;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIterator2 {
     public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		ListIterator it=obj.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+"");
		}
	}
}
