package com.app;
import java.util.Scanner;
public class Nprime3
{
      public static void main(String[] args) 
      {
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int c=0;
		  for(int i=1;i<=n;i++)
		  {
			  if(isPrime(i))
			  {
				  System.out.println(i);
			  }
		  }
	   }
      static boolean isPrime(int n)
      {
    	  int c=0;
    	  for(int i=1;i<=Math.sqrt(n);i++)
    	  {
    		  if(n%i==0)
    		  {
    			  c=c+1;
    			  if(n/i!=i)
    			  {
    				  c=c+1;
    			  }
    		  }
    	  }
    	  if(c==2)
    	  {
    		  return true;
    	  }
    	  else
    	  {
    		  return false;
    	  }
      }
}
