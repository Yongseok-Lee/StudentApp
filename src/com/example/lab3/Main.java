package com.example.lab3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

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
		al.add(new Student(104, "Choi", 20));
		al.add(new Student(105, "Jeong", 22));
		al.add(new Student(106, "Jang", 24));
		al.add(new Student(107, "Jo", 23));
		al.add(new Student(108, "Bae", 26));
		al.add(new Student(109, "Cha", 24));
		al.add(new Student(110, "Seo", 31));
		
		// Traverse elements of the arraylist (ordered) 
		System.out.println("Student List (ordered by name)");
		Collections.sort(al);
		
		for (Student s: al)
		{
			System.out.println(s.toString());
		}
		
		// Traverse elements of the arraylist (reverse ordered)
		System.out.println("Student List (reverse ordered by name)");
		Collections.sort(al, Collections.reverseOrder());
		
		for (int i = 0; i < al.size(); ++i)
		{
			System.out.println(al.get(i).toString());
		}
	}
}