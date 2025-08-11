package com.app;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Student0
{
	int roll;
	String name,branch;
	int total;
	double cgpa;
	Student0(int roll,String name,String branch,int total,double cgpa)
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

class sortByRoll0 implements Comparator<Student0>
{
	public int compare(Student0 s1,Student0 s2)
	{
		if(s2.cgpa==s1.cgpa)
		{
			return 0;
		}
		else if(s2.cgpa>s1.cgpa)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class RecCgpaDo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student0[] al=new Student0[n];
		for(int i=0;i<n;i++)
		{
			int roll=sc.nextInt();
			String name=sc.next();
			String branch=sc.next();
			int total=sc.nextInt();
			double cgpa=sc.nextDouble();
			Student0 s1=new Student0(roll,name,branch,total,cgpa);
			al[i]=s1;
		}
		Arrays.sort(al, new sortByRoll0());
		for(int i=0;i<al.length;i++)
		{
			System.out.println(al[i]);
		}
	}
}
