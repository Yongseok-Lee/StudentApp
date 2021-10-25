package com.example.lab2;

import java.util.List;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		// Create an arraylist of user-defined class objects
		List<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Kim", 23);
		al.add(s1);  // Adding a Student class object
		Student s2 = new Student(102, "Lee", 21);
		al.add(s2);  // Adding a Student class object
		al.add(new Student(103, "Park", 25));  // Adding a Student class object
		
		// Traverse elements of the arraylist (method #1)
		for (Student s: al)
		{
			System.out.println(s.toString());
		}
		
		// Remove an object from the arraylist
		al.remove(s2);
		System.out.println("One student removed!");
		
		// Traverse elements of the arraylist (method #2)
		for (int i = 0; i < al.size(); ++i)
		{
			System.out.println(al.get(i).toString());
		}
	}
}