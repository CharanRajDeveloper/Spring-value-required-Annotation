package com.spring.loadingdatafrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	/* @Value("${student.name}") */
	private String studentName;
	/* @Value("${student.interestedcourse}") */
	private String interestedCourse;
	/* @Value("${student.hobby}") */
	// we can't use @required at properties
	private String hobby;

	public String getStudentName() {
		return studentName;
	}
    @Required
	@Value("${student.name}")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getInterestedCourse() {
		return interestedCourse;
	}

	@Required
	@Value("${student.interestedcourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	public String getHobby() {
		return hobby;
	}

	@Required
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void displayStudentInfo() {
		System.out.println("Student Name:" + studentName);
		System.out.println("Student InterestedCourse:" + interestedCourse);
		System.out.println("Student Hobby:" + hobby);
	}

}
