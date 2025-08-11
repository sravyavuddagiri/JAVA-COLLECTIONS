package com.app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Student4
{
	int roll;
	String name,branch;
	int total;
	double cgpa;
	Student4(int roll,String name,String branch,int total,double cgpa)
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

class sortByName3 implements Comparator<Student4>
{
	public int compare(Student4 s1,Student4 s2)
	{
		if(s2.name.compareTo(s1.name)==0)
		{
			return 0;
		}
		else if(s2.name.compareTo(s1.name)>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class RecNameDo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student4[] arr=new Student4[n];
		for(int i=0;i<n;i++)
		{
			int roll=sc.nextInt();
			String name=sc.next();
			String branch=sc.next();
			int total=sc.nextInt();
			double cgpa=sc.nextDouble();
			Student4 s1=new Student4(roll,name,branch,total,cgpa);
			arr[i]=s1;
		}
		Arrays.sort(arr, new sortByName3());
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
