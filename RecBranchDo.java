package com.app;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Student6
{
	int roll;
	String name,branch;
	int total;
	double cgpa;
	Student6(int roll,String name,String branch,int total,double cgpa)
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

class sortByName5 implements Comparator<Student6>
{
	public int compare(Student6 s1,Student6 s2)
	{
		if(s2.branch.compareTo(s1.branch)==0)
		{
			return 0;
		}
		else if(s2.branch.compareTo(s1.branch)>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class RecBranchDo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student6[] al=new Student6[n];
		for(int i=0;i<n;i++)
		{
			int roll=sc.nextInt();
			String name=sc.next();
			String branch=sc.next();
			int total=sc.nextInt();
			double cgpa=sc.nextDouble();
			Student6 s1=new Student6(roll,name,branch,total,cgpa);
			al[i]=s1;
		}
		Arrays.sort(al, new sortByName5());
		for(int i=0;i<al.length;i++)
		{
			System.out.println(al[i]);
		}
	}
}
