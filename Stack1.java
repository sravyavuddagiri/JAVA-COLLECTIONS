package com.app;
import java.util.Stack;
public class Stack1 {
      public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		for(int x:st)
		{
			System.out.println(x+" ");
		}
	}
}
