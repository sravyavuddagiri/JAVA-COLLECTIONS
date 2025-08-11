package com.app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Student
{
	int roll;
	String name,branch;
	int total;
	double cgpa;
	Student(int roll,String name,String branch,int total,double cgpa)
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

class sortByRoll implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.roll==s2.roll)
		{
			return 0;
		}
		else if(s1.roll>s2.roll)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class RecRoll {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Student> al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int roll=sc.nextInt();
			String name=sc.next();
			String branch=sc.next();
			int total=sc.nextInt();
			double cgpa=sc.nextDouble();
			Student s1=new Student(roll,name,branch,total,cgpa);
			al.add(s1);
		}
		Collections.sort(al, new sortByRoll());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
}
