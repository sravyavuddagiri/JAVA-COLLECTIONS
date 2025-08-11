package com.app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Student3
{
	int roll;
	String name,branch;
	int total;
	double cgpa;
	Student3(int roll,String name,String branch,int total,double cgpa)
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

class sortByName implements Comparator<Student3>
{
	public int compare(Student3 s1,Student3 s2)
	{
		if(s1.name.compareTo(s2.name)==0)
		{
			return 0;
		}
		else if(s1.name.compareTo(s2.name)>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class RecName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student3 s[]=new Student3[n];
		for(int i=0;i<n;i++)
		{
			int roll=sc.nextInt();
			String name=sc.next();
			String branch=sc.next();
			int total=sc.nextInt();
			double cgpa=sc.nextDouble();
			Student3 s1=new Student3(roll,name,branch,total,cgpa);
			s[i]=s1;
		}
		Arrays.sort(s, new sortByName());
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
