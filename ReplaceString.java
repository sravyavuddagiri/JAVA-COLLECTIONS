package com.app;
import java.util.Scanner;
public class ReplaceString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  String str=Integer.toString(n);
		  String newstr=str.replace('0', '5');
		  int newnum = Integer.parseInt(newstr);
		  System.out.println(newnum);
	}
  
}
