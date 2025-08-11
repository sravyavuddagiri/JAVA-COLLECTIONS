package com.app;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Student8
{
	int roll;
	String name,branch;
	int total;
	double cgpa;
	Student8(int roll,String name,String branch,int total,double cgpa)
	{
		this.roll=roll;
		this.name=name;
		this.branch=branch;
		this.total=total;
		this.cgpa=cgpa;
	}
	public String toString() {
		return "Roll: " + roll + ", Name: " + name + ", Branch: " + branch + ", Total: " + total + ", CGPA: " + cgpa;
	}
}

class sortByRoll7 implements Comparator<Student8>
{
	public int compare(Student8 s1,Student8 s2)
	{
		if(s2.total==s1.total)
		{
			return 0;
		}
		else if(s2.total>s1.total)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class RecTotalDo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student8[] al=new Student8[n];
		for(int i=0;i<n;i++)
		{
			int roll=sc.nextInt();
			String name=sc.next();
			String branch=sc.next();
			int total=sc.nextInt();
			double cgpa=sc.nextDouble();
			Student8 s1=new Student8(roll,name,branch,total,cgpa);
			al[i]=s1;
		}
		Arrays.sort(al, new sortByRoll7());
		for(int i=0;i<al.length;i++)
		{
			System.out.println(al[i]);
		}
	}
}