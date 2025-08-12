package com.app;
import java.util.Stack;
import java.util.ListIterator;
public class Stack3 {
      public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		ListIterator it=st.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
	}
}
