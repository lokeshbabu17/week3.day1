package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentname() {
		System.out.println("lokesh");

	}
	public void studentDept() {
		System.out.println("my dept is ECE");

	}
	public void studentid() {
		System.out.println("id is 1234567");

	}
         public static void main(String[] args) {
			
        	 Student my=new Student();
     		my.studentname();
     		my.studentDept();
     		my.studentid();
     		my.collegecode();
     		my.collegename();
     		my.collegeRank();
     		my.deptname();
		}
}
