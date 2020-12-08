package com.demo.inbuitsort;

public class Student implements Comparable<Student> {

	int num;
	String firstname;
	String lastname;
	public Student(int num,String firstname,String lastname) {
		this.num=num;
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String toString() {
		return " { num : "+this.num+" , firstname : "+this.firstname+" , lastname : "+this.lastname +" }";
	}

	@Override
	public int compareTo(Student stu) {
		System.out.println(this.getFirstname());
		return this.getFirstname().compareTo(stu.firstname);
	}

}
