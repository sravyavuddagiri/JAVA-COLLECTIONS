package com.app;
import java.util.Scanner;
public class ReplaceString2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  String str=Integer.toString(n);
		  String newstr="";
		  for(int i=0;i<str.length();i++)
		  {
			  if(str.charAt(i)=='0')
			  {
				  newstr+='5';
			  }
			  else
			  {
				  newstr+=str.charAt(i);
			  }
		  }
		  int newnum = Integer.parseInt(newstr);
	      System.out.println(newnum);
	}
  
}
