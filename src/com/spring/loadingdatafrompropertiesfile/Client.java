package com.spring.loadingdatafrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
 public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	Student student=context.getBean("studentInfo",Student.class);
    student.displayStudentInfo();
}
}
