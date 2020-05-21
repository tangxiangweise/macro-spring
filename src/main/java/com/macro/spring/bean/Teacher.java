package com.macro.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {

	@Autowired
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
