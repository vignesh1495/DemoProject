package com.demo.inbuitsort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Javasort {

	public static void main(String[] args) {
		
		
		
		
		Student s1= new Student(101,"Virender","Shewag");
		Student s2=new Student(102,"Sachin","Tendulkar");
		Student s3=new Student(103,"Ajit","Agarkar");
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		sortingInOrder(students);
		
		Collections.sort(students,new Comparator<Student>() {

		
			public int compare( Student std1, Student std2) {
				if( std1.getNum()>std2.getNum()){
					return 1;
				}else if ( std1.getNum()<std2.getNum()) {
					return -1;
				}
				return 0;
			}

			

		
			
		});
		sortingInOrder(students);
		
		try {
		throw new Error();
		}finally {
			System.out.println("finally");
		}
	}

	private static<T> void sortingInOrder(List<T> students) {
	
		for (T stu : students) {
			System.out.println(stu);
		}
		
	}

}
