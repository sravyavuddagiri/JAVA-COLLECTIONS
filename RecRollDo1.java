package com.app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Student1
{
	int roll;
	String name,branch;
	int total;
	double cgpa;
	Student1(int roll,String name,String branch,int total,double cgpa)
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

class sortByRoll1 implements Comparator<Student1>
{
	public int compare(Student1 s1,Student1 s2)
	{
		if(s2.roll==s1.roll)
		{
			return 0;
		}
		else if(s2.roll>s1.roll)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class RecRollDo1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student1 s[]=new Student1[n];
		for(int i=0;i<n;i++)
		{
			int roll=sc.nextInt();
			String name=sc.next();
			String branch=sc.next();
			int total=sc.nextInt();
			double cgpa=sc.nextDouble();
			Student1 s1=new Student1(roll,name,branch,total,cgpa);
			s[i]=s1;
		}
		Arrays.sort(s, new sortByRoll1());

		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
