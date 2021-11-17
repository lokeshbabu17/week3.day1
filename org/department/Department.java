package org.department;

import org.college.College;

public class Department extends College  {

	public void deptname() {
		System.out.println("department is ECE");

	}
	public static void main(String[] args) {
		
		Department my =new Department();
		
		my.deptname();
		my.collegename();
		my.collegecode();
		my.collegeRank();
		
		
	}

		
	
}
